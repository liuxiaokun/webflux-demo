package com.example.webflux.base;

import lombok.Data;

import java.util.List;

@Data
public class ROL<T> {

    private Integer code;
    private String mesage;
    private List<T> data;
}
