Flow(In telugu language):
-------------------------
In main class:
AnnotationConfigApplicationContext(AppConfig.class): Spring IoC Container start avthundi. Idi AppConfig class lo define chesina beans ni load chesthundi.
context.getBean(BookingService.class): Container nunchi BookingService bean teeskuntam—idi already dependencies tho ready ga untadi.
service.bookTicket(): Booking logic run avthundi—output print avthundi: "Booking confirmed: Ticket for Pushpa 2 at 7:00 PM, Seat: A12".

In AppConfig class:

@Configuration: Spring ki "idi config file" ani signal.
@Bean movie(): Movie object create avthundi ("Pushpa 2", "7:00 PM").
@Bean ticket(): Ticket object create avthundi, movie() inject avthundi (Constructor Injection).
@Bean bookingService(): BookingService object create avthundi, ticket() ni setter tho inject chesthundi (Setter Injection).
IoC Container ee beans ni memory lo store chesi, dependencies resolve chesthundi.

Classes Interaction
Movie: Data hold chesthundi (name, showTime).
Ticket: Movie ni dependency ga teeskuni, ticket details combine chesthundi.
BookingService: Ticket ni teeskuni, booking confirm chesthundi.

Execution Flow:
-------------------
Main lo container start ayithe, AppConfig lo beans create avthayi.
Movie → Ticket lo inject avthundi → BookingService lo Ticket inject avthundi.
service.bookTicket() call ayithe, chain lo data flow ayi output vasthundi.
Output: "Booking confirmed: Ticket for Pushpa 2 at 7:00 PM, Seat: A12".
