package org.example.java6nsu26sd21102.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.java6nsu26sd21102.entity.Todo;
import org.example.java6nsu26sd21102.repository.TodoRepository;
import org.example.java6nsu26sd21102.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findById(long id) {

        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public Todo add(Todo todo) {
        return null;
    }

    @Override
    public Todo update(Todo todo, long id) {
        return null;
    }

    @Override
    public Todo delete(long id) {
        return null;
    }
}
