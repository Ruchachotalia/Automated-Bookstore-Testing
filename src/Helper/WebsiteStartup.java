package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteStartup {
	 public static WebDriver driver;
	
    
    public static void setup(){
    	 String driver_path = "C:\\Users\\architn\\\\ArchitJavaWorkspace\\OnlineBookStore\\drivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driver_path);
		 driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("http://examples.codecharge.com/store/Default.php");
	}
    public static void NavigateTo(String url)
    {
        if (driver != null)
            url = driver. getCurrentUrl();
		else
			try {
				throw new Exception("Browser not initialized");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}

