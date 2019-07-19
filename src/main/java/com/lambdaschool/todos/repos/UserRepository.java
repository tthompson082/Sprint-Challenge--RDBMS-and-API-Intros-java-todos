package com.lambdaschool.todos.repos;


import com.lambdaschool.todos.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
