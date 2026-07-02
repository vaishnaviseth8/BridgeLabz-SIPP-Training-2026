package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
    }

    public static void searchContact(String name) {
        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact Not Found");
    }

    public static void deleteContact(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public static void sortContacts() {
        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        for (Contact c : contacts)
            System.out.println(c);
    }

    public static void main(String[] args) {

        addContact("Vaishnavi", "9876543210", "vaish@gmail.com");
        addContact("Krishna", "9876543211", "krish@gmail.com");
        addContact("Apeksha", "9876543212", "apek@gmail.com");

        searchContact("Vaishnavi");

        deleteContact("Apeksha");

        sortContacts();
    }
}