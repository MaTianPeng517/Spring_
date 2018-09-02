package cn.msss.dao;

public class UserDaoimpl implements UserDao {

    @Override
    public void method() {
        System.out.println("进入Dao");
    }


    public UserDaoimpl() {
        System.out.println("这是UserDaoimpl无参构造");
    }

}
