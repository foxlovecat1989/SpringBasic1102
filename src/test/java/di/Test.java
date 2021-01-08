package di;

import com.mycompany.springbasic1102.di.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    
    @org.junit.Test
    public void t1(){
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("beans-config.xml");
        Student s1 = new Student();
        s1.setName("Vincent");
        s1.setAge(18);
        System.out.println(s1);
    }
}