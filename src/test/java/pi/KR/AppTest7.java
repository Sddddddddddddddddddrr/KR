package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest7 {
	
CalcMain api = new CalcMain();

    @Test
    public void testApp(){
    	String sw = "25"; String sh = "30";
        assertEquals(806,  api.calculation(sw, sh));
    }
}
