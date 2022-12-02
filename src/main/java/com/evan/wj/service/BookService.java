package com.evan.wj.service;

import com.evan.wj.dao.BookDAO;
import com.evan.wj.dao.CategoryDAO;
import com.evan.wj.pojo.Book;
import com.evan.wj.pojo.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuxiaolei
 * @date 2022/8/9 15:22
 * @description：书籍Service
 */
@Slf4j
@Service
public class BookService {


    //相同点：1、@Autowired与@Resource都可以用来装配bean. 都可以写在字段上,或写在setter方法上。
    //不同点：@Autowired默认按类型装配（这个注解是属业spring的），默认情况下必须要求依赖对象必须存在，如果要允许null 值，可以设置它的required属性为false，如：@Autowired(required=false) ，
    // 如果我们想使用名称装配可以结合@Qualifier注解进行使用，如下：
    // @Autowired() @Qualifier(“baseDao”)
    //private BaseDao baseDao;

    //@Resource（这个注解属于J2EE的），默认安照名称进行装配，名称可以通过name属性进行指定，
    //如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在setter方法上默认取属性名进行装配。 当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。
    //Java代码 收藏代码
    // @Resource(name=“baseDao”)
    // private BaseDao baseDao;
    //
    // 推荐使用：@Resource注解在字段上，且这个注解是属于J2EE的，减少了与spring的耦合。最重要的这样代码看起就比较优雅。

    @Resource(name = "bookDAO")
    private BookDAO bookDAO;
    @Autowired
    private CategoryDAO categoryDAO;

    /**
     * 查询所有的数据列表
     *
     * @return
     */
    public List<Book> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookDAO.findAll(sort);
    }

    /**
     * 新增或者编辑书籍信息、
     *
     * @param book
     */
    public void saveOrUpdate(Book book) {
        bookDAO.save(book);
    }

    /**
     * 通过id删除书籍信息
     *
     * @param id
     */
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    /**
     * 通过分类查询书籍信息列表
     *
     * @param cid
     * @return
     */
    public List<Book> listByCategory(int cid) {
        Category category = categoryDAO.getOne(cid);
        List<Book> bookList = bookDAO.findAllByCategory(category);
        return bookList;
    }


}
