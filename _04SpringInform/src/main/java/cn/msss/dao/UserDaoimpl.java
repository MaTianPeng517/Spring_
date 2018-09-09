package cn.msss.dao;

public class UserDaoimpl implements UserDao {


    @Override
    public String method() {
            System.out.println("这是----》daoimpl中的方法内容");
        return "吃好，睡好，玩好，啥都好";
    }

    @Override
    public String mes() {
        System.out.println("测试顾问");
        return "测试顾问";
    }
}
