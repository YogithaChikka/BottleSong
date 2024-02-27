import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

     long initialBalance = sc.nextLong();
      int operations = sc.nextInt();

      /*   WHILE LOOP  */

      int i = 1;
    while(i <= operations) {
      int type = sc.nextInt();
      long amount = sc.nextLong();
      if (type == 1) {
          initialBalance += amount;
          System.out.println("Your initial balance is: " + initialBalance);
      }
      else {
          if (type == 2 && initialBalance >= amount) {
              initialBalance -= amount;
              System.out.println("Your initial balance is: " + initialBalance);
          }
          else {
              System.out.println("You have insufficient funds");
          }
      }
      i++;
    }
  }
}