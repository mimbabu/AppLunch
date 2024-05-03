package AppiumTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LunchApp {

    AppiumDriver<MobileElement>Driver;

    public static void main(String[]args) {
    }
public static Void App(){

            DesiredCapabilities cap =new   DesiredCapabilities();
            cap.setCapability("platformName","Android");
            cap.setCapability("platformVersion","9.0");
            cap.setCapability("deviceName","YHOBWWVSAII7FI59");
            cap.setCapability("automationName","");
            cap.setCapability("unlockType","pin");
            cap.setCapability("unlockKey","0000");
            cap.setCapability("appPackage","com.realezydev.app");
            cap.setCapability("appActivity","com.realezydev.app.MainActivity");
            cap.setCapability("ignoreHiddenApiPolicyError",true);
            cap.setCapability("autoAcceptAlerts",false);
            cap.setCapability("session-override",true);
            cap.setCapability("noReset",false);

            URL url = new URL("http://127.0.0.1:4723/");
            driver = new AppiumDriver<MobileElement>(url, cap);

            System.out.println("Server started");
    }




}


