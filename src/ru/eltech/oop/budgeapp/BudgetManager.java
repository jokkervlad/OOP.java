package ru.eltech.oop.budgeapp;

import java.awt.*;
import java.util.List;
import java.util.Set;

public interface BudgetManager {
    Category EMPTY = new Category("Без категории", Color.WHITE, "");


    Category createCategory(String name, Color color, String icon);

    Category createCategory(String name, Color color, String icon, Category parent);

    void removeCategory(Category category);

    Set<Category> getAllCategories();

    void addTransaction(Transaction transaction);

    void removeTransaction(Transaction transaction);

    List<Transaction> getAllTransactions();

    List<Transaction> getTransactions(Request request);

}
