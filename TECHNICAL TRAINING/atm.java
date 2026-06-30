import java.util.*;
public class atm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        int originalpin=1234;
        int initialbalance = 10000;
int currbalance= initialbalance;

        if(pin==originalpin){
            
            System.out.println("Choose an option:");
            int c=sc.nextInt();
            switch (c){
            case 1:
                System.out.println(initialbalance);
                break;
            case 2:
                System.out.println("Enter withdrawal amount");
                int withdraw_amt=sc.nextInt();
                if(withdraw_amt<=initialbalance && withdraw_amt % 100==0){
                    int deducted=currbalance-withdraw_amt;
                    System.out.println(deducted);
                }
                else{
                    System.out.println("Insufficient");
                }
                break;

            case 3:
                int deposit=sc.nextInt();
                if(deposit%100==0 && deposit<40000)
                currbalance=currbalance+deposit;
                System.out.println(currbalance);
                break;
                
case 4:
    System.out.println("thank you");
    break;
    default:
        System.out.println("Invalid");
    
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}