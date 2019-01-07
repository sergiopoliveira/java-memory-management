package escaping.references;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<CustomerReadOnly> {
    private Map<String, CustomerReadOnly> records;

    public CustomerRecords() {
        this.records = new HashMap<>();
    }

    public void addCustomer(CustomerReadOnly c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, CustomerReadOnly> getCustomers() {
        // return copy of hashmap to gurantee encapsulation
        //  return new HashMap<>(this.records);

        return Collections.unmodifiableMap(this.records);
    }

    @Override
    public Iterator<CustomerReadOnly> iterator() {
        return records.values().iterator();
    }

    public CustomerReadOnly getCustomerByName(String name) {
        //return  this.records.get(name);
        //return new Customer(this.records.get(name));
        return this.records.get(name);
    }
}
