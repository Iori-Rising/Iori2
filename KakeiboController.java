package com.example.kakeibo.controller;

import com.example.kakeibo.model.Expense;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class KakeiboController {

    private List<Expense> expenses = new ArrayList<>();

    // 支出を追加するエンドポイント
    @PostMapping("/add-expense")
    public String addExpense(@RequestBody Expense expense) {
        expenses.add(expense);
        return "支出が追加されました";
    }

    // 支出一覧を取得するエンドポイント
    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenses;
    }
}
