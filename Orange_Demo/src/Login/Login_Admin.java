package Login;

import org.openqa.selenium.By;
//Khai báo hàm
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Admin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\autotest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1. Maximize browser của mình 
		driver.manage().window().maximize();
		
		//2. Trỏ link Web 
		driver.navigate().to("https://orange.snaptec.co/admin_1gekij/admin/");
		
		//3. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		
		//Đối tượng của Web Elenment
		//Click vào button Login
		//Button, input, link, dropdown, dialog, header_Page,...
		
		//4. Nhập đói tượng của web
		WebElement email_Login = driver.findElement(By.xpath("//input[@id='username']"));
		email_Login.sendKeys("qatester");
		Thread.sleep(2000);
		
		WebElement pass_Login = driver.findElement(By.xpath("//input[@id='login']"));
		pass_Login.sendKeys("admin@123");
		Thread.sleep(2000);
		
		WebElement button_LoginAccount = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		button_LoginAccount.click();
		Thread.sleep(2000);
		
		//Verify test
		String expectedHeading = "Dashboard";
    	
    	//Storing the text of the heading in a string
    	String heading = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
		
		//6. Set time chờ: phải use thư viện mới dùng được 
		Thread.sleep(2000);
		//7. Quit Browser
		driver.quit();
	}
}
