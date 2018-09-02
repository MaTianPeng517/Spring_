package cn.msss.service;

import cn.msss.dao.UserDao;
import cn.msss.dao.UserDaoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceimpl implements UserService {



    /**
     * 之前写的方式
     *  UserDao dao=new UserDaoimpl();
        @Override
        public void method() {
            dao.method();
        }
     */

    public UserServiceimpl() {
        System.out.println("这是UserServiceimpl无参构造");

    }

    /**
     * 使用Spring的方式
     *      1.创建属性对应的get，set方法，
     *
     */
    @Autowired                          //类型相同
    @Qualifier("UserDaoimpl")         //民称相同
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
