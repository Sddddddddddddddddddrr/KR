package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest1  {
CalcMain api = new CalcMain();

    @Test
    public void testApp(){
    	String sw = "9"; String sh = "10";
        assertEquals(121,  api.calculation(sw, sh));
    }
}
