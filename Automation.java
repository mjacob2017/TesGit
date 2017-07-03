import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://soltech.net/");
		driver.findElement(By.partialLinkText("MENU")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 
		
		driver.findElement(By.linkText("Open Positions")).click();
		Thread.sleep(5000);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
	     for (String handle : driver.getWindowHandles()) {

		    driver.switchTo().window(handle);}
				
		   URL = driver.getCurrentUrl();
			System.out.println(URL);
		 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,600)", "");
			Thread.sleep(5000);
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe")));
			driver.findElement(By.cssSelector("#jsb_f_keywords_i")).sendKeys("QA");
			driver.findElement(By.cssSelector("#jsb_form_submit_i")).click();
			driver.findElement(By.partialLinkText("Automation Engineer")).click();
			System.out.println(driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div/div/div/dl[1]/dd")).isDisplayed());
				 
		 		
			String s = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div/div/div/dl[1]/dd")).getText();
			System.out.println(s);
			
				
	}
	 
}
