package cn.msss.service;

import cn.msss.dao.UserDao;

public class UserServiceimpl  implements UserService{



    //被容器注入对象
    UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public String method() {
        //System.out.println("进入serviceimpl方法实现"+(5/0)); //设置出项异常，进入异常通知
        System.out.println("进入serviceimpl方法实现");
        return dao.method();
    }

    @Override
    public String mes() {
        System.out.println("测试顾问");
        return "测试顾问";
    }
}
