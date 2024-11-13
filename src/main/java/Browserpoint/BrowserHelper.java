package Browserpoint;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.bidi.module.Browser;

public class BrowserHelper extends Browsers{
	private static final Logger logger = Logger.getLogger(chrome.class.getName());
	
	public static void maximise() {
		logger.info("maximising the browser");
		driver.manage().window().maximize();
		
		}
	
	public static void implicitwait() {
		logger.info("settin the driver to wait");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	
	public static void loadurl() {
		logger.info("setting the driver to wait");
		driver.get("https://www.google.com/");
}
}




