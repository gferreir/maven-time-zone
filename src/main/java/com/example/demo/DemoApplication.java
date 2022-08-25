package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@SpringBootApplication
public class DemoApplication {

	Date date = new Date();
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

	@RequestMapping("/sp")
	public String printSp(){

		df.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));

		return df.format(date);
	}

	@RequestMapping("/londres")
	public String printLondon(){

		df.setTimeZone(TimeZone.getTimeZone("Europe/London"));

		return df.format(date);
	}

	@RequestMapping("/request")
	public String printTimeZone(@RequestParam String timeZone){

		df.setTimeZone(TimeZone.getTimeZone(timeZone));

		return df.format(date);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
