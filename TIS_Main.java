import java.util.Scanner;
import java.util.InputMismatchException;

  public class TIS_Main {

    private static String kontoNr = "-1";
    private static double price = 0;
    private static int operation = -1;

// Skriver ut rätt antal mellanslag så att biljett-kolumnerna blir raka
private void addSpacing(String temp, int kolumnBredd) {
  int namnBredd = temp.length();
  int spaces = kolumnBredd - namnBredd;

  for (int k = 0; k <= spaces; k++) {
    System.out.print(" ");
  }
}

// Skriver ut kvitto
// Förstår mig inte på det där med kolumnerna, du får anpassa det om du vill.
private void printReceipt(String bankName) {
  System.out.println('\t'+ "KVITTO" + '\t');
  System.out.println("    Tack för ert köp!");
  System.out.println('\n'+"Biljett: " + TIS_Tickets.ticketName.get(operation-1));
  System.out.println('\n'+"Pris: " + price);
  System.out.println('\n'+"Bank: " + bankName);
}

// Visar biljetter som går att köpa
private void printTickets() {
  int kolumnBredd;
  String temp;

  System.out.println('\n' + "Välj biljett med hjälp av nummer 1-5" + '\n');
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

// Tar emot användarens biljettval och kontonummer
private  void userInputs() {

  Scanner op = new Scanner(System.in);
  boolean looping = true;
  Scanner scanString = new Scanner(System.in);

    while (looping) {

      try {

      operation = op.nextInt();

      if (operation >= 1 && operation <= 5) {
        price = TIS_Tickets.ticketPrice.get(operation-1);
        looping = false;
      } else {
        System.out.println("Välj biljett med siffrorna 1-5.");
      }

      /*
      // --- Behöver vi dessa? ---
      if (operation == 1)
      {
        looping = false;
      }
      else if (operation == 2)
      {
        // Call to transactions class
        System.out.println();
        looping = false;
      }
      else if (operation == 3)
      {
        // Call to transactions class
        System.out.println();
        looping = false;
      }
      else if (operation == 4)
      {
        // Call to transactions class
        System.out.println();
        looping = false;
      }
      else if (operation == 5)
      {
        // Call to transactions class
        System.out.println();
        looping = false;
      }
      else {
        System.out.println("Var snäll och välj ett giltigt nummber");
      }
    */

      } catch (InputMismatchException e) {
        System.out.println("Fel datatyp, försök igen.");
        op.next();
      }
      catch (Exception e) {
        System.out.println("Ett fel har inträffat.");
      }
    } // while closure

  System.out.print("Ange ditt kontonummer: ");
  kontoNr = scanString.next();
}


// ---------------------------------------------------------------------------

  public static void main(String[] args){
    TIS_Main tis_main = new TIS_Main();
    Scanner scan = new Scanner(System.in);

    tis_main.printTickets();
    tis_main.userInputs();

    Payment objekt = TIS_Transaction.createPayment(kontoNr, price);

    boolean isValid = objekt.isValid;
    String bankName = objekt.nameOfBank;

    if (isValid) { // Om betalningen godkändes
      tis_main.printReceipt(bankName);
    } else {
      System.out.println("Betalningen nekades.");
    }

  }
}


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
