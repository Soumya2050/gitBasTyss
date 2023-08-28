package com.GTMange.TransSoft.genericutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * contains java specific utility
 * @author srjen
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
public class JavaUtility {

	Random random = new Random();
	Date dateObj = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	RemoteWebDriver driver;

	/**
	 * generate random number with in the limit of 40000 for very invocation
	 * 
	 * @return
	 */
	public int getRandomNum() {
		int ranInt = random.nextInt(4000);
		return ranInt;
	}

	/**
	 * used to get the system current date in "yyyy-MM-dd " format
	 * 
	 * @return
	 */
	public String getDate() {
		String date = sdf.format(dateObj);
		return date;
	}
	/**
	 * used to get the required date in "yyyy-MM-dd "
	 * format requiredDateCount is positive number , it provides upcoming date based numeric count
	 * if requiredDateCount is negative number , it provides previous date based numeric count
	 * 
	 * @param requiredDateCount
	 * @return
	 */
	public String getDate(int requiredDateCount) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, requiredDateCount);
		Date date = cal.getTime();
		String rDate = sdf.format(date);
		return rDate;
	}
	
	public void selectSpecificDateForInput(int year,String month,int date)
	{
		driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[contains(text(),'"+month+"') and  contains(text(),'"+year+"') ]"));
		
		
	}

}
