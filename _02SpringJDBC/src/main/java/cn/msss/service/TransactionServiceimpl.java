package cn.msss.service;

import cn.msss.dao.TransactionDao;
import cn.msss.pojo.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;
import java.util.List;

public class TransactionServiceimpl implements  TransactionService{

    TransactionDao dao;

    @Override
    public int inster(Transaction transaction) {
        return dao.inster(transaction);
    }

    @Override
    public int delete(Serializable id) {
        return dao.delete(id);
    }

    @Override
    public int update(Transaction transaction) {
        return dao.update(transaction);
    }

    @Override
    public List<Transaction> select() {
        return null;
    }
}
