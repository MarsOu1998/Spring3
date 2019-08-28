package MainModule;

import Student.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("ApplicationContext.xml");
        student student1=(student)context.getBean("Student2");
        student1.Print();
    }
}
