package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calc {

    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<>(remoteUrl, desiredCapabilities);
    }

    @Test
    public void somaDoisNumeros() throws InterruptedException
    {
        Thread.sleep(3000);
        MobileElement botao2 = driver.findElementById("com.google.android.calculator:id/digit_2");
        botao2.click();
        MobileElement botaoSomar = driver.findElementById("com.google.android.calculator:id/op_add");
        botaoSomar.click();
        MobileElement botao3 = driver.findElementById("com.google.android.calculator:id/digit_3");
        botao3.click();
        MobileElement botaoIgual = driver.findElementById("com.google.android.calculator:id/eq");
        botaoIgual.click();
        MobileElement lblResultado = driver.findElementById("com.google.android.calculator:id/result_final");

        Assert.assertEquals("5",lblResultado.getText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

