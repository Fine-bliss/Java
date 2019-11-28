package com.operation;

import com.book.Book;
import com.book.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        System.out.println("请输入你要借阅的书籍");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for(;i< bookList.getUsedSize();i++){
            book = bookList.getBook(i);
            if(book.getName().equals(name) ){
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("没有此书");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed()){
            System.out.println("此书已经被借阅");
        }else{
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
