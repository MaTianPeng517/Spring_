package cn.msss.service;

import cn.msss.pojo.Transaction;

import java.io.Serializable;
import java.util.List;

public interface TransactionService {
    public int inster(Transaction transaction);
    public int delete(Serializable id);
    public int update(Transaction transaction);
    public List<Transaction> select();
}
