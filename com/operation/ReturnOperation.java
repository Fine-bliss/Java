package com.operation;

import com.book.Book;
import com.book.BookList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        System.out.println("输入你所要归还的书籍名称");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for(;i < bookList.getUsedSize();i++){
            book = bookList.getBook(i);
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize()){
            System.out.println("没有此书");
            return;
        }
        book = bookList.getBook(i);
        if(book.isBorrowed() ){
            book.setBorrowed(false);
            System.out.println("此书归还成功");
        }else{
            book.setBorrowed(true);
            System.out.println("借阅成功");
        }
    }
}
