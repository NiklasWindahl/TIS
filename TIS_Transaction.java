import java.util.Scanner;

public class TIS_Transaction{

  static MHS_Main bank = new MHS_Main();

  String transaction = "-1";
  double cashAmount = 0;

  // TIS_Tickets ticket = new TIS_Tickets();
  // Scanner scan = new Scanner(System.in);
  // TIS_Main main = new TIS_Main();


public static Payment createPayment(String bankaccount, double cashAmount){

  bankaccount = bankaccount.replace("-", "");

  Payment currentPayment = bank.checkPayment(bankaccount, cashAmount);

  return currentPayment;

}


}
