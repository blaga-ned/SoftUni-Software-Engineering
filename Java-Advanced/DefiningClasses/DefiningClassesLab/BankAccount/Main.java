package DefiningClasses.DefiningClassesLab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            String result = "";
            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;

                case "Deposit":
                    int accountID = Integer.parseInt(data[1]);
                    double money = Double.parseDouble(data[2]);
                    if (bankAccountMap.containsKey(accountID)) {
                        BankAccount bankAccountFromMap = bankAccountMap.get(accountID);
                        bankAccountFromMap.deposit(money);
                        bankAccountMap.put(accountID, bankAccountFromMap);
                        result = String.format("Deposited %.0f to ID%d", money, accountID);
                    } else {
                        result = "Account does not exist";
                        break;
                    }
                    break;

                case "SetInterest":
                    double interestRate = Double.parseDouble(data[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;

                case "GetInterest":
                    int getAccountId = Integer.parseInt(data[1]);
                    int years = Integer.parseInt(data[2]);
                    if (bankAccountMap.containsKey(getAccountId)) {
                        BankAccount bankAccount1 = bankAccountMap.get(getAccountId);
                        double totalInterest = bankAccount1.getInterest(years);
                        result = String.format("%.2f", totalInterest);
                    } else {
                        result = "Account does not exist";
                        break;
                    }
                    break;
            }
            if (!result.isEmpty()){
                System.out.println(result);
            }
            input = scanner.nextLine();
        }


    }
}
