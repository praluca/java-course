package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount account = new BankAccount();
	account.withdrawal(100);

	account.setBalance(50);
	account.withdrawal(100);
	VipCustomer customer = new VipCustomer();
	System.out.println(customer.getName());
	VipCustomer customer1 = new VipCustomer("Ionescu", 123,"ionescu.com");
	System.out.println(customer1.getName());

    }
}
