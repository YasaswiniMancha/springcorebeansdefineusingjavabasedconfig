package com.example.movieTicketBooking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Movie movie() {
        return new Movie("Pushpa 2", "7:00 PM"); // Bean 1
    }

    @Bean
    public Ticket ticket() {
        return new Ticket(movie(), "A12"); // Bean 2, Movie injected
    }

    @Bean
    public BookingService bookingService() {
        BookingService service = new BookingService();
        service.setTicket(ticket()); // Bean 3, Ticket injected
        return service;
    }
}