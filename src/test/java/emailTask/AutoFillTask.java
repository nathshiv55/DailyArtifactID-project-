package emailTask;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoFillTask {

    @Test
	public void dailyTaskMethod()
	{
    	
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Documents\\geckodriver-v0.33.0-win64\\geckodriver.exe");

    	// Create object of ChromeDriver class
    	WebDriver driver=new FirefoxDriver();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	
    	driver.get("https://www.facebook.com/");
    	
    	/*
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
         driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdk9qus2RZlWEl-II3RJU33z38q5IuwXdFoHQpFX_yqZct_fA/viewform");

driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/span/span")).click();
driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shiv.8dots@gmail.com");
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));
driver.findElement(By.xpath(""));

    */
       
	}
    @AfterClass
    public static void swipeScreen()
	{
		
		TouchAction act = new TouchAction(driver);
		@SuppressWarnings("deprecation")
		//AndroidTouchAction act = new AndroidTouchAction((PerformsTouchActions) driver);
		PointOption p = new PointOption();
		

		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println("Height = "+height +","+"Width = "+width);    //Height = 2034,Width = 1080
		
		int startx=0;

		int endx=0;

		int starty=(int) (height*.20);

		int endy=(int) (height*.80);

		
		act.press(p.point(startx,starty)).moveTo(p.point(endx,endy)).release().perform();		
		

	}

}
