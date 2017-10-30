package com.example.mybatisdemo2.demo.dao;

import com.example.mybatisdemo2.demo.entity.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}