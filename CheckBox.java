import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//admin//Desktop//Harini//chromedriver.exe");
      WebDriver ObjDriver= new ChromeDriver();
      ObjDriver.get("http://demo.automationtesting.in/Register.html");
      WebElement checkbox =ObjDriver.findElement(By.xpath("//*[@id='checkbox1']"));
      checkbox.click();
      boolean status = checkbox.isSelected();
      System.out.println("checkbox is selected >>"+status);
      WebElement checkbox1 =ObjDriver.findElement(By.xpath("//*[@id='checkbox2']"));
      checkbox1.click();
      boolean status1= checkbox.isSelected();
      System.out.println("radio button is selected >>"+status1);
      WebElement checkbox2 =ObjDriver.findElement(By.xpath("//*[@id='checkbox3']"));
      checkbox2.click();
      boolean status2= checkbox.isSelected();
      System.out.println("radio button is selected >>"+status2);
      
}
}

 


