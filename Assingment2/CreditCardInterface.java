package Assingment2;

 interface CreditCardInterface {
	
	    void viewCreditAmount();
	    void useCard(double amount);
	    void payCredit(double amount);
	    void increaseLimit(double amount);
	}

	class SilverCardCustomer implements CreditCardInterface {
	    protected String name;
	    protected String cardNumber;
	    protected double creditAmount;
	    protected double creditLimit;

	    public SilverCardCustomer(String name, String cardNumber) {
	        this.name = name;
	        this.cardNumber = cardNumber;
	        this.creditAmount = 0;
	        this.creditLimit = 50000;
	    }

	    @Override
	    public void viewCreditAmount() {
	        System.out.println("Current credit amount: Rs." + creditAmount);
	    }

	    @Override
	    public void useCard(double amount) {
	        if (creditAmount + amount <= creditLimit) {
	            creditAmount += amount;
	            System.out.println("Transaction successful! Used Rs." + amount + " on card.");
	        } else {
	            System.out.println("Transaction failed! Credit limit exceeded.");
	        }
	    }

	    @Override
	    public void payCredit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid payment amount.");
	            return;
	        }
	        if (amount > creditAmount) {
	            System.out.println("Payment exceeds current credit amount. Paying only Rs." + creditAmount);
	            creditAmount = 0;
	        } else {
	            creditAmount -= amount;
	            System.out.println("Payment successful! Paid Rs." + amount);
	        }
	    }

	    @Override
	    public void increaseLimit(double amount) {
	        System.out.println("Increase limit operation not available for Silver Card Customers.");
	    }

	    public void displayDetails() {
	        System.out.println("Silver Card Customer: " + name);
	        System.out.println("Card Number: " + cardNumber);
	        System.out.println("Credit Limit: Rs." + creditLimit);
	        System.out.println("Current Credit Amount: Rs." + creditAmount);
	    }
	}

	class GoldCardCustomer extends SilverCardCustomer {
	    private int increaseLimitCount;

	    public GoldCardCustomer(String name, String cardNumber) {
	        super(name, cardNumber);
	        this.creditLimit = 100000;
	        this.increaseLimitCount = 0;
	    }

	    @Override
	    public void increaseLimit(double amount) {
	        if (increaseLimitCount >= 3) {
	            System.out.println("Credit limit increase failed! Maximum increase attempts reached.");
	            return;
	        }
	        if (amount > 5000) {
	            System.out.println("Credit limit increase failed! Cannot increase more than Rs. 5000 at a time.");
	            return;
	        }
	        creditLimit += amount;
	        increaseLimitCount++;
	        System.out.println("Credit limit increased by Rs." + amount + ". New limit: Rs." + creditLimit);
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Gold Card Customer: " + name);
	        System.out.println("Card Number: " + cardNumber);
	        System.out.println("Credit Limit: Rs." + creditLimit);
	        System.out.println("Current Credit Amount: Rs." + creditAmount);
	        System.out.println("Increase Limit Used: " + increaseLimitCount + "/3 times");
	    }
	}

	// Testing the classes
	     class CreditCardTest {
	    public static void main(String[] args) {
	        SilverCardCustomer silver = new SilverCardCustomer("Alice", "1234567890123456");
	        GoldCardCustomer gold = new GoldCardCustomer("Bob", "9876543210987654");

	        System.out.println("--- Silver Card Customer Operations ---");
	        silver.displayDetails();
	        silver.useCard(20000);
	        silver.viewCreditAmount();
	        silver.useCard(35000); // Exceeds limit
	        silver.payCredit(5000);
	        silver.viewCreditAmount();
	        silver.increaseLimit(3000); // Not allowed for silver
	        silver.displayDetails();

	        System.out.println("\n--- Gold Card Customer Operations ---");
	        gold.displayDetails();
	        gold.useCard(90000);
	        gold.viewCreditAmount();
	        gold.useCard(15000); // Exceeds limit
	        gold.payCredit(40000);
	        gold.viewCreditAmount();

	        // Increase limit thrice
	        gold.increaseLimit(3000);
	        gold.increaseLimit(4000);
	        gold.increaseLimit(6000); // Should fail, > 5000
	        gold.increaseLimit(2000);
	        gold.increaseLimit(1000); // Should fail, limit exceeded

	        gold.displayDetails();
	    }
	}



