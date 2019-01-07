package escaping.references;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        // because it creates a copy, underlying hashmap wont be cleared
        //  records.getCustomers().clear();

        for (CustomerReadOnly next : records.getCustomers().values()) {
            System.out.println(next);
        }

        CustomerReadOnly john = records.getCustomerByName("John");
        // won't affect old reference
        //  john.setName("Albert");
        System.out.println(john.getName());
    }
}
