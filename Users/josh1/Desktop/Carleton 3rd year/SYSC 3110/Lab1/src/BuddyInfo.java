public class BuddyInfo {

    public String getName() {
        return name;
    }

    public BuddyInfo(String person_name, String person_address, String person_phone) {
        this.name = person_name;
        this.address = person_address;
        this.phone_number = person_phone;

    }

    public BuddyInfo() {
        this.name = "Frank";
        this.address = "123 Frankfort Rd";
        this.phone_number = "123-456-7896";
    }

    private String name;


    public String getAddress() {
        return address;
    }

    private String address;


    public String getPhone_number() {
        return phone_number;
    }

    private String phone_number;

    public String Buddyname(){
        return this.name;

    }


    public static void main(String[] args) {
        BuddyInfo Info = new BuddyInfo("Homer", "123 Dill rd", "324-555-6789");
        System.out.println(Info.name + " " + "Hello");
    }
}
