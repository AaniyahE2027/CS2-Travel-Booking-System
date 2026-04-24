import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      ItalyTrip trip1 = new ItalyTrip("Cilento Coast", 50 , true, false, true);
      System.out.println(t1);
   }
   // below the main method but inside Main class
   // method to create objects
   public static ItalyTrip bookTrip (Scanner scan){
      ItalyTrip trip1 = new ItalyTrip ();
      System.out.println("What is your prefered coast type? ");
      String coastType = scan.nextLine();
      System.out.println("Do you want a payment plan? true/false ");
      boolean ifNeedPaymentPlan = scan.nextBoolean();
      scan.nextLine();
      System.out.println("How long would your travel be? ");
      int durationOfTrip = scan.nextInt();
      scan.nextLine();
      System.out.println("Do you want a luxury vaca? true/false ");
      boolean isLuxury = scan.nextBoolean();
      scan.nextLine();

      System.out.println("Do you want an Outdoors? true/false ");
      boolean isOutdoorsy = scan.nextBoolean();
      scan.nextLine();

      System.out.println("Do you want to explore? true/false ");
      boolean isExploratory = scan.nextBoolean(); 
      scan.nextLine();

      trip1.setCoastType(coastType);
      trip1.setIfNeedPaymentPlan(ifNeedPaymentPlan);
      trip1.setDurationOfTrip(durationOfTrip);
      trip1.setIsLuxury(isLuxury);
      trip1.setIsOutdoorsy(isOutdoorsy);
      trip.setIsExploratory(isExploratory);
      trip1.setTotalCost();
      return trip1;

   }
}
