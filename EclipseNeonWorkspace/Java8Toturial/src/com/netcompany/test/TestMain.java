package com.netcompany.test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		//host : port
		String host="HOST";
		String port="1234";
		String database="TestDB";
		
		
		  String urlFormat = "jdbc:microsoft:sqlserver://%s:%s;DatabaseName=%s";
	  System.out.println(String.format(urlFormat, host,port,database));
		

	}

}
