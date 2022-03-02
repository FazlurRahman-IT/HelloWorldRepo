package com.test.helloworld;

import java.io.BufferedReader;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {
	public static void main(String args[]) throws ParseException
	{
		//change demo
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2021-04-20");
        Date date2 = sdf.parse("2021-04-19");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }*/
		
		/*String test="test123";
		//System.out.println(test.indexOf("%"));
		Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("string1234");
        while(m.find()) {
            System.out.println(m.start());
        }*/

		/*Integer i= Integer.parseInt("-1");
		System.out.println(i);*/
		
		//System.out.println(("if not refunded,visit point of payment".trim().equalsIgnoreCase("if not refunded,visit point of payment")));
    
		/*String test ="ERP ";
		if(!test.trim().equalsIgnoreCase("PP") && !test.trim().equalsIgnoreCase("ERP"))
		{
			System.out.println("in Not block");
		}
		else
		{
			System.out.println("in else block");
		}*/
		
		/*
		String s= "string,\\test";
		System.out.println(s.replaceAll(Pattern.quote(",\\"), Matcher.quoteReplacement(",")));*/
		
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println( new SimpleDateFormat("yyyyMMdd").format(cal.getTime()));*/
		//String s = new Timestamp(new Date().getTime()).toString();
		//System.out.println("S "+Timestamp.valueOf(s));
		
		/*String test ="h.jpg";
		System.out.println(test.length() < 6);*/
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, 20); // Adding 5 days
		String output = sdf.format(c.getTime());
		System.out.println(output);*/
		
		ArrayList<String> table = new ArrayList<String>();
		
		for (int i = 6; i <= 24; i=i+6) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(i);
            table.add(String.valueOf(i));
        }
		if("t".equalsIgnoreCase("t"))
			System.out.println("test");
		System.out.println("table size "+table.size());
	}

}
