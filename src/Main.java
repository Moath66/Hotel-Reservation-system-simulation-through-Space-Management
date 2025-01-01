import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRooms = 10; 

        Hotel hotel = new Hotel(numberOfRooms);
        Visualization visualization = new Visualization(hotel);

        System.out.println("Welcome to the Hotel Reservation System!");
        System.out.println("========================================");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. View available rooms");
            System.out.println("2. Reserve a room");
            System.out.println("3. Release a room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    visualization.displayHotelStatus();
                    break;
                case 2:
                    System.out.print("Enter the room number you want to reserve: ");
                    int roomNumber = scanner.nextInt();
                    if (hotel.isRoomAvailable(roomNumber)) {
                        hotel.reserveRoom(roomNumber);
                        visualization.updateAfterReservation(roomNumber);
                    } else {
                        System.out.println("Sorry, the room is already booked. Please choose another room.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the room number you want to release: ");
                    int releaseRoomNumber = scanner.nextInt();
                    hotel.releaseRoom(releaseRoomNumber);
                    visualization.updateAfterRelease(releaseRoomNumber);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the Hotel Reservation System. Goodbye!");
    }
}
