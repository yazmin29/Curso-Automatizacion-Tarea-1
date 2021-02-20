package TestDelProyecto;

import org.testng.annotations.Test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertas{
	
	@Test
	
	public void ejemAletas() {
		System.setProperty("webdriver.chrome.driver","C:/WebDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement btnAceptar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"OKTab\"]/button")));
		btnAceptar.click(); /*Espera explicita y localizador xpath relativo---  alerta aceptar*/
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement btnCancel1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")));
		btnCancel1.click();/*Espera explicita y localizador xpath absoluto--- aletar cancelar*/
		
		WebElement btnCancel2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"CancelTab\"]/button")));
		btnCancel2.click();
		
		Alert alertCancel = driver.switchTo().alert();
		alertCancel.dismiss();
		

		
		
	}	
	
}