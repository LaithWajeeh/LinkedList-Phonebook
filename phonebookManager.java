import java.util.NoSuchElementException;

//Initializes Phonebook
public class phonebookManager {
    private final ListNode conList;
    public phonebookManager() {
    this.conList = new ListNode(null, null, null, null);
    }

    //modifies an entry in the phonebook by name, accepts newName, newAddress, newCity, and newPhoneNumber as the replacing data.
    public void modifyEntry(String name, String newName, String newAddress, String newCity, String newPhoneNumber) {
        this.conList.modifyEntry(name, newName, newAddress, newCity, newPhoneNumber);
    }


    //adds entry to LinkedList with data name, address, city, and phonenumber.
    public void add(String name, String address, String city, String phoneNumber) {
        this.conList.add(name, address, city, phoneNumber);
    }

    //sorts the book by last name and first name.
    public void sortPhoneBook() {
        conList.sortNodes();
    }
    
    //finds entry by name and returns entry prettily as String.
    public String findEntry(String name) {
        ListNode ent = this.conList.findEntry(name);
        if (ent == null) {
            return null;
        }
        return String.format("Entry:\n\tName: %s\n\tAddress: %s\n\tCity: %s\n\tPhonenumber: %s",ent.name, ent.address, ent.city, ent.phoneNumber);
    }

    //deletes entry by name
    public void deleteEntry(String name) {
        this.conList.deleteEntry(name);
    }

    //converts phonebook into list of entries.
    //Outputs String. 
    @Override
    public String toString() throws NoSuchElementException {
        
        if (this.conList.name == null) {
            //if the phonebook is empty throw error.
            throw new NoSuchElementException("no entries in phonebook.");
        } else {
        
            
            ListNode con = this.conList;
            String out = "";
            while (con != null) { 
                //formats the entries and adds them recursively
                out = out + "\n" + String.format("Entry:\n\tName: %s\n\tAddress: %s\n\tCity: %s\n\tPhonenumber: %s",con.name, con.address, con.city,con.phoneNumber);
               con = con.next;
            }
            return out;
        }

    }

}
