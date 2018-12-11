public class MHS_Main{

  public MHS_Main(){
  }

  public Payment checkPayment(String accountNumber, double totalSum) {
    // dummy Payment
    Payment payment = new Payment();
    payment.isValid = true;
    payment.nameOfBank = "KalleAnkaBanken";
    return payment;
  }

  public void reset(){
    // not needed anymore...
  }

}