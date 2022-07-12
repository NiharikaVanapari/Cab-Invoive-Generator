package cabinvoicegenerator;

public class CabFareCalculation {
    //First Step
    private static int minimumFair = 5;
    public static int fareCalculation(int distance, int minutes) throws FareException {
        int amount = 0;
        amount+=(distance*10)+minutes;

        if(amount<minimumFair){
            throw new FareException("The fair is less than minimum fair: "+minimumFair);
        }
        return amount;
    }
}
