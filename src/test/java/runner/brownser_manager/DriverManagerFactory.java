package runner.brownser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

//Clase encargada de crear los distintos manegadores para los distintos navegadores
public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type ){
        DriverManager driverManager=null;

        switch(type){
            case CHROME:
                driverManager= new ChromeDriverManager();
                break;
            case FIREFOX:
                 driverManager= new FirefoxDriverManager();
                 break;
            default:
                System.out.print("Invalid browser Selected");
                break;
        }
        return driverManager;
    }

}
