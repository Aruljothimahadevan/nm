package nm.lab.thirdEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Employee emp = (Employee) context.getBean("employeeBean");
        emp.displayInfo();
    }
}