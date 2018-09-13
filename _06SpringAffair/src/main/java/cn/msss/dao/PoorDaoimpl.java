package cn.msss.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PoorDaoimpl extends JdbcDaoSupport implements PoorDao {


    @Override
    public void poor(double money,String id) {
        String sql="UPDATE `poor` SET `money`=`money`-? WHERE `id`=?";
        getJdbcTemplate().update(sql,money,id);
    }
}
