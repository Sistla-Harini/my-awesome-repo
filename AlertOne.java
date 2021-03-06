import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertOne {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//admin//Desktop//Harini//chromedriver.exe");
      WebDriver ObjDriver= new ChromeDriver();
      ObjDriver.get("http://ksrtc.in/oprs-web/ticket/waitlist.do");
      ObjDriver.manage().window().maximize();
      ObjDriver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
      System.out.println(ObjDriver.switchTo().alert().getText());
      try {
    	  Thread.sleep(5000);
      }
      catch(InterruptedException e)
      {
    	  e.printStackTrace();
      }
      ObjDriver.switchTo().alert().accept();
      ObjDriver.quit();
      }
      
}

