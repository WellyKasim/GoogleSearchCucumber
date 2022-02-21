package googleSearchPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	
	public void verifyLoging() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abduw\\Webdriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com");
    driver.findElement(By.name("field-keywords")).sendKeys("book"+Keys.ENTER);
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.quit();
	}
}
