import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class TIS_Tickets {

  public static ArrayList<String> ticketName =
          new ArrayList<String>(Arrays.asList(
                  "Barn",
                  "Ung vuxen",
                  "Vuxen",
                  "Senior",
                  "Familj"));
  public static ArrayList<String> ticketDescription =
          new ArrayList<String>(Arrays.asList(
                  "För personer mellan 1 och 10 år.",
                  "För personer mellan 11 och 17 år.",
                  "För personer mellan 18 och 64 år.",
                  "För personer 64 år eller äldre.",
                  "För en grupp av 1-2 vuxna/seniorer och 1-3 barn."));
  public static ArrayList<Double> ticketPrice =
          new ArrayList<Double>(Arrays.asList(
                  10.00,
                  15.50,
                  22.50,
                  15.00,
                  40.50));

  /*
  public ticketMap(){
    HashMap<String,Double> tickets = new HashMap<String,Double>();
    tickets.put("Child",10.00);
    tickets.put("Young adult",15.50);
    tickets.put("Adult",22.50);
    tickets.put("Senior",15.00);
    tickets.put("Family",40.50);
    }
  */

}





/*  public static ArrayList<String> child = new ArrayList<String>();
  public static ArrayList<String> youngAdult = new ArrayList<String>();
  public static ArrayList<String> adult = new ArrayList<String>();
  public static ArrayList<String> adultSeniors = new ArrayList<String>();
  public static ArrayList<String> seionr= new ArrayList<String>();
  public static ArrayList<String> familyTicket = new ArrayList<String>();

  public void createBuyer() {

  child.add("Child: ");

  youngAdult.add("Young adult: ");

  adult.add("Adult: ");

  senior.add("Senior: ");

  senior.add("Fam: ");

} */
