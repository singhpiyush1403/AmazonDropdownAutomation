
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class DroupDown {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();

    driver.findElement(By.id("searchDropdownBox")).sendKeys("Computers");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
    driver.findElement(By.id("nav-search-submit-button")).click();
    
    System.out.println(driver.getTitle());
	}

}
