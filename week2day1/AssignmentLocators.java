package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentLocators {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--remote-allow-origins=*");
		
        //launch the browswer
		ChromeDriver driver = new ChromeDriver(options);
		
		//enter url
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(3000);
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
      //click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		 //click on Leads
        driver.findElement(By.linkText("Leads")).click();
        
        Thread.sleep(2000);
        //click on Create Lead
        driver.findElement(By.linkText("Create Lead")).click();
        
        //enter mandatory fields
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akanksha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
        
        //select employee in source dropdown using index
        
        WebElement srcA= driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select src= new Select(srcA);
        
        src.selectByIndex(4);
        
        
        //select automobile in marketcampaign using visibletext
        
        WebElement srcB= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select mac= new Select(srcB);
        mac.selectByVisibleText("Automobile");
        
        //select corporation in ownership using value (execution problem)
       // srcC = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        //Select own= new Select(srcC);
        //own.selectByValue("Corporation");
        
         Thread.sleep(3000);
         
        //click create
        driver.findElement(By.name("submitButton")).click();
        
        //verify the title
        
        String title = driver.getTitle();
        System.out.println("title");
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
