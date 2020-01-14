import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb2 
{
	public static void main(String[] args)
	{
	   Properties objprop = new Properties();
	   try
	   {
		   objprop.load(new FileInputStream("C://java//data1.properties"));
	   }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   } 
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   System.out.println("email"+objprop.getProperty("login1"));
	   System.out.println("password"+objprop.getProperty("pwd1"));
	   System.setProperty("webdriver.chrome.driver", 
			   "C://Users//admin//Desktop//Harini//chromedriver.exe");
	   WebDriver ObjDriver = new ChromeDriver();
	   ObjDriver.get("http://demo.automationtesting.in/SignIn.html");
       System.out.println("Register page loaded");
       String var1 = ObjDriver.getTitle();
       System.out.println("Title of the page :" +var1);
       WebElement Obj1 = ObjDriver.findElement(By.xpath("//html/body/div/div/div[2]/input"));
       Obj1.sendKeys(objprop.getProperty("login1"));
       WebElement Obj2 = ObjDriver.findElement(By.xpath("//html/body/div/div/div[3]/input"));
       Obj2.sendKeys(objprop.getProperty("pwd1"));
       WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"enterbtn\"]"));
       Obj3.click();
       WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"errormsg\"]"));
       if(Obj4.isDisplayed());
       {
    	   System.out.println(Obj4.getText());
       }
       
       
      
       /*String var2 = ObjDriver.getTitle();
       System.out.println("Title of the page" +var2);
       ObjDriver.quit();*/
	}
}
