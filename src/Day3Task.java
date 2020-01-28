import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Selenium830AM\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement intQus= driver.findElement(By.xpath("//input[@id='from_station']"));
		intQus.sendKeys("chennai");
		
		WebElement clic= driver.findElement(By.xpath("//input[@id='to_station']"));
		clic.sendKeys("trichy");
		WebElement com= driver.findElement(By.xpath("//select[@id='trainClass']"));
		com.sendKeys("trichy");
		WebElement date= driver.findElement(By.xpath("//input[@name='depart_date']"));
		date.sendKeys("12/01/2019");
		WebElement adult= driver.findElement(By.xpath("//select[@id='train_adults']"));
		adult.sendKeys("1");
		WebElement child= driver.findElement(By.xpath("//select[@id='train_children']"));
		child.sendKeys("1");
		WebElement seniorMen= driver.findElement(By.xpath("//select[@id='train_male_seniors']"));
		seniorMen.sendKeys("1");
		WebElement seniorWomen= driver.findElement(By.xpath("//select[@id='train_female_seniors']"));
		seniorWomen.sendKeys("1");
		WebElement senior= driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		senior.sendKeys("1");
		
				
		
	}

}
