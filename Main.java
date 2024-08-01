// Name: Laith Wajeeh
// Class: CS 145
// Assignment: Lab_5: LinkedListP_Phonebook
// Sources: w3schools.com and stackexchange.com.
// Purpose: Demonstrates the use of linked lists through the use of them in a phonebook manager.

public class Main {
    public static void main(String[] args) {
        phonebookManager pB = new phonebookManager();
        // adds a few entries into the book.
        pB.add("Laith Mitchell","263 Kline rd", "Bellingham", "5064591204");
        pB.add("zach Wajeeh","263 Kline rd", "Bellingham", "5099801307");
        pB.add("Sam Wajeeh","placeholder", "Aiken, SC", "5098405500");
        pB.add("John Doe", "example data", "Seattle", "2061234567");
        pB.add("Jane Smith", "sample text", "Portland", "5039876543");
        pB.add("Alice Johnson", "info here", "San Francisco", "4155551234");
        pB.add("Bob Brown", "more data", "Los Angeles", "2134445678");
        pB.add("Carol Davis", "some text", "New York", "2127891234");
        pB.add("Dave Evans", "additional info", "Chicago", "3124567890");
        pB.add("Eve Harris", "extra data", "Houston", "7135556789");
        pB.add("frank miller", "sample info", "Phoenix", "6021237890");
        pB.add("Grace Lee", "test text", "Denver", "3039871234");
        
        //prints the Phonebook prettily, but unsortedly.
        System.out.println(pB);

        //sorts all entries by last name and first name, in that order.
        pB.sortPhoneBook();

        //prints new line.
        System.out.println("");

        //Modify Entry based on name. 
        pB.modifyEntry("Zach Wajeeh","Bob Builder",null,null,null);
        
        //finds the entry for bob
        System.out.println("\n\nFound " + pB.findEntry("Bob") + "\n\n");

        //deletes bob builder.
        pB.deleteEntry("Laith Wajeeh");
        
        System.out.println("The now sorted and modified phonebook:");

        //prints the Phonebook prettily
        System.out.println(pB);
    }

}