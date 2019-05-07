package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest2  {	
	
CalcMain api = new CalcMain();

    @Test
    public void testApp(){
    	String sw = "10"; String sh = "15";
        assertEquals(176,  api.calculation(sw, sh));
    }
}
