package Table;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Customer> customerDataList = new ArrayList<>();

    static {
        customerDataList.add(new Customer("95","Shawn","Batticaloa",18000.00));
        customerDataList.add(new Customer("96","Aysha","Colombo",2500.623));
        customerDataList.add(new Customer("97","Dev","Mannar",8569220.20));
        customerDataList.add(new Customer("98","Priyanthini","Jaffna",258462.02));
        customerDataList.add(new Customer("99","Thayuran","Trinco",150000.00));
    }

}
