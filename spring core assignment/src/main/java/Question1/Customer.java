package Question1;

public class Customer {
    int cusID;
    String cusname,cuscontact;
    Address cusAddress;

    @Override
    public String toString() {
        return "Customer{" +
                "cusID=" + cusID +
                ", cusname='" + cusname + '\'' +
                ", cuscontact='" + cuscontact + '\'' +
                ", cusAddress=" + cusAddress +
                '}';
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCuscontact() {
        return cuscontact;
    }

    public void setCuscontact(String cuscontact) {
        this.cuscontact = cuscontact;
    }

    public Address getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(Address cusAddress) {
        this.cusAddress = cusAddress;
    }
}
