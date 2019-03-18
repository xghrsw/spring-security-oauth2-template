package com.kuoncat.oauth2.authorizationcode.resourceserver.entity;

import lombok.Data;

@Data
public class Book {

    private Integer id;

    private Integer categoryId;

    private String name;

}
