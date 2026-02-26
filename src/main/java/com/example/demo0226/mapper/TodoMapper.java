package com.example.demo0226.mapper;

import com.example.demo0226.model.Todo;

import java.util.List;

public interface TodoMapper {
    List<Todo> findAll();

    int insert(Todo todo);
}
