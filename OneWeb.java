import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//admin//Desktop//Harini//chromedriver.exe");
      WebDriver ObjDriver= new ChromeDriver();
      ObjDriver.get("http://demo.opencart.com");
      System.out.println("Open cart page loaded");
      String var1 = ObjDriver.getTitle();
      System.out.println("Title of the page:"+var1);
      WebElement Obj1= ObjDriver.findElement(By.xpath("//a [@href=\'https://demo.opencart.com/index.php?route=account/account']"));
      Obj1.click();
      WebElement Obj2=ObjDriver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a"));
      Obj2.click();
      WebElement Obj3=ObjDriver.findElement(By.xpath("//*[@id=\'input-email\']"));
      Obj3.sendKeys("harinis1298@gmail.com");
      WebElement Obj4=ObjDriver.findElement(By.xpath("//*[@id=\'input-password\']"));
      Obj4.sendKeys("hahahaha");	
    		 /* String var2= ObjDriver.getTitle();
      System.out.println("Title of the page"+var2);
      ObjDriver.quit();*/
	}

}
