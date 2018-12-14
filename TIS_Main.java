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

// Skriver ut kvittot
private void printReceipt(String bankName) {
  System.out.println('\n' + "------------------------------" + '\n');
  System.out.println('\t' + "KVITTO" + '\n');
  System.out.println('\t'+"Biljett: " + TIS_Tickets.ticketName.get(operation-1));
  System.out.println('\t'+"Pris:    " + price);
  System.out.println('\t'+"Bank:    " + bankName + '\n');
  System.out.println('\t' + "Tack för ert köp!");
  System.out.println('\n' + "------------------------------" + '\n');
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

      } catch (InputMismatchException e) {
        System.out.println("Fel datatyp, försök igen.");
        op.next();
      } catch (Exception e) {
          System.out.println("Ett fel har inträffat.");
      }
    }

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
