package nm.lab.tenthEx;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        CustomerService service = context.getBean(CustomerService.class);
        service.addCustomer("John");
        service.deleteCustomer("Alice");
    }
}

