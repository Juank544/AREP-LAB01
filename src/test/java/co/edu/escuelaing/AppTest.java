package co.edu.escuelaing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import co.edu.escuelaing.service.TempService;
import co.edu.escuelaing.service.impl.TempImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    TempService tempService;

    public AppTest() {
        this.tempService = new TempImpl();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void negativeCtoF(){
        String res = String.valueOf(tempService.CelsiusToFahrenheit(-10));
        assertEquals(res,"14.0");
    }

    @Test
    public void ceroCtoF(){
        String res = String.valueOf(tempService.CelsiusToFahrenheit(0));
        assertEquals(res,"32.0");
    }

    @Test
    public void positiveCtoF(){
        String res = String.valueOf(tempService.CelsiusToFahrenheit(10));
        assertEquals(res,"50.0");
    }

    @Test
    public void negativeFtoC(){
        String res = String.valueOf(tempService.FahrenheitToCelsius(-10));
        assertEquals(res,"-23.33");
    }

    @Test
    public void ceroFtoC(){
        String res = String.valueOf(tempService.FahrenheitToCelsius(0));
        assertEquals(res,"-17.78");
    }

    @Test
    public void positiveFtoC(){
        String res = String.valueOf(tempService.FahrenheitToCelsius(10));
        assertEquals(res,"-12.22");
    }
}
