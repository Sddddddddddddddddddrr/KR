package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest5  {
		
CalcMain api = new CalcMain();

    @Test
    public void testApp(){
    	String sw = "25"; String sh = "20";
        assertEquals(546,  api.calculation(sw, sh));
    }
}
