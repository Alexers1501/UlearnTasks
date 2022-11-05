package Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {

    List<Customer> customers;

    public CustomerStorage() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String customerData){
        String data[] = customerData.split(" ");
        Customer customer = new Customer(data[0], data[1], data[2], data[3]);
        customers.add(customer);
    }

    public void listCustomers(){
        for(Customer c : customers)
            System.out.println(c);
    }

    public void removeCustomer(String customerData){
        Customer customer = getCustomer(customerData);
        if (customer != null)
            customers.remove(customer);
    }

    public Customer getCustomer(String customerData){
        String[] data = customerData.split(" ");
        if (data.length == 2){
            for (Customer customer : customers){
                if (customer.getSurname().equals(data[1]) && customer.getName().equals(data[0]))
                    return customer;
            }
        }
        return null;
    }

    public int getCount(){
        return customers.size();
    }
}
