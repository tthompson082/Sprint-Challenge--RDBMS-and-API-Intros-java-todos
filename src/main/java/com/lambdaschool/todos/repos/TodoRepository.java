package com.lambdaschool.todos.repos;

import com.lambdaschool.todos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>
{
}
