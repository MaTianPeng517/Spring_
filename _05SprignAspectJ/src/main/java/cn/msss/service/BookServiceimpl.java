package cn.msss.service;

import cn.msss.dao.BookDao;

public class BookServiceimpl implements BookService {


    BookDao dao;


    @Override
    public void eat() {
        dao.eat();
    }

    public BookDao getDao() {
        return dao;
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
