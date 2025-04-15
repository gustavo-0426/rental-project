package com.co.softworld.service;

import com.co.softworld.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> findAll();

    Optional<User> findById(long id);

    User save(User user);

    void delete(long id);
}
