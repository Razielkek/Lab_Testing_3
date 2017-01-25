
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  @Before
  public void setUp() throws Exception {
	String pathToGeckoDriver = Paths.get("C:\\Users\\ZzZm0naxZzZ\\Desktop\\Лабы, бесплатно\\LAB3-master\\LAB3\\geckodriver.exe").toAbsolutePath().toString();
	System.setProperty("webdriver.gecko.driver", pathToGeckoDriver); 
    driver = new FirefoxDriver();
    baseUrl = "https://mail.ru/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("mailbox__login")).clear();
    driver.findElement(By.id("mailbox__login")).sendKeys("lab3Testing");
    driver.findElement(By.id("mailbox__password")).clear();
    driver.findElement(By.id("mailbox__password")).sendKeys("testirovaniepo");
    driver.findElement(By.id("mailbox__auth__button")).click();    
  }


}
