import java.util.NoSuchElementException;

public class phonebookManager {
    private final ListNode conList;
    public phonebookManager() {
    this.conList = new ListNode(null, null, null, null);
    }


    public void modifyEntry(String name, String newName, String newAddress, String newCity, String newPhoneNumber) {
        this.conList.modifyEntry(name, newName, newAddress, newCity, newPhoneNumber);
    }



    public void add(String name, String address, String city, String phoneNumber) {
        this.conList.add(name, address, city, phoneNumber);
    }

    public void sortPhoneBook() {
        conList.sortNodes();
    }
        
    public String findEntry(String name) {
        ListNode ent = this.conList.findEntry(name);
        if (ent == null) {
            return null;
        }
        return String.format("Entry:\n\tName: %s\n\tAddress: %s\n\tCity: %s\n\tPhonenumber: %s",ent.name, ent.address, ent.city, ent.phoneNumber);
    }

    public void deleteEntry(String name) {
        this.conList.deleteEntry(name);
    }

    //converts phonebook into list of entries.
    //Outputs String. 
    @Override
    public String toString() throws NoSuchElementException {
        
        if (this.conList.name == null) {
            throw new NoSuchElementException("no entries in phonebook.");
        } else {
        
            
            ListNode con = this.conList;
            String out = "";
            
            while (con != null) { 
                out = out + "\n" + String.format("Entry:\n\tName: %s\n\tAddress: %s\n\tCity: %s\n\tPhonenumber: %s",con.name, con.address, con.city,con.phoneNumber);
               con = con.next;
            }
            return out;
        }

    }
    //public String findEntry(String name) {
        
    //    ListNode ent = this.conList;  
    //    while (ent.next.name.contains(name)) { 
    //        ent = ent.next;
    //    }
    //    return String.format("Entry:\n\tName: %s\n\tAddress: %s\n\tCity: %s\n\tPhonenumber: %s",ent.name, ent.address, ent.city, ent.phoneNumber);
    //}

    // public void sort() {
    //     Collections.sort(this.conList);
    // }

    // public void add(String name, String address, String city, String phoneNumber) {
    //     conList.add(name, address, city, phoneNumber);
    // } 

}
