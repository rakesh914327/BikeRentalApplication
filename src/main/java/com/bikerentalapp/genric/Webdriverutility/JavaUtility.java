package com.bikerentalapp.genric.Webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber() {

		Random random = new Random();
		int randomNumber = random.nextInt(10000);

		return randomNumber;

	}

	public String getSystemDateYYYYDDM() {

		Date dateObj = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
	}

	public String getRequiredDateYYYYDDM(int days) {

		Date dateObj = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate = sdf.format(cal.getTime());
		return requiredDate;
		
	}

}
