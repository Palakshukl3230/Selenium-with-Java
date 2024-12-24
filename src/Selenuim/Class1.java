package Selenuim;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement un=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
un.sendKeys("Admin");
WebElement ps=driver.findElement(By.xpath("//input[@type=\"password\"]"));
ps.sendKeys("admin123");
WebElement cl=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
cl.click();
Thread.sleep(2000);
WebElement bz=driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
bz.click();
Thread.sleep(2000);
WebElement b=driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
b.sendKeys("Helloworld");
WebElement h=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
h.click();
	}

}
