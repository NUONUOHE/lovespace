package com.jh.lovespace.dal.entity;

import lombok.*;

/**
 *
 *   表名: user
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    /**
     *   字段: id
     */
    private Integer id;

    /**
     *   字段: user_name
     */
    private String userName;

    /**
     *   字段: user_password
     */
    private String userPassword;
}