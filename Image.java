package week8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Image {
public static void main(String []args) throws InterruptedException, AWTException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com");
	Thread.sleep(1000);
	WebElement s= d.findElement(By.name("q"));
	s.sendKeys("cmrit hyderabad");
	s.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	WebElement img=d.findElement(By.xpath("//a[normalize-space()='Images']"));
	img.click();
	WebElement img1=d.findElement(By.xpath("//img[@alt='CMR Institute of Technology | Top Engineering College in Hyderabad']"));
	Actions a=new Actions(d);
	a.contextClick(img1).build().perform();
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	System.out.println("download");
	
	
	
}
}
