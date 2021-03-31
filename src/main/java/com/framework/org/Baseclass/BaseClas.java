package com.framework.org.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.AllArguments;

public class BaseClas {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				// driver = new FireFoxDriver();

			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getCurrentUrl(String CurrentUrl) {
		driver.get(CurrentUrl);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void navigation(String url) {
		driver.navigate().to(url);

	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void get(String str) {
		driver.get(str);

	}

	public static void alert(String Alert, String options) {
		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (options.equalsIgnoreCase("Reject")) {
			driver.switchTo().alert().dismiss();
		} else if (options.equalsIgnoreCase("sendkeys")) {
			driver.switchTo().alert().sendKeys(Alert);
		}

	}

	public static void action(WebElement element) {
		Actions a = new Actions(driver);

		a.contextClick(element).build().perform();

	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);

		a.doubleClick(element).build().perform();

	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);

		a.moveToElement(element).build().perform();

	}

	public static void dragAndDrop(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);

		a.dragAndDrop(element, element1).build().perform();

	}

	public static void frames(String Frame) {
		driver.switchTo().frame(Frame);
	}

	public static void frame1(Integer Frame1) {
		driver.switchTo().frame(Frame1);

	}

	public static void frame2(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void windowHandles(String choose) {
		Set<String> wh = driver.getWindowHandles();
		for (String string : wh) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);

			if (driver.switchTo().window(string).getTitle().equals(choose)) {
				driver.close();
			}
		}

	}

	public static void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));

		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}

	}

	public void click(WebElement Cl) {
		Cl.click();

	}

	public static void checkbox(WebElement element) {
		element.click();

	}

	public static void isEnabled(WebElement element) {
		element.isEnabled();

	}

	public static void isSelected(WebElement element1) {
		element1.isSelected();
	}

	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void getOptions(WebElement element) {
		Select d = new Select(element);

		List<WebElement> options2 = d.getOptions();
		for (WebElement wb : options2) {
			System.out.println(wb.getText());

		}

	}

	public static void getTitle(String title) {
		driver.getTitle();

	}

	public static void getAttribute(WebElement attribute, String value) {
		attribute.getAttribute(value);
	}

	public static void wait(String wait, int n) {
		driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);

	}

	public static void explicitWait(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void fluentWait(WebElement element, int seconds) {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS);

	}

	public static void screenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(("user.dir") + "\\screenshot" + path + ".png");
		FileUtils.copyFile(sourceFile, destinationFile);
	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);

	}

	public static void getText(WebElement element) {
		element.getText();

	}

	public static void robot(WebElement element, WebElement target) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void firstSelectedOptions(WebElement element, String options) {
		driver.findElements((By) element);
		element.sendKeys(options);
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}

}
