package com.operation;

import com.book.Book;
import com.book.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入你要删除的书籍名称");
        String name = scan.next();
        int i = 0;
        Book book = null;
        for(;i<bookList.getUsedSize();i++){
            if(book.getName().equals(name)){
                break;
            }
        }
        if(i == bookList.getUsedSize() ){
            System.out.println("没有此书");
            return;
        }

        //i号下标的书籍就是要删除的书籍
        for (int j = i;j < bookList.getUsedSize()-1;j++){
            //后一个覆盖前一个
            //[j]-->[j+1]
            book = bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        int curSize = bookList.getUsedSize();
        bookList.setUsedSize(curSize-1);
        System.out.println("删除成功");
    }
}
