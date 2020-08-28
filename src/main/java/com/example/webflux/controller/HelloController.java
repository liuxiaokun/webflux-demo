package com.example.webflux.controller;

import com.example.webflux.base.RO;
import com.example.webflux.base.ROL;
import com.example.webflux.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class HelloController {

    @GetMapping("mono")
    public Mono<RO<User>> mono() {
        User user = new User();
        user.setId(200L);
        user.setName("Fred");

        RO ro = new RO();
        ro.setCode(1);
        ro.setMesage("操作成功");
        ro.setData(user);
        return Mono.just(ro);
    }

    @GetMapping("flux")
    public Flux<User> flux() {
        User user1 = new User();
        user1.setId(200L);
        user1.setName("Fred");

        User user2 = new User();
        user2.setId(100L);
        user2.setName("Wills");
        return Flux.just(user1, user2);
    }

    @GetMapping("mono/list")
    public Mono<ROL<User>> monoList() {

        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(200L);
        user1.setName("Fred");
        list.add(user1);

        User user2 = new User();
        user2.setId(100L);
        user2.setName("Wills");
        list.add(user2);

        ROL<User> rol = new ROL<>();
        rol.setCode(1);
        rol.setMesage("操作成功");
        rol.setData(list);

        return Mono.just(rol);
    }
}