package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		
        //launch the browswer
		ChromeDriver driver = new ChromeDriver(options);
		
		//enter url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(3000);
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//print title
	     String title = driver.getTitle();
	     System.out.println("title");
	     
	     //click on CRM/SFA
         driver.findElement(By.linkText("CRM/SFA")).click();
         
         Thread.sleep(2000);
         
         //click on Leads
         driver.findElement(By.linkText("Leads")).click();
         
         Thread.sleep(2000);
         //click on Create Lead
         driver.findElement(By.linkText("Create Lead")).click();
         
         
         //enter company name
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         
         //enter the firstname
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akanksha");
         
         //enter the last name
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
         
         
         //DropDown
         
        driver.findElement(By.id("createLeadForm_dataSourceId"));
         Thread.sleep(2000);
         
         //click on CreateLead Button
         //WebElement SourceA = driver.findElement(By.id("createLeadForm_dataSourceId"));
         //Select sec = new Select(SourceA);
         
         //	select by Index
        // sec.selectByIndex(2);
         
         //select by value
         //sec.selectByValue("LEAD_TRADESHOW");
         
	
	//select by visibletext
         //sec.selectByVisibleText("Public Relations");
         
	//click on CreateLead
         driver.findElement(By.name("submitButton")).click();
    Thread.sleep(2000);
    
    //close browser
    
    driver.close();
	}

}
