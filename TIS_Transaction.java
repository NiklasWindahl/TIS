import java.util.Scanner;

public class TIS_Transaction{

  TIS_Main Main = new TIS_Main();
  TIS_Tickets Ticket = new TIS_Tickets();
  MHS_Main Bank = new MHS_Main();

  Scanner scan = new Scanner(System.in);

  String transaction = "-1";
  double cashAmount = 0;

// MHS get bankaccount
// MHS get bank

public String createPayment(){
  //System.out.println("Please enter bankaccount number: ");
  String bankaccount = scan.next();
  //System.out.println("Please choose ticket: ");
  double cashAmount = Main.totalTicketPrice(); // skapa rätt adress för att hämta ticketpris
  Payment currentPayment = Bank.checkPayment(bankaccount, cashAmount);

  // currentPayment.isValid;
  // currentPayment.nameOfBank;

}


}
