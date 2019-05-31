package Leizy;

public class Address {
    private String country;
    private String city;
    private String street;
    private String appatrtmentNumber;
    private int zipCode;

    public Address(String country, String city, String street, String appatrtmentNumber, int zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.appatrtmentNumber = appatrtmentNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAppatrtmentNumber() {
        return appatrtmentNumber;
    }

    public void setAppatrtmentNumber(String appatrtmentNumber) {
        this.appatrtmentNumber = appatrtmentNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
