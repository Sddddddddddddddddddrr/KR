package pi.KR;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * В теле данного класса расположен метод для проверки точности
 * расчётов суммы вклада с учётом капитализации
 */
public class AppTest1  {
CalcMain api = new CalcMain();
	
	@Test
	public void testRunApp() {
		new CalcMain(); //can it run application
	}

    @Test
    public void testApp(){
    	String sw = "10"; String sh = "10";
        assertEquals(121,  api.calculation(sw, sh));
    }
}
