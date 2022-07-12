package generatortest;

import cabinvoicegenerator.FareException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabFareCalculationTest {
    CabFareCalculationTest cabFairCalculation = new CabFareCalculationTest();

    //Test for multiple rides
    @Test
    public void checkCabFairCalculation() throws FareException {
        int expected = 0;
        expected += cabFairCalculation.fareCalculation(10,1);
        expected += cabFairCalculation.fareCalculation(11,2);
        expected += cabFairCalculation.fareCalculation(12,3);
        Assertions.assertEquals(expected,336);
    }

    private int fareCalculation(int i, int i1) {
        return i;
    }
}
