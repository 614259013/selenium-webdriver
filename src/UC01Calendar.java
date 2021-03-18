import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC01Calendar {

	@Test
	void TC101() throws Exception {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/calendar/selectDate.php");
	    driver.findElement(By.name("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("month"));
	      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
	    }
	    driver.findElement(By.name("month")).click();
	    driver.findElement(By.id("date")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("date"));
	      dropdown.findElement(By.xpath("//option[. = '3']")).click();
	    }
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.cssSelector("input")).click();
	    String actualString = driver.findElement(By.id("result")).getText();

		String expectedString = "Wednesday";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

	    driver.close();
	}
	
	@Test
	void TC102() throws Exception {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/calendar/selectDate.php");
	    driver.findElement(By.name("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("month"));
	      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
	    }
	    driver.findElement(By.name("month")).click();
	    driver.findElement(By.id("date")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("date"));
	      dropdown.findElement(By.xpath("//option[. = '15']")).click();
	    }
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.cssSelector("input")).click();
	    String actualString = driver.findElement(By.id("result")).getText();

		String expectedString = "Friday";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

	    driver.close();
	}
	@Test
	void TC103() throws Exception {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmilk\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmilk\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/calendar/selectDate.php");
	    driver.findElement(By.name("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("month"));
	      dropdown.findElement(By.xpath("//option[. = 'April']")).click();
	    }
	    driver.findElement(By.name("month")).click();
	    driver.findElement(By.id("date")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("date"));
	      dropdown.findElement(By.xpath("//option[. = '20']")).click();
	    }
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.cssSelector("input")).click();
	    String actualString = driver.findElement(By.id("result")).getText();

		String expectedString = "Tuesday";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

	    driver.close();
	}
}