public class ItalyTrip{
    //INSTANCE VARIABLES
    private String coastType;
    private boolean ifNeedPaymentPlan;
    private int durationOfTrip;
    private boolean isLuxury;
    private boolean isOutdoorsy;
    private boolean isExploratory;
    private double totalCost;
    private static int processingFee = 55; 

public ItalyTrip (){
    this.coastType = "Amalfi Coast";
    this.ifNeedPaymentPlan = true; 
    this.durationOfTrip = 7;
    this.isLuxury = true;
    this.isOutdoorsy = false;
    this.isExploratory = false;
    this.totalCost = durationOfTrip * processingFee;
}

public ItalyTrip (String ct, int n, boolean t , int d, boolean lt , boolean ot, boolean et) {
    this.coastType = ct;
    this.ifNeedPaymentPlan = t; 
    this.durationOfTrip = n;
    this.isLuxury = lt;
    this.isOutdoorsy = ot;
    this.isExploratory = et;
    this.totalCost = durationOfTrip * processingFee;
}

//getters
public String getCoastType(){
    return this.coastType;
}
public boolean getIfNeedPaymentPlan(){
    return this.ifNeedPaymentPlan;
}
public int getDurationOfTrip(){
    return this.durationOfTrip;
}
public boolean getIsLuxury(){
    return this.isLuxury;
}
public boolean getIsOutdoorsy(){
    return this.isOutdoorsy;
}
public boolean getIsExploratory(){
    return this.isExploratory;
}
public double getTotalCost(){
    return this.totalCost;
}

//setters
public void setCoastType (String c){
    this.coastType = c;
}

public void setIfNeedPaymentPlan (boolean p){
    this.ifNeedPaymentPlan = p;
}

public void setDurationOfTrip (int dt){
    this.durationOfTrip = dt;
}

public void setIsLuxury ( boolean l){
    this.isLuxury = l;
}

public void setIsOutdoorsy (boolean o){
    this.isOutdoorsy = o;
}

public void setIsExploratory (boolean e){
    this.isExploratory = e;
}

public String toString() {
  String itinerary = "-----------------------------------------\n" +
                     "       ✨ Italy Trip ✨        \n" +
                     "-----------------------------------------\n" +
                     "Coast Type:    " + coastType + "\n" +
                     "Do You Need A Payment Plan: (true/false)   " + ifNeedPaymentPlan + "\n" +
                     "STAY DURATION: " + durationOfTrip + " Nights\n" +
                     "Do you want luxury (true/false):" + isLuxury + " \n" +
                     "Do you want Outdoorsy (true/false):" + isOutdoorsy + " \n" +
                     "Do you want Exploratory (true/false):" + isExploratory + " \n" +
                     "-----------------------------------------\n" +
                     "TOTAL COST:  $" + totalCost + ".00\n" +
                     "-----------------------------------------\n" +
                     "  Thank you for booking with Wanderlust! \n";
  return itinerary;  
}



}//end class
