//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declare Variables
        double balance = 5000.00;
        double interestRate = 0.17;

        // Calculate interest for one month
        double interestOneMonth = balance * (interestRate/12);
        double newBalanceOneMonth = balance + interestOneMonth;

        // Calculate interest for two months
        double interestTwoMonths = newBalanceOneMonth * (interestRate/12);
        double newBalanceTwoMonths = newBalanceOneMonth + interestTwoMonths;

        // Output results
        System.out.println("Intial Credit Card Balance: $" + balance);
        System.out.println("Interest after one month: $" + interestOneMonth);
        System.out.println("New Balance after one month: $" + newBalanceOneMonth);
        System.out.println("Interest after two months: $" + interestTwoMonths);
        System.out.println("New Balance after two months: $" + newBalanceTwoMonths);
        }
    }
