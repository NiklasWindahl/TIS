import java.util.Scanner;

public class TIS_Transaction{

  TIS_Main main = new TIS_Main();
  TIS_Tickets ticket = new TIS_Tickets();
  MHS_Main bank = new MHS_Main();

  Scanner scan = new Scanner(System.in);

  String transaction = "-1";
  double cashAmount = 0;

// MHS get bankaccount
// MHS get bank

public String createPayment(){
  //System.out.println("Please enter bankaccount number: ");
  String bankaccount = scan.next();
  //System.out.println("Please choose ticket: ");
  double cashAmount = main.totalTicketPrice(); // skapa rätt adress för att hämta ticketpris
  Payment currentPayment = bank.checkPayment(bankaccount, cashAmount);

  System.out.println(currentPayment.isValid);
  System.out.println(currentPayment.nameOfBank);

}


}
