
import java.util.Scanner;

class BankAccount{
    private  double balance;

         public BankAccount(double  initialBalance){
           this.balance = initialBalance;
         }

         public double  getBalance(){
            return  balance;
         }

         public void deposit(double amount){
                balance += amount;
            System.out.println("Deposit successful.New balance: "+ balance);
            }

            public boolean withdraw(double amount){
                if (amount > balance){
                    System.out.println("Insuffficient funds.Withdrawal failed.");
                    return false;
                }else{
                    balance -= amount;
                    System.out.println("Withdrawal successful.New balance:"+ balance);
                    return true;
                }
            }
        }

        class ATM {
            private BankAccount bankAccount;
            private  Scanner scanner;

            public ATM (BankAccount bankAccount){
                this.bankAccount = bankAccount;
                this.scanner = new Scanner(System.in);
            }

            public  void displayOptions(){
                System.out.println("Welcome to the ATM interface.");
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Exit");
            }

            public void processOption(int option){
                switch (option){
            case 1:
                    System.out.println("Your balance is:" + bankAccount.getBalance());
                    break;
            case 2:
                     System.out.print("Enter deposit amount:");
                     double depositAmount = scanner.nextDouble();
                     bankAccount.deposit(depositAmount);
                      break;
            case 3:
              System.out.print("Enter withdrawal amount:");

                   double withdrawalAmount = scanner.nextDouble();
                   bankAccount.withdraw(withdrawalAmount);
                   break;
            case 4:
                   System.out.println("Thank you for using the ATM .Goodbye!") ;
                System.exit(0);
                   break;
                default:
                System.out.println("Invalid option.please try again."); 
                }
            }
        }

        
            public class Main{
            public static void main(String[] args){
            BankAccount userAccount = new BankAccount(10000.0);//initial balance
                ATM atm = new ATM(userAccount);

                while (true){
                    atm.displayOptions();
                    System.out.print("Enter option:");
                    @SuppressWarnings("resource")
                    int option = new Scanner(System.in).nextInt();
                atm.processOption(option);
                }
            }
        }
    



                         
               




        

                            
        
                




        
                

         





    

