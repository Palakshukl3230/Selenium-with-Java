package Selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class4_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uncodemy.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement tb=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		Actions a=new Actions(driver);
		a.moveToElement(tb).perform();
		WebElement fs=driver.findElement(By.xpath("//a[normalize-space()='Full-Stack-Development']"));
		a.moveToElement(fs).perform();
		WebElement fsn=driver.findElement(By.xpath("//a[normalize-space()='Full Stack With NodeJs']"));
		fsn.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement ds=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[2]/a[1]"));
	    a.moveToElement(ds).perform();
	    WebElement py=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Python']"));
	    py.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
	    a.moveToElement(st).perform();
	    WebElement mt=driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));
	    mt.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement ct=driver.findElement(By.xpath("//a[normalize-space()='Cloud Tools']"));
	    a.moveToElement(ct).perform();
	    WebElement ma=driver.findElement(By.xpath("//a[normalize-space()='Microsoft Azure']"));
	    ma.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement dm=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[5]/a[1]"));
	    a.moveToElement(dm).perform();
	    WebElement seo=driver.findElement(By.xpath("//a[normalize-space()='SEO(SearchEngine Optimization)']"));
	    seo.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement jt=driver.findElement(By.xpath("//a[normalize-space()='Java Technology+']"));
	    a.moveToElement(jt).perform();
	    WebElement j=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Java']"));
	    j.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement ns=driver.findElement(By.xpath("//a[normalize-space()='Network & Security']"));
	    a.moveToElement(ns).perform();
	    WebElement vm=driver.findElement(By.xpath("//a[normalize-space()='Vmware']"));
	    vm.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement pl=driver.findElement(By.xpath("//a[normalize-space()='Programming Language']"));
	    a.moveToElement(pl).perform();
	    WebElement rp=driver.findElement(By.xpath("//a[normalize-space()='R Programming']"));
	    rp.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement c=driver.findElement(By.xpath("//a[normalize-space()='CAD Training']"));
	    a.moveToElement(c).perform();
	    WebElement ac=driver.findElement(By.xpath("//a[normalize-space()='AUTOCAD']"));
	    ac.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    WebElement gd=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[10]/a[1]"));
	    a.moveToElement(gd).perform();
	    WebElement g=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Graphic Designing']"));
	    g.click();
	    Thread.sleep(2000);
	    driver.navigate().back();	    
	    WebElement ud=driver.findElement(By.xpath("//a[normalize-space()='UI/UX Designing']"));
	    ud.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	}

}
