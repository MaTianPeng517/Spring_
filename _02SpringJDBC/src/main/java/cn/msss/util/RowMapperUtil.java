package cn.msss.util;

import cn.msss.pojo.Transaction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperUtil implements RowMapper<Transaction> {


    @Override
    public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
        Transaction transaction=new Transaction();
        transaction.setId(resultSet.getInt("id"));
        transaction.setName(resultSet.getString("name"));
        transaction.setMoney(resultSet.getDouble("money"));
        return transaction;
    }
}
