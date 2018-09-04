package cn.msss.dao;

import cn.msss.pojo.Transaction;

import java.io.Serializable;
import java.util.List;

public interface TransactionDao {

    public int inster(Transaction transaction);
    public int delete(Serializable id);
    public int update(Transaction transaction);
    public List<Transaction> select();

}
