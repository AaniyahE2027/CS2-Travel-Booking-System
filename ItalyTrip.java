public class ItalyTrip{
    //INSTANCE VARIABLES
    private String coastType;
    private int processingFee;
    private boolean ifNeedPaymentPlan;
    private int durationOfTrip;
    private boolean isLuxury;
    private boolean isOutdoorsy;
    private boolean isExploratory;
    private double totalCost;

public ItalyTrip (){
    this.coastType = "Amalfi Coast";
    this.processingFee = 50;
    this.ifNeedPaymentPlan = true; 
    this.durationOfTrip = 7;
    this.isLuxury = true;
    this.isOutdoorsy = false;
    this.isExploratory = false;
    this.totalCost = 1500.60;
}

public ItalyTrip (String ct, int n, boolean t , int d, boolean lt , boolean ot, boolean et) {
    this.coastType = ct;
    this.processingFee = n;
    this.ifNeedPaymentPlan = t; 
    this.durationOfTrip = n;
    this.isLuxury = lt;
    this.isOutdoorsy = ot;
    this.isExploratory = et;
    this.totalCost = 1500.60;
}






}//end class
