//package Selenium;// Generated by software.spence.Movies.Selenium IDE
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class PenIslandTest {
//  private WebDriver driver;
//  private Map<String, Object> vars;
//  JavascriptExecutor js;
//  @Before
//  public void setUp() {
//    WebDriverManager.chromedriver().setup();
//
//
//    driver = new ChromeDriver();
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
//  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
//  @Test
//  public void penIsland() {
//    driver.get("https://penisland.net/");
//    driver.manage().window().setSize(new Dimension(786, 824));
//    driver.findElement(By.linkText("Wood")).click();
//    driver.findElement(By.linkText("Plastic")).click();
//    driver.findElement(By.linkText("Samples")).click();
//    driver.findElement(By.linkText("Testimonials")).click();
//    driver.findElement(By.linkText("FAQ")).click();
//    driver.findElement(By.linkText("Testimonials")).click();
//    driver.close();
//  }
//}