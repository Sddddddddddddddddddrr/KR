package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest4  {
	
	
CalcMain api = new CalcMain();

    @Test
    public void testApp(){
    	String sw = "20"; String sh = "20";
        assertEquals(441,  api.calculation(sw, sh));
    }
}
