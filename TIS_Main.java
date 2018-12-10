import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

    // ska hanter all output och input
  public class TIS_Main{
    // Classvariables
    // method to call tickets.java
    // method to call transactions.java
    // Welcome System.out.print();

/*  public void userMenu(Scanner scan){

    printTickets();

  //  private void selectTickets(){
      // Select tickets and sends to transactions.java
  //  }

  }
*/
  public void printTickets(HashMap<String,Double> ticketMap) {
    // Call to tickets.java//ticketMap - print ticketsprice
    // Get a set of the entries
      Set set = ticketMap.entrySet();
      // Get an iterator
      Iterator i = ticketMap.iterator();
      //Displays Elements
        while(i.hasNext()) {
       Map.Entry me = (Map.Entry)i.next();
       System.out.print(me.getKey() + ": ");
       System.out.println(me.getValue());
    }
    System.out.println();
  }



  public static void main(String[] args){
    TIS_Main tis_main = new TIS_Main();
    Scanner scan = new Scanner(System.in);

    tis_main.printTickets();
    // run Methods
    //  tis_main.userMenu();
  }
  }
