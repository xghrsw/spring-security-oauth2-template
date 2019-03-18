package com.kuoncat.oauth2.authorizationcode.resourceserver.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Category {

    private Integer id;

    private String name;

}
