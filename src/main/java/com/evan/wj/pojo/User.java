package com.evan.wj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * @author liuxiaolei
 * @date 2022/6/16 15:58
 * @description：用户登录类
 */
@Data
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler", "hibernateLayInitalizer"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String username;
    private String password;


}
