public class App {
    public static void main(String[] args) {
        ShippingAddress shippingAddress = new ShippingAddress("742 Evergreen Terrace", "n/a", "Springfield", "New Jersey", "90210");
        BillingAddress billingAddress = new BillingAddress("742 Evergreen Terrace", "n/a", "Springfield", "New Jersey", "90210");
        RewardsMember rewardsMember = new RewardsMember(true);
        Customer customer = new Customer("Han", "Solo", "555-555-5555", "HanSolo@empire.com", rewardsMember, shippingAddress, billingAddress);

    }

}