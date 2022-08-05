public class TestAccount {

    public static void main(String[] args) {
        Account myAccount = new Account("Nina", 100);
        System.out.println("Name: " + myAccount.getName());
        System.out.println("Balance: " + myAccount.getBalance());
        myAccount.addInterest();
        System.out.println("balance after interest : " + String.format("%.2f", myAccount.getBalance()));
        Account[] arrayOfAccounts = new Account[5];
        double[] amounts = { 23, 5444, 2, 345, 34 };
        String[] names = { "Picard", "Ryker", "Worf", "Troy", "Data" };

        for (int i = 0; i < arrayOfAccounts.length; i++) {
            arrayOfAccounts[i] = new Account(names[i], amounts[i]);
            System.out.println("New Account added. Name: " + names[i] + " Amount: " + amounts[i]);
            arrayOfAccounts[i].addInterest();
            System.out
                    .println("Amount after adding interest: " + String.format("%.2f", arrayOfAccounts[i].getBalance()));

        }

    }

}
