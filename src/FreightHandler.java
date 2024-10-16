public class FreightHandler {
    private String companyName;
    private String address;
    private String contactNumber;

    public static String processInvoice(Invoice invoice) {
        invoice.setReceived(true);
        return invoice.toString();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String toString() {
        return "FreightHandler{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
