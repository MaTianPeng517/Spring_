package cn.msss;

import static org.junit.Assert.assertTrue;

import cn.msss.entity.User;
import cn.msss.service.UserService;
import cn.msss.service.UserServiceimpl;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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
        System.out.println("");
        //2.获取指定的对象
        UserService bean = context.getBean(UserService.class);
        //3.使用对象的方法
        bean.method();
    }

    /**
     * 事后选择性执行加载bean
     */
    @Test
    public void xbf(){
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Spring_banes.xml"));
        System.out.println("");
        UserService bean = factory.getBean(UserService.class);
        bean.method();
    }

    /**
     * 配置文件不在项目中时，指定配置文件的路径加载
     * FileSystemXmlApplicationContext:  指定磁盘下的路径
     */
    @Test
    public void fac(){
        ApplicationContext context=new FileSystemXmlApplicationContext("");
        System.out.println("");
        UserService bean = context.getBean(UserService.class);
        bean.method();
    }


    /**
     * 属性注入
     * 1.根据set配置注入
     * 2.P命名空间
     * 3.根据构造配置注入
     * 4.C命名空间
     */
    @Test
    public void injection(){
            ApplicationContext context=new ClassPathXmlApplicationContext("Spring_banes.xml");
            User bean = context.getBean(User.class);
            System.out.println(bean);
    }

    /**
     *属性赋值
     * 1.域属性
     * 2.数组
     * 3.List集合
     * 4.Set集合
     * 5.Map集合
     * 6.Properties
     */
    @Test
    public void assignment(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring_banes.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }

    /**
     * 注解方式注入
     */
    @Test
    public void annotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Sprng_Administration");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }

    /**
     * 一、管理
     */
    @Test
    public void administration(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Sprng_Administration");
        User bean = context.getBean(User.class);
        System.out.println(bean);

    }

}
