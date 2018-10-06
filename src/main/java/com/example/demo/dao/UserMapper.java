package com.example.demo.dao;

import com.example.demo.model.User;

public interface UserMapper {

    User selectByPrimaryKey(Long id);
}
