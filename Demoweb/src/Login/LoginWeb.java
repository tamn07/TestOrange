package Login;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import graphql.Assert;

public class LoginWeb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Shared/Documents/javabasic1/setupfile/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//1. Maximize browser của mình 
		driver.manage().window().maximize();
		
		//2. Trỏ link Web 
		driver.navigate().to("https://pwa-orange.snaptec.co/login");
		
		//3. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		
		//Đối tượng của Web Elenment
		//Click vào button Login
		//Button, input, link, dropdown, dialog, header_Page,...
		
		
		//4. Nhấn allow locator 
	
		/*
		WebElement okButton = driver.findElement(By.xpath("//button[normalize-space()='Agree']"));		
		okButton.click();
		Thread.sleep(2000);
		
		//4. Nhấn  locator 
		WebElement account = driver.findElement(By.xpath(" //span[@class='accountChip-root-3cE']"));		
		account.click();
		Thread.sleep(2000);
		*/
		//5. Nhập đói tượng của web
		WebElement keyWord = driver.findElement(By.xpath("//*[@class = 'signIn-phone-35m form-control' and @placeholder = '+966 000 - 000 - 000' and @type = 'tel' and @name = 'phone']"));
		keyWord.sendKeys("567567567");
		Thread.sleep(2000);
		
		
		WebElement sendKey = driver.findElement(By.xpath(" //button[@type='submit']"));		
		sendKey.click();
		Thread.sleep(2000);
    	
		//7. 
		  String str="Verification";

		 //    Assert.assertEquals(true, str.contains("selenium"),"custom message");
		     //o
		    Assert.assertTrue(str.contains("Verification"));
		    System.out.println("true");
		    Thread.sleep(2000);  
		    
    	//Storing the text of the heading in a string
    	/*
			//6.Verify test
		String expectedHeading = "test";
		String heading = driver.findElement(By.xpath("//span[@class='searchPage-headingHighlight-pjR']")).getText();
    	Thread.sleep(5000);
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		*/
		    
		   WebElement enterOTP = driver.findElement(By.xpath("(//input[@value=''])[2]"));		
			enterOTP.sendKeys("3691");
			Thread.sleep(2000);
	    	
		    
		    
		//6. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		//7. Quit Browser
		driver.quit();
	}

}
