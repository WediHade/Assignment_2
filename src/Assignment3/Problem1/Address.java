package Assignment3.Problem1;

public class Address {
    private String city;
    private String state;
    private String zip;

    public Address(String state, String city, String zip) {
        this.state = state;
        this.city = city;
        this.zip = zip;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setZip(String zip) {
        this.state = zip;
    }
    public String getZip() {
        return zip;
    }
}
