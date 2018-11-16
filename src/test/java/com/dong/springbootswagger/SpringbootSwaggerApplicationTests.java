package com.dong.springbootswagger;

import com.dong.springbootswagger.common.ResObject;
import com.dong.springbootswagger.controller.UserController;
import com.dong.springbootswagger.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootSwaggerApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void createUser() {
        User user = new User("张三", "123456", "杭州");
        ResObject resObject = this.testRestTemplate.postForObject("/user/create/user", user, ResObject.class);
        System.out.println("==========> createUser: " + resObject);
    }

    @Test
    public void updateUser() {
        User user = new User("李四", "123456", "上海");
        ResponseEntity<ResObject> entity = this.testRestTemplate.postForEntity("/user/update/user", user, ResObject.class);
        System.out.println("==========> updateUser: " + entity.getBody());
        System.out.println("==========> statusCode: " + entity.getStatusCode());
        System.out.println("==========> statusCodeValue: " + entity.getStatusCodeValue());
    }

    @Test
    public void deleteUser() {
        this.testRestTemplate.delete("/user/delete/user");
    }

}
