package Browserpoint;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome extends Browsers implements LaunchBrowser {
	
	private static final Logger logger = Logger.getLogger(chrome.class.getName());

	
	public WebDriver  launchbrowser() {
		logger.info("launching chrome");
		driver = new ChromeDriver();
		postLaunchsteps();
		
		
		return driver ;
	}


	


	






}
