package com.example.webflux.base;

import lombok.Builder;
import lombok.Data;

@Data
public class RO<T> {

    private Integer code;
    private String mesage;
    private T data;
}
