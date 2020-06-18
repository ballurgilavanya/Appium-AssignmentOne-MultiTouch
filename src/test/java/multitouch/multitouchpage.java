package multitouch;


import java.util.List;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.AndroidMobileCapabilityType;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import multitouch.commonutils;

import java.time.Duration;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;

public class multitouchpage {
public static AndroidDriver driver;
	
public static void multouch() {
	driver=commonutils.getDriver();
	WebElement someElement = 
			driver.findElement(By.id("com.the511plus.MultiTouchTester:id/imageview"));
			WebElement el1 = driver.findElement(By.id("com.the511plus.MultiTouchTester:id/imageview"));
			MultiTouchAction multiTouch = new MultiTouchAction(driver);
			TouchAction action1 = new TouchAction(driver);
			action1.press(element(el1)).release();
			multiTouch.add(action1).add(action1).add(action1).add(action1).add(action1).perform();
			}
	
}
	


