
import java.util.*;

class ATM{
    float balance;
    int pin = 5674;
  public void checkpoint(){
    System.out.println("enter your pin: ");
    Scanner sc = new Scanner(System.in);
    int ipin = sc.nextInt();
    if(ipin==pin){
        menu();
    }
    else{
        System.out.println("enter a valid pin");
    }

  }



public void menu(){
    System.out.println("Enter Your Choice:");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();
    if(opt == 1){
        cb();
    }
    else if (opt == 2) {
        wm();
        
    }
    else if (opt==3){
        dm();
    }
    else if (opt==4){
        return;
    }
    else{
        System.out.println("Enter a valid choice");
    }
}
public void cb(){
    System.out.println("balance: "+ balance);
    menu();
}
public void wm(){
    System.out.println("enter amount to be withdrawn");
    Scanner sc =new Scanner(System.in);
    float amt = sc.nextFloat();
    if(amt>balance){
        System.out.println("Insufficient Balance");

    }
    else{
        balance = balance - amt;
        System.out.println("Money withdrawl sucessfull");

    }
    menu();
}
public void dm(){
    System.out.println("Enter The Amount: ");
    Scanner sc = new Scanner(System.in);
    float amt = sc.nextFloat();
    balance = balance + amt;
    System.out.println("Money Deposited Sucessfully");

}

}


public class App {
    public static void main(String[] args) throws Exception {
        ATM obj = new ATM();
    obj.checkpoint();
    
    }
}
