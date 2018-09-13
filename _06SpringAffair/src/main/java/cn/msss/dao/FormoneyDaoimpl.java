package cn.msss.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FormoneyDaoimpl extends JdbcDaoSupport implements  FormoneyDao{


    @Override
    public void formoney(double money,String id) {
        String sql="UPDATE `formoney` SET `money`=`money`+? WHERE `id`=?";
        getJdbcTemplate().update(sql,money,id);
    }
}
