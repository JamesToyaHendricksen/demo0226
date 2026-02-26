package com.example.demo0226;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public String list(Model model) {
        List<TodoItem> todos = List.of(
                new TodoItem(1L, "Spring Bootプロジェクト作成", "完了"),
                new TodoItem(2L, "Controller実装", "進行中"),
                new TodoItem(3L, "一覧画面作成", "未着手")
        );

        model.addAttribute("todos", todos);
        return "todo/list";
    }

    @GetMapping("/new")
    public String newTodo() {
        return "todo/form";
    }

    @PostMapping("/confirm")
    public String confirm(@RequestParam("title") String title, Model model) {
        model.addAttribute("title", title);
        return "todo/confirm";
    }

    @PostMapping("/complete")
    public String complete(@RequestParam("title") String title, Model model) {
        model.addAttribute("title", title);
        return "todo/complete";
    }

    public record TodoItem(Long id, String title, String status) {
    }
}
