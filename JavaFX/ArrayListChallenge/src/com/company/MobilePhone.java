package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts addedContact) {
        for(int i = 0; i <= contacts.size(); i++) {
            Contacts contact = contacts.get(i);
            if (contact.getName().equals(addedContact.getName())) {
                System.out.println("Contact already exits!");
            }
        }
        contacts.add(addedContact);
    }

    public void removeContact(int position) {
        contacts.remove(position);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts");
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).getName() + "    "+ contacts.get(i).getPhoneNumber());
        }
    }

    public void updateContact(int position, Contacts newContact) {
        contacts.set(position, newContact);
        System.out.println("Contact " + contacts.get(position) + " has been modified");
    }

    public int findContact(String contactName) {
       for(int i = 0; i <= contacts.size(); i++) {
           Contacts contact = contacts.get(i);
           if(contact.getName().equals(contactName)) {
               return i;
           }
       }
       return -1;
    }
}
