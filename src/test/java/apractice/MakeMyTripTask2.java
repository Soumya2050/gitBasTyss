package apractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MakeMyTripTask2 {
	
	@Test
	public void test2() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		a.click().perform();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
		
		WebElement from = driver.findElement(By.xpath("//div[@class='calc60']/p[contains(text(),'Bengaluru')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(from)).click();
		
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bhubaneswar");
		
		WebElement to = driver.findElement(By.xpath("//div[@class='calc60']/p[contains(text(),'Bhubaneswar')]"));
		wait.until(ExpectedConditions.elementToBeClickable(to)).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'July')]/../following-sibling::div/div/descendant::p[text()=20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'August')]/../following-sibling::div/div/descendant::p[text()=15]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'travellers')]/descendant::p[text()=\"ADULTS (12y +)\"]/following-sibling::ul/li[@data-cy='adults-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'travellers')]/descendant::p[text()=\"CHILDREN (2y - 12y )\"]/following-sibling::ul/li[@data-cy='children-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'travellers')]/descendant::p[text()=\"INFANTS (below 2y)\"]/following-sibling::ul/li[@data-cy='infants-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		a.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
