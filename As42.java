// q-2
import java.util.*;

// Enum for card type
enum CardType {
    CREDIT,
    DEBIT
}

// Abstract class for Card
abstract class Card {
    private String cardNumber;
    private CardType cardType;

    public Card(String cardNumber, CardType cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public abstract void payment(double amount);

    public abstract void deposit(double amount);

    public String getCardNumber() {
        return cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }
}

// Class for CreditCard
class CreditCard extends Card {
    public CreditCard(String cardNumber) {
        super(cardNumber, CardType.CREDIT);
    }
    public void payment(double amount) {
        System.out.println("Paid " + amount + " using credit card " + getCardNumber());
    }
    public void deposit(double amount) {
        System.out.println("Deposited " + amount + " to credit card " + getCardNumber());
    }
}

// Class for DebitCard
class DebitCard extends Card {
    public DebitCard(String cardNumber) {
        super(cardNumber, CardType.DEBIT);
    }
    public void payment(double amount) {
        System.out.println("Paid " + amount + " using debit card " + getCardNumber());
    }
    public void deposit(double amount) {
        System.out.println("Deposited " + amount + " to debit card " + getCardNumber());
    }
}

// Interface for Customer
interface Customer {
    void displayDetails();

    void makePayment(Card card, double amount);
}

// Class for RegularCustomer
class RegularCustomer implements Customer {
    private String name;
    private String membershipId;

    public RegularCustomer(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Membership ID: " + membershipId);
    }

    public void makePayment(Card card, double amount) {
        card.payment(amount);
    }
}

// Class for PremiumCustomer
class PremiumCustomer implements Customer {
    private String name;
    private String membershipId;

    public PremiumCustomer(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Membership ID: " + membershipId);
    }

    public void makePayment(Card card, double amount) {
        card.payment(amount);
    }
}

// Class for Store
class Store {
    private List<Customer> customers;

    public Store() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            customer.displayDetails();
        }
    }

    public void makePayment(Customer customer, Card card, double amount) {
        customer.makePayment(card, amount);
    }
}
class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer1 = new RegularCustomer("John Doe", "R123");
        Customer customer2 = new PremiumCustomer("Jane Doe", "P456");

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        Card card1 = new CreditCard("1234-5678-9012-3456");
        Card card2 = new DebitCard("9876-5432-1098-7654");

        store.displayCustomers();

        store.makePayment(customer1, card1, 100.0);
        store.makePayment(customer2, card2, 200.0);
    }
}
