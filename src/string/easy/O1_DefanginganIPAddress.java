package string.easy;

public class O1_DefanginganIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
