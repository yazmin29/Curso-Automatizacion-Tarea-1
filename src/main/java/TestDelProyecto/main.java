package TestDelProyecto;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class main {
	@Test
	public void registroAgreagarAlCarro() {
		String email = "yazmin.rodriguez.gutierrez@hotmail.com";
		String password = "yazmin1234";
		
		
	System.setProperty("webdriver.chrome.driver","C:/WebDriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); /*espera implicita*/
	
	
	
	driver.get("https://accounts.shutterfly.com/?redirectUri=https%3A%2F%2Fwww.shutterfly.com%2Fcart%3Fbrand%3DSFLY&cid=&brand=SFLY&theme=INC");
	driver.findElement(By.id("email")).sendKeys(email);/*Registro*/
	
	driver.findElement(By.name("password")).sendKeys(password);/*Registro*/
	
	driver.findElement(By.id("signInButton")).click();/*Registro*/
	
	WebDriverWait wait = new WebDriverWait(driver, 10); /*Espera explicita*/
	
	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bagsArea\"]/div/p/a")));
	button.click(); /*Espera explicita y xpath relativo --- Lista de compras*/
	
	WebElement buttonShop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div/div/section/div/div/button")));
	buttonShop.click(); /*Espera explicita y xpath absoluto --- Seleccion de tipo de articulo*/
	
	WebElement btnDrinkWare = wait.until(ExpectedConditions.elementToBeClickable(By.className("loaded")));
	btnDrinkWare.click();/*Espera explicita y localizador con clase -- Seleccion de tipo de articulo*/
	
	WebElement btnShopBook = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("SHOP GIFTS")));
	btnShopBook.click();/*Espera explicita y localizador linktext --- Tematica del producto*/
	
	
	
	WebElement btnProducto = wait.until(ExpectedConditions.elementToBeClickable(By.className("productWrapper")));
	btnProducto.click(); /*Espera explicita y localizador className --- Diseño del producto*/
	
	WebElement btnTipoProducto = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app-container\"]/div/div[4]/div[1]/div[2]/div[2]/div/a/div/img")));
	btnTipoProducto.click(); /*Espera explicita y localizador xpath relativo--- Efecto del producto*/
	
	WebElement btnPersonalizacion = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PERSONALIZE")));
	btnPersonalizacion.click(); /*Espera explicita y localizador linktext --- personalizacion del producto*/
	
	WebElement btnAgregarCarrito = wait.until(ExpectedConditions.elementToBeClickable(By.id("addToCartLink")));
	btnAgregarCarrito.click(); /*Espera explicita y localizador id--- Agregar al carrito*/
	
	
	
	WebElement btnIgnorar = wait.until(ExpectedConditions.elementToBeClickable(By.id("ErrorWarningsModalButton0")));
	js.executeScript("arguments[0].click();",btnIgnorar); /*Espera explicita y localizador id, utilizando js--- Ignorar la personalizacion del producto y finalizar accion de agregar*/
	}
	
	
}