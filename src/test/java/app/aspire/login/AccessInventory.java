package app.aspire.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessInventory {
	
	@Test
	public void navigatetoInventory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://aspireapp.odoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("user@aspireapp.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@sp1r3app");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Inventory')]")));
		driver.findElement(By.xpath("//*[contains(text(),'Inventory')]")).click();
	}

}
