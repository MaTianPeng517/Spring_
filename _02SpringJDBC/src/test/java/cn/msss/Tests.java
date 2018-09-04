package cn.msss;

import cn.msss.dao.TransactionDao;
import cn.msss.dao.TransactionDaoimpl;
import cn.msss.pojo.Transaction;
import cn.msss.service.TransactionService;
import cn.msss.service.TransactionServiceimpl;
import cn.msss.util.TestValue;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Tests {

    static  Transaction transaction=new Transaction();
    TransactionDao bean=null;
    TestValue testValue=null;

    @Before
    public  void before(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring_JDBC.xml");
         bean = context.getBean(TransactionDaoimpl.class);
         testValue=context.getBean(TestValue.class);
    }

    @Test
    public void one(){
        transaction.setName("小妹妹");
        transaction.setMoney(35000.00);
        int inster = bean.inster(transaction);
        System.out.println(inster);
    }

    @Test
    public void Line(){
        List<Transaction> select = bean.select();
        for (Transaction o:select){
            System.out.println(o);
        }
    }

    @Test
    public void value(){
        String jdbcname = testValue.getJdbcname();
        System.out.println(jdbcname);
    }
}
