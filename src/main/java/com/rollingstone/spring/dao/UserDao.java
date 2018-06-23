package com.rollingstone.spring.dao;

import java.util.List;

import com.rollingstone.spring.model.User;

public interface UserDao {

   long save(User user);

   User get(long id);

   List<User> list();

   void update(long id, User user);

   void delete(long id);

}
