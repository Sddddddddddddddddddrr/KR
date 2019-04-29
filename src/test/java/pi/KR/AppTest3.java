package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * В теле данного класса расположен метод для проверки точности
 * расчётов суммы вклада
 */
public class AppTest3 {
	
CalcMain api = new CalcMain();
	
	@Test
	public void testRunApp() {
		new CalcMain(); //can it run application
	}

    @Test
    public void testApp(){
    	String sw = "15"; String sh = "15";
        assertEquals(256,  api.calculation(sw, sh));
    }
}
