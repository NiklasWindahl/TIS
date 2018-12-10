public class TIS_Transaction{

TIS_Tickets Ticket = new TIS_Tickets();
MHS_Bank Bank = new MHS_Bank();

Scanner scan = new Scanner(System.in);

String transaction = "-1";
double cashAmount = 0;
// MHS get bankaccount
// MHS get bank

public String createPayment(){
  System.out.println("Please enter bankaccount number: ");
  String bankaccount = scan.next();
  System.out.println("Please choose ticket: ");
  //
  /* for (int i = 0; i < Bank.accounts.size(); i++) {
    if (bankaccount.equals(Bank.accounts.get(i))) {
      bankaccount = -1;
    }
  } */
  return bankaccount;
  return cashAmount;
}

checkPayment(){
  //Bank.check();
}

public static void main(String[] args) {

  }
}
