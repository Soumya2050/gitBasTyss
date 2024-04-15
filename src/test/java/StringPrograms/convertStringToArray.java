package StringPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class convertStringToArray {

	public static void main(String[] args) {

		String s = "ABCD";
		LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(i + 1, s.charAt(i));
		}

		for (Entry<Integer, Character> str : map.entrySet()) {
			System.out.println(str.getKey() + " = " + str.getValue());
		}
	}

	@Test
	public void brokenLinks() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		ArrayList<Object> list = new ArrayList<>();
		for (WebElement webElement : allLinks) {
			String urlLinks = webElement.getAttribute("href");
			int statusCode = 0;
			URL url = null;
			try {
				url = new URL(urlLinks);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConnectio = (HttpURLConnection) connection;

				statusCode = httpConnectio.getResponseCode();

				if (statusCode >= 400) {
					list.add(urlLinks + ">>>>" + statusCode);
				}
			} catch (Exception e) {}
			driver.quit();
			for (Object object : list) {
				System.out.println(object);
			}
		}
	}

}
