
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {
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
  public void test4() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.className("social__title__link")).click();
    driver.findElement(By.className("btn_txt_strong")).click();    
  }


}
