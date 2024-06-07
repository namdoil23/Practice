package com.bit.springbootdemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private long id;
    private String username;
    private String password;
}
