package automatedpush;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pushing {
@Test
public static void main(String args[])
{
	System.out.println("launching");
	System.setProperty("webdriver.gecko.driver","T:\\STC drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("1234");
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("4321");
	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/div[2]/div/div/form/input")).click();
}
}

