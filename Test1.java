import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//admin//Desktop//Harini//chromedriver.exe");
      WebDriver ObjDriver= new ChromeDriver();
      ObjDriver.get("http://demo.opencart.com");
      System.out.println("open cart page loaded");
      WebElement Obj1 = ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"));
      Obj1.click();
      WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"));
      Obj2.click();
      WebElement Objpro = ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[1]"));
      Objpro.click();
      WebElement Objsho = ObjDriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i"));
      Objsho.click();
      WebElement Objcur = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button"));
      Objcur.click();
      WebElement Objeur = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button"));
      Objeur.click();
      /*WebElement Objpou = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button"));
      Objpou.click();*/
      /*WebElement Objus = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button"));
      Objus.click();*/
      WebElement Objout = ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]"));
      Objout.click();
       System.out.println(Objout.getText());    

      
      
 	}

}
