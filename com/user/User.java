package com.user;

import com.book.BookList;
import com.operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] operations;
    public void doOperation(int choice, BookList bookList){
        operations[choice].work(bookList);
    }
    public abstract int menu();
}
