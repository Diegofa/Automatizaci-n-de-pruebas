package QA;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
private WebDriver driver;
	
	@Before 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
	@Test 
	public void testGooglePage() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("spotyfy");
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);	
		equals ("Spotyfy.com");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
