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

        //Tom is new buddy





    }

}
