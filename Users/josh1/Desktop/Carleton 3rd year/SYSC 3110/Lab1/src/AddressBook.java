import java.util.*;

public class AddressBook {

    private final Map<String , BuddyInfo> address_book;

    public AddressBook() {
        address_book = new HashMap<>();
    }

    public void addBuddy(String name, BuddyInfo buddy){
        this.address_book.put(name, buddy);

    }
    public void  removeBuddy(String name){
        this.address_book.remove(name);

    }

    public static void main (String [] args){

        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy("Tom",buddy);
        addressBook.removeBuddy("Tom");

        AddressBook Info = new AddressBook();

        String per1_name = "Franky";
        String per2_name = "Billy";

        BuddyInfo per1 = new BuddyInfo(per1_name, "123 Dill rd", "324-555-6789");
        BuddyInfo per2 = new BuddyInfo(per2_name, "479 Bob rd", "777-505-6759");


        Info.addBuddy(per1_name,per1);
        Info.addBuddy(per2_name,per2);

        System.out.println("Size of Hashmap:" + Info.address_book.size());
        System.out.println("Values of Hashmap:" +Info.address_book.values());
        System.out.println("Keys in Hashmap:" +Info.address_book.keySet());

        Info.removeBuddy("Franky");

        System.out.println("Size of Hashmap:" + Info.address_book.size());
        System.out.println("Values of Hashmap:" +Info.address_book.values());
        System.out.println("Keys in Hashmap:" +Info.address_book.keySet());


    }

}
