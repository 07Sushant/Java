package q23492;
import java.util.Scanner;

class TravelBooking {
public void book() {
System.out.println("Booking a travel service");
}
}

class FlightBooking extends TravelBooking {
@Override
public void book() {
Scanner scanner = new Scanner(System.in);
System.out.print("Destination for flight booking: ");
String destination = scanner.nextLine();
System.out.println("Flight booked");
}
}

class HotelBooking extends TravelBooking {
@Override
public void book() {
Scanner scanner = new Scanner(System.in);
System.out.print("Hotel name for booking: ");
String hotelName = scanner.nextLine();
System.out.println("Hotel booked");
}
}

public class TravelBookingTest {
public static void main(String[] args) {
TravelBooking genericBooking = new TravelBooking();
genericBooking.book();

FlightBooking flightBooking = new FlightBooking();
flightBooking.book();

HotelBooking hotelBooking = new HotelBooking();
hotelBooking.book();
}
}
