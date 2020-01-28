import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\eclipse-workspace\\Selenium830AM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
	WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("ajith");
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("12345");
		
		WebElement frameWork= driver.findElement(By.id("login"));
		frameWork.click();
	}
}
