package cn.msss.service;

import cn.msss.dao.UserDao;
import cn.msss.dao.UserDaoimpl;

public class UserServiceimpl implements UserService {


    /**
     * 之前写的方式
     *  UserDao dao=new UserDaoimpl();
        @Override
        public void method() {
            dao.method();
        }
     */



    /**
     * 使用Spring的方式
     *      1.创建属性对应的get，set方法，
     *
     */

    UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        System.out.println("进入Spring容器创建对象");
        this.dao = dao;
    }

    @Override
    public void method() {
        dao.method();
    }
}
