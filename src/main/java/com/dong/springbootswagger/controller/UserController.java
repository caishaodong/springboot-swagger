package com.dong.springbootswagger.controller;

import com.dong.springbootswagger.common.ResObject;
import com.dong.springbootswagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 用户控制器
 * @Author: caishaodong
 * @Create: 2018-11-15 17:53:59
 **/
@Api(value = "用户controller", tags = {"用户操作接口"}, description = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "新增用户", notes = "新增用户接口")
    @PostMapping(value = "/create/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResObject createUser(@RequestBody User user) {
        System.out.println("createUser........" + user.toString());
        return new ResObject(HttpStatus.OK.value(), "新增成功");
    }

    @ApiOperation(value = "修改用户", notes = "修改用户接口")
    @PostMapping(value = "/update/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResObject updateUser(@RequestBody User user) {
        System.out.println("updateUser........" + user.toString());
        return new ResObject(HttpStatus.OK.value(), "修改成功");
    }

    @ApiOperation(value = "删除用户", notes = "删除用户接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "name", value = "用户姓名", required = true, paramType = "query", dataType = "String"))
    @DeleteMapping(value = "/delete/user")
    public ResObject deleteUser(String name) {
        System.out.println("deleteUser........" + "删除用户: " + name);
        return new ResObject(HttpStatus.OK.value(), "删除成功");
    }

    @ApiOperation(value = "查询用户", notes = "查询用户接口")
    @ApiImplicitParams(@ApiImplicitParam(name = "name", value = "用户姓名", required = true, paramType = "query", dataType = "String"))
    @GetMapping(value = "/query/user")
    public ResObject queryUser(String name) {
        System.out.println("queryUser........" + "查询用户");
        User user = new User(name, "123456", "杭州");
        return new ResObject(HttpStatus.OK.value(), user);
    }

}