package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


/*Inicia una instacia del navegador en el metodo setup y cuando escenario termina de ejecutarse se va
 a cerrar la instancia del navegador y para el proximo escenario va a setearlo y volver a cerrarlo.*/
public class Hooks {

    //driver de Chrome
    private static ChromeDriver driver;
    //numero de escenario que se esta ejecutando
    private static  int numberOfCase=0;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: "+ numberOfCase);

        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();;
    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: "+numberOfCase+ " se ejecuto correctamente");
        driver.quit();
    }

    //metodo estatico que devuelve la instancia del navegador
    public static ChromeDriver getDriver(){
        return driver;
    }

}
