package com.dong.springbootswagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 用户实体类
 * @Author: caishaodong
 * @Create: 2018-11-15 17:58:32
 **/
@ApiModel(value = "用户类", description = "用户实体类")
public class User implements Serializable {

    @ApiModelProperty(value = "用户名", name = "username", example = "张三")
    private String name;

    @ApiModelProperty(value = "密码", name = "password", example = "123456")
    private String password;

    @ApiModelProperty(value = "地址", name = "address", example = "杭州")
    private String address;


    public User() {
    }

    public User(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}