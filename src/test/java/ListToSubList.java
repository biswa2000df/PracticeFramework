

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListToSubList {
	
	public WebDriver driver;
	
	ListToSubList(){
		System.out.println("Parent Constructor");
	}
	@Test
	public void inti() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.get("https://edureka.co");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[text()='Categories'])[2]"))).build().perform();
//		act.moveToElement(driver.findElement(By.xpath("//*[text()='Data Science']"))).build().perform();
//		Thread.sleep(3000);
//		act.moveToElement(driver.findElement(By.xpath("//*[text()='Statistics Essentials for Analytics']"))).click().build().perform();
//		Thread.sleep(10000);
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
