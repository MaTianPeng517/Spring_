package cn.msss.dao;

import cn.msss.pojo.Transaction;
import cn.msss.util.RowMapperUtil;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TransactionDaoimpl extends JdbcDaoSupport implements TransactionDao {

    @Override
    public int inster(Transaction transaction) {
        String sql="INSERT INTO `transaction` (`name`,`money`) VALUES(?,?)";
        return getJdbcTemplate().update(sql,transaction.getName(),transaction.getMoney());
    }

    @Override
    public int delete(Serializable id) {
        String sql="DELETE FROM `transaction` WHERE `id`=?";
        return getJdbcTemplate().update(sql,id);
    }

    @Override
    public int update(Transaction transaction) {
        String sql="UPDATE  `transaction` SET `name`=?,`money`=? WHERE `id`=?";
        return getJdbcTemplate().update(sql,transaction.getName(),transaction.getMoney(),transaction.getId());
    }

    @Override
    public List<Transaction> select() {
        String sql="SELECT `id`,`name`,`money` FROM `transaction`";
        /**
         * 第一种方式
         *  return getJdbcTemplate().query(sql,new RowMapperUtil());
         */

        /**
         *第二种方式
         *  匿名内部类
         *  return getJdbcTemplate().query(sql, new RowMapper<Transaction>() {
            @Override
            public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
            Transaction transaction=new Transaction();
            transaction.setId(resultSet.getInt("id"));
            transaction.setName(resultSet.getString("name"));
            transaction.setMoney(resultSet.getDouble("money"));
            return transaction;
        }
        });
         *
         */
        return getJdbcTemplate().query(sql,new RowMapperUtil());
    }
}
