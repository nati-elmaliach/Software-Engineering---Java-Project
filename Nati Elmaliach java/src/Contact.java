public class Contact {

    private int phoneNumber;
    private String email;
    private Address address;

    public Contact(int phoneNumber, String email, Address address) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }
}
