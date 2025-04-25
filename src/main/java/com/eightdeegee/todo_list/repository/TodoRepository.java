package com.eightdeegee.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eightdeegee.todo_list.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
