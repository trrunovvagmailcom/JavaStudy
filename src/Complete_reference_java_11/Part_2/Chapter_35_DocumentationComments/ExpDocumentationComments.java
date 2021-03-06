package Complete_reference_java_11.Part_2.Chapter_35_DocumentationComments;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * The simple java doc comment
 * @author Izotov Vladislav
 * @see //vk.com/tot_camyi_rembo
 *
 * @since 14.08.2020 15:20
 * @version 2.0
 */
public class ExpDocumentationComments {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "55555555", "Larry@faf.com"));
        myList.add(new NamePhoneEmail("Marcus", "0005463", "Marcus@faf.com"));
        myList.add(new NamePhoneEmail("Lee", "32467777", "Lee@faf.com"));
        myList.add(new NamePhoneEmail("Jeff", "3245646", "Jeff@faf.com"));

        System.out.println("Original values in myList: ");

        myList.stream().forEach(a->{
            System.out.println(a.name + " " + a.phoneNum + " " + a.email);
        });

        System.out.println();

        Stream<NumPhone> nameAndPhone = myList.stream().map(a -> new NumPhone(a.name, a.phoneNum));
        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach(a->{
            System.out.println(a.name + " " + a.phoneNum);
        });
        Stream<NumPhone> nameAndPhoneJeff = myList.stream().filter(a->a.name.equals("Jeff")).map(a -> new NumPhone(a.name, a.phoneNum));
        System.out.println("Only Jeff's name and phone number: ");
        nameAndPhoneJeff.forEach(a->{
            System.out.println(a.name + " " + a.phoneNum);
        });
    }
}

class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmail(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}

class NumPhone {
    String name;
    String phoneNum;

    public NumPhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}
