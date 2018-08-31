package cn.msss;

import static org.junit.Assert.assertTrue;

import cn.msss.service.UserService;
import cn.msss.service.UserServiceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    //之前方式写的
    @Test
    public void me(){
        UserService s=new UserServiceimpl();
        s.method();
    }

    /**
     * 使用Spring方式，我们所创建的对象都交给Spring容器
     * 1.事先加载Spring容器文件，Spring_banes.xml
     * 2.获取指定的对象
     * 3.使用对象的方法
     */
    @Test
    public void ms() {
        //1.加载
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_banes.xml");
        //2.获取指定的对象
        UserService bean = context.getBean(UserService.class);
        //3.使用对象的方法
        bean.method();
    }
}
