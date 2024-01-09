import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleChrome {

	public static void main(String[] args) {
		
		// Create drive object to only implement WebDriver methods for cross-browser standards
		// vs. using ChromeDriver which could have methods that are not cross-browser implemented
		WebDriver driver = new ChromeDriver();
		
		// Execute get method to retrieve a URL
		driver.get("https://github.com/Eichhorn-personal");
		
		// Execute getTitle method to retrieve title of URL loaded
		driver.getTitle();
		
		// Uses getTitle method, but outputs the results to console so you can see the results
		System.out.println(driver.getTitle());
		
		// Uses getCurrentUrl to get the current URL. Can use to validate if you got redirected from the 
		// expected URL
		System.out.println(driver.getCurrentUrl());
		
		// Closes the automated browser window
		driver.close();
		
		// Closes ALL instances of the browser vs. just closing the automated window
		// driver.quit();
		
	}

}
