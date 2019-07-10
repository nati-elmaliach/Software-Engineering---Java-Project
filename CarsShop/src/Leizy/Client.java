package Leizy;
public class Client {

    private String firstName;
    private String lastName;
    private long ID;
    private long licenceNumber;
    private  Contact contact;

    public Client(String firstName, String lastName, long ID, long licenceNumber, Contact contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.licenceNumber = licenceNumber;
        this.contact = contact;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(long licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
