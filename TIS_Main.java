// import java.util.*;
import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;

    // ska hanter all output och input
  public class TIS_Main{
    // Classvariables
      private String operation = "-1";
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

/*
  public void printTickets(HashMap<String,Double> ticketMap) {
    // Call to tickets.java//ticketMap - print ticketsprice
    // Get a set of the entries
      Set set = ticketMap.entrySet();
      // Get an iterator
      Iterator iterator = set.iterator();
      //Displays Elements
        while(iterator.hasNext()) {
       Map.Entry me = (Map.Entry)iterator.next();
       System.out.print(me.getKey() + ": ");
       System.out.println(me.getValue());
    }
    System.out.println();
  }
*/

// Skriver ut rätt antal mellanslag så att biljett-kolumnerna blir raka
private void addSpacing(String temp, int kolumnBredd) {
  int namnBredd = temp.length();
  int spaces = kolumnBredd - namnBredd;

  for (int k = 0; k <= spaces; k++) {
    System.out.print(" ");
  }
}

// Visar biljetter som går att köpa
private void printTickets() {
  int kolumnBredd;
  String temp;

  System.out.println("Välj biljett med hjälp av nummer 1-5");
  for (int i = 0; i < TIS_Tickets.ticketName.size(); i++) {
    System.out.print((i+1) + ". " + TIS_Tickets.ticketName.get(i));

    kolumnBredd = 12;
    temp = TIS_Tickets.ticketName.get(i);
    addSpacing(temp, kolumnBredd);

    System.out.print(TIS_Tickets.ticketDescription.get(i));

    kolumnBredd = 50;
    temp = TIS_Tickets.ticketDescription.get(i);
    addSpacing(temp, kolumnBredd);

    System.out.println("Pris: " + TIS_Tickets.ticketPrice.get(i) + " kr / st");
  }
}
// Ger user alternativ att välja, behöver "kopplas" till Array
private  void printInstructions(){
  try{
    Scanner op = new Scanner(System.in);
    
    operation = op.next();

    if (operation.equals("1"))
       {
         // Call to transactions class
           System.out.println();
       }
       else if (operation.equals("2"))
       {
         // Call to transactions class
           System.out.println();
       }
       else if (operation.equals("3"))
       {
         // Call to transactions class
           System.out.println();
       }
       else if (operation.equals("4"))
       {
         // Call to transactions class
           System.out.println();
       }
       else if (operation.equals("5"))
       {
         // Call to transactions class
           System.out.println();
       }

}     catch (Exception e){
System.out.println("Var snäll och välj ett giltigt nummber");}
//loopa
}

  public static void main(String[] args){
    TIS_Main tis_main = new TIS_Main();
    Scanner scan = new Scanner(System.in);

    tis_main.printTickets();
    tis_main.printInstructions();

    //  tis_main.userMenu();
  }
  }
