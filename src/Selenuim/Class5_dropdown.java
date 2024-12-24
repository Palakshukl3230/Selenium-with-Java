package Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class5_dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(f);
	WebElement un=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
    Actions a=new Actions(driver);
    WebElement t=driver.findElement(By.xpath("//div[@id='trash']"));
    a.dragAndDrop(un,t).perform();
    WebElement se=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
    a.dragAndDrop(se,t).perform();
    WebElement th=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
    a.dragAndDrop(th,t).perform();
    WebElement fh=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
    a.dragAndDrop(fh,t).perform();
}
}
