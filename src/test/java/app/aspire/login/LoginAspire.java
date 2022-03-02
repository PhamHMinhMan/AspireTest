package app.aspire.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAspire {
	
	@Test
	public void loginByUser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://aspireapp.odoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("user@aspireapp.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@sp1r3app");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
