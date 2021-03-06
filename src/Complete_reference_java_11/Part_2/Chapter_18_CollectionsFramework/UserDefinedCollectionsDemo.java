package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class UserDefinedCollectionsDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        LinkedList<Address> AddressList = new LinkedList<>();

        AddressList.add(new Address("J.M West", "11 Oak Ave","UK1","res"));
        AddressList.add(new Address("J.M South", "12 Oak Ave","UK3","res"));
        AddressList.add(new Address("J.M North", "13 Oak Ave","UK4","res"));
        AddressList.add(new Address("J.M East", "14 Oak Ave","UK2","res"));
        Iterator<Address> itr = AddressList.iterator();
        while (itr.hasNext()) {
            System.out.print(String.format("<%s>", itr.next()));
        }
        for (Address elem:AddressList) {
            System.out.printf("<%s>\n",elem);
        }
        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}

class Address {
    private String name;
    private String street;
    private String city;
    private String code;

    public Address(String name, String street, String city, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.code = code;
    }
    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
