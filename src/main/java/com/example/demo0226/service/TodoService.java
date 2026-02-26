package com.example.demo0226.service;

import com.example.demo0226.mapper.TodoMapper;
import com.example.demo0226.model.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoMapper todoMapper;

    public List<Todo> findAll() {
        return todoMapper.findAll();
    }

    public void insert(Todo todo) {
        todoMapper.insert(todo);
    }
}
