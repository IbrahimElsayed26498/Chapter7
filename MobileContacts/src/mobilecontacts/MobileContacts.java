/*
In the name of Allah, the Gracious, the Merciul
 */
package mobilecontacts;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ibrahim
 */
public class MobileContacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this will contain every information from the user
        Contact contact = new Contact();
        //this will contain the contacts
        ArrayList<Contact> person = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Name   : ");
        
        contact.setName(input.nextLine());
        System.out.print("Number : ");
        String number = input.next();
        
        //check if the user input a valid phone number
        if(number.startsWith("010") || number.startsWith("011")||
                number.startsWith("012") || number.startsWith("015"))// In Egypt Every phone number Starts with one of these numbers
            if(number.length()== 11)//In Egypt Every phone number must be 11 numnbers
                contact.setNumber(number);
            else{
                System.out.println("Wrong Number");
                return;
            }
        else{
            System.out.println("Wrong number");
            return;
        }
        //if the number is right then add the person to the list of contacts
        person.add(contact);
        displayContact(person.get(0).getName(),person.get(0).getNumber());
        displayContacts(person);
    }
    
    //Operation on person object
    public static void displayContact(String name, String number){
        System.out.println("\n*****************************");
        System.out.println("Name   : "+name);
        System.out.println("Numebr : "+number);
        System.out.println("*****************************");
    }
    public static void displayContacts(ArrayList<Contact> contact){
        System.out.println();System.out.println();
        System.out.println("*****************************");
        System.out.println("*  Displaying all contacts  *");
        System.out.println("*****************************");
        System.out.println();
        for(int i=0; i<contact.size();i++){
            displayContact(contact.get(i).getName(), contact.get(i).getNumber());
        }
    }
}
