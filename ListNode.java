//
//
//
//
public class ListNode {
    String name;
    String address;
    String city;
    String phoneNumber;

    protected ListNode next;

    ListNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }

    //runs switchNodes until entire list is sorted.
    public void sortNodes() {

        while (switchNodes()== 0) {}
    }

    //switches entries in list based on a comparison recursivly
    private Integer switchNodes() {
        int out;
        if (this.next == null) {
            return 1;
        } else {
            //compare by last name and first name in that order.
            int diff = (this.name.substring((this.name.lastIndexOf(" ")+1),this.name.length()) + this.name.substring(0,(this.name.lastIndexOf(" ")-1))).compareToIgnoreCase(((this.next.name.substring((this.next.name.lastIndexOf(" ")+1),this.next.name.length()) + this.next.name.substring(0,(this.next.name.lastIndexOf(" ")-1)))));
            if (diff > 0) {
                out = 0;
                String tmp_name = this.name;
                String tmp_address = this.address;
                String tmp_city = this.city;
                String tmp_phoneNumber = this.phoneNumber;
                this.name = this.next.name;
                this.address = this.next.address; 
                this.city = this.next.city; 
                this.phoneNumber = this.next.phoneNumber;

                this.next.name = tmp_name;
                this.next.address = tmp_address;
                this.next.city = tmp_city;
                this.next.phoneNumber = tmp_phoneNumber;
            } else if (diff < 0) {
                out = 1;
            } else {
                out = 1;
            }
            return 1 * out * this.next.switchNodes();
        }
    }


    //finds entry recursivly by name, returns entry list node.
    public ListNode findEntry(String name) {

        if (this.name != null && this.name.contains(name)) {
            return this;
        } else if (this.next != null) {
            return this.next.findEntry(name);
        } else {
            return null;
        }
    }
    
    //deletes entry by name recursivly
    public void deleteEntry(String name) {
        if (this.name != null && this.name.contains(name)) {
            this.name = this.next.name;
            this.address = this.next.address;
            this.city = this.next.city;
            this.phoneNumber = this.next.phoneNumber;
            this.next = this.next.next;
        } else if (this.next != null) {
            this.next.deleteEntry(name);
        }
    }

    //Modifies entries by name, with provieded data recursivly.
    public void modifyEntry(String name, String newName, String newAddress, String newCity, String newPhoneNumber) {
        if (this.name != null && this.name.contains(name)) {
            if (newName != null) {
                this.name = newName;
            }
            if (newAddress != null) {
                this.address = newAddress;
            }
            if (newCity != null) {
                this.city = newCity;
            }
            if (newPhoneNumber != null) {
                this.phoneNumber = newPhoneNumber;
            }
        } else if (this.next != null) {
            this.next.modifyEntry(name, newName, newAddress, newCity, newPhoneNumber);
        }
    }

    //adds provided entry to first found null entry aka the end recursivly.
    public void add(String name, String address, String city, String phoneNumber) {
        if (this.name == null) {
            this.name = name;
            this.address = address;
            this.city = city;
            this.phoneNumber = phoneNumber;
            this.next = null;
        } else {
            if (this.next == null) {this.next = new ListNode(null, null, null, null);}
            this.next.add(name, address, city, phoneNumber);
        }
    } 
}

