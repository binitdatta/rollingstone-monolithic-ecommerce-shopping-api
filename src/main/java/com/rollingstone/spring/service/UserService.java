package com.rollingstone.spring.service;

import java.util.List;

import com.rollingstone.spring.model.User;

public interface UserService {

   long save(User user);
   User get(long id);
   List<User> list();
   void update(long id, User user);
   void delete(long id);
}
