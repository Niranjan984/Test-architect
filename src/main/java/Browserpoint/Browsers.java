package Browserpoint;

import org.openqa.selenium.WebDriver;

public class Browsers {
	public static WebDriver driver;
	
	public static void postLaunchsteps() {
		BrowserHelper.maximise();
		BrowserHelper.implicitwait();
		BrowserHelper.loadurl();
	}
	

}
