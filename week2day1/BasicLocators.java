package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException  {
		Thread t = new Thread();
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		//driver setup
		ChromeDriver driver = new ChromeDriver(options);
	//load url	
        driver.get("https://www.facebook.com");
   //maximize browser
        driver.manage().window().maximize();
        t.sleep(3000);
        //close the browser
        driver.close();
        
	}

}
