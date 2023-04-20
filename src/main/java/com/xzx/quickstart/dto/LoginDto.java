package com.xzx.quickstart.dto;

import lombok.Data;

/**
 * 登录dto
 *
 * @author xzx
 * @date 2023/4/20
 */
@Data
public class LoginDto {

    private String username;
    private String password;
    private String code;
}
