package com.mainClas;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.movieTicketBooking.AppConfig;
import com.example.movieTicketBooking.BookingService;

@SpringBootApplication
public class SpringCoreBeansDefineUsingJavaBasedConfigApplication {

	public static void main(String[] args) {
		// IoC Container start
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	// Get BookingService bean 
		BookingService service = context.getBean(BookingService.class);

		service.bookTicket();

	}

}
