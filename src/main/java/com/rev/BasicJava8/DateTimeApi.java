package com.rev.BasicJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

	
	public DateTimeApi() {
		System.out.println("Date Time API [start]");
		
		doSomeDateTimeUsage();
		
		System.out.println("Date Time API [end]");
	}
	
	
	// date and time now, and in a particular time zone
	// print formatted date
	// create a LocalDateTime from a specific date string
	// add and subtract time
	private void doSomeDateTimeUsage() {
		DateTimeFormatter trustyFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss"); 
    	DateTimeFormatter miniFormatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
    	
    	ZonedDateTime krTime = LocalDateTime.now().atZone(ZoneId.of("Europe/Berlin"));
    	System.out.println("\n\nTime in Berlin: " + trustyFormatter.format(krTime));

    	LocalDateTime localtime = LocalDateTime.now(); 
    	System.out.println("Time here in Blighty: " + trustyFormatter.format(localtime));
    	
    	LocalDate localDate = LocalDate.now(); 
    	System.out.println("Current date: " + miniFormatter.format(localDate));
    	
    	LocalDate armyGolf = LocalDate.of(1987, 8, 21);
    	System.out.println("Current date: " + miniFormatter.format(armyGolf));
    	
    	System.out.println("Result of time operations:");
    	LocalDate date = LocalDate.parse("2018-02-13").plusDays(5);
    	System.out.println("Current date: " + miniFormatter.format(date));
    	date = LocalDate.parse("2018-02-13").plus(-3, ChronoUnit.MONTHS);
    	System.out.println("Current date: " + miniFormatter.format(date));
    	
    	LocalDateTime specificTime = LocalDateTime.of(1987, 8, 21, 18, 30, 12);
    	System.out.println("Specific time: " + trustyFormatter.format(specificTime));
	}
	

	
	
}
