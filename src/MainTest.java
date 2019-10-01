import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

    @Test
    public void mainTest (){

        double a = 4;
        double b = 5;
        double pole = 20;

        assertEquals(pole, a*b, 1);

    }

}