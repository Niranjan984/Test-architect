package Browserpoint;

public class BrowserFactory {
	public static LaunchBrowser DriverInsultion(BrowserType browserType) {
		switch (browserType) {
		case CHROME:
			
			return new chrome();
			
         case FIREFOX:
			
			return new chrome();

		default:
			throw new IllegalArgumentException("Unknown Browser");
		}
		}
	}


