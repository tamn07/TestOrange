package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import graphql.Assert;

public class Search_bar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Shared/Documents/javabasic1/setupfile/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//1. Maximize browser của mình 
		driver.manage().window().maximize();
		
		//2. Trỏ link Web 
		driver.navigate().to("https://pwa-orange.snaptec.co/");
		
		//3. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		
		//Đối tượng của Web Elenment
		//Click vào button Login
		//Button, input, link, dropdown, dialog, header_Page,...
		
		
		//4. Nhấn allow locator 
		WebElement okButton = driver.findElement(By.xpath("//button[normalize-space()='OK']"));		
		okButton.click();
		Thread.sleep(2000);
		
		
		//5. Nhập đói tượng của web
		WebElement keyWord = driver.findElement(By.name("search_query"));
		keyWord.sendKeys("test");
		Thread.sleep(2000);
		
		
		WebElement enterKey = driver.findElement(By.name("search_query"));		
		enterKey.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
	
    	
		//7. 
		  String str="results for test";

		 //    Assert.assertEquals(true, str.contains("selenium"),"custom message");
		     //o
		    Assert.assertTrue(str.contains("results for teeeest"));
		    System.out.println("true");
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
		//6. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		//7. Quit Browser
		driver.quit();
	}

}
