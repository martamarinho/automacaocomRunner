package MetodosAdvantegeDemo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosdeTela {

	WebDriver driver;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void preencher(By elemnto, String texto) {
		driver.findElement(elemnto).sendKeys(texto);
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validartexto(By elemento, String textoesperado) {
		String texto = driver.findElement(elemento).getText();
		System.out.println(texto);
		assertEquals(textoesperado, texto);

	}

	public void tirarPrint(String print) throws IOException {
		TakesScreenshot print1 = ((TakesScreenshot) driver);
		File srcFile = print1.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(print);
		FileUtils.copyFile(srcFile, Desfile);

	}
	public void scroll(String string) {
		WebElement element = driver.findElement(null);
		((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",element);
	}
}