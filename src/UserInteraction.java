import java.util.Scanner;
public class UserInteraction {
    static void userInteraction() {
        Account userAccount = new Account(1234567890, 30000.0, 27012001);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Online Banking!");
        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw balance");
            System.out.println("3. Make a deposit");
            System.out.println("4. View bank account number");
            System.out.println("5. Exit");
            System.out.print("Select the above options: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter a withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (userAccount.getBalance() >= withdrawalAmount) {
                        userAccount.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Not enough balance!");
                    }
                    break;
                case 3:
                    System.out.print("Enter a deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        userAccount.deposit(depositAmount);
                    }else{
                        System.out.println("Invalid amount! Please deposit the amount greater than 0!");
                    }
                    break;
                case 4:
                    System.out.println("We'll have to verify you some information from you!");
                    System.out.println("Please provide a date of birth [DDMMYY]: ");
                    int birthDate = scanner.nextInt();
                    if(userAccount.getAccountNumber(birthDate)){
                        System.out.println("Verification success! Your account number is: " + userAccount.getAccount());
                    }
                    else{
                        System.out.println("Verification failed :(");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using our Bank services!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Please choose between 1-4!");
            }
        }
    }}