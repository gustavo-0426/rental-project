package com.co.softworld.controller;

import com.co.softworld.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserController {

    ResponseEntity<List<User>> findAll();

    ResponseEntity<User> findById(long id);

    ResponseEntity<User> save(User user);

    ResponseEntity<Void> delete(long id);
}
