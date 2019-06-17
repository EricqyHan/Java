public class Customer {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private RewardsMember rewardsMember;
    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;

    public Customer(String firstName, String lastName, String phoneNumber, String email, RewardsMember rewardsMember, ShippingAddress shippingAddress, BillingAddress billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rewardsMember = rewardsMember;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RewardsMember getRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(RewardsMember rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }
}
