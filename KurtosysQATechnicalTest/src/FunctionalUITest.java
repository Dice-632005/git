import static org.testng.Assert.assertEquals;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FunctionalUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\TumiW\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Go to the J.P.Morgan Asset Management website
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		String baseURLS =  "https://am.jpmorgan.com/gb/en/asset-management/gim/adv/home"; 
		driver.get(baseURLS);
		
		//Disclaimer
		WebElement disclaimer;
		disclaimer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Accept Disclaimer")));
		disclaimer.click();

		//Find out more
		WebElement findoutmore = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]"));
		findoutmore.click();
		
		//Jump to a fund
		WebElement jumptoaFund = driver.findElement(By.id("jump-to-fund-placehoder"));
		jumptoaFund.click();
		jumptoaFund.sendKeys("GB0009698001");
		
		// Select fund
		WebElement selectFund =  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div/a/div/div[1]/span"));
		selectFund.click();
		
		//Validate 
		WebElement validateFund = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/div[1]/h3/span"));
		validateFund.click();
		///
		WebElement ValidateISIN = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/span[2]"));

		//  Performance and fees
		WebElement performanceFees = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/ul/li[2]/a/span\\"));
		performanceFees.click();
		
		// Performance Chart
		WebElement performanceChart = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/ul/li[2]/a"));
		performanceFees.click();
		
	}

}
