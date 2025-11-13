package nm.lab.tenthEx;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void addCustomer(String name) {
        System.out.println("Adding customer: " + name);
    }

    public void deleteCustomer(String name) {
        System.out.println("Deleting customer: " + name);
    }
}
