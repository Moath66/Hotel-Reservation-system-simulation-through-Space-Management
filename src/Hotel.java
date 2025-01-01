import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        initializeRooms(numberOfRooms);
    }

    private void initializeRooms(int numberOfRooms) {
        for (int i = 1; i <= numberOfRooms; i++) {
            Room room = new Room(i);
            rooms.add(room);
        }
    }

    public void displayRooms() {
        System.out.println("Hotel Rooms:");
        for (Room room : rooms) {
            String status = room.isAvailable() ? "Available" : "Reserved";
            System.out.println("Room Number: " + room.getRoomNumber() + " - Status: " + status);
        }
    }

    public boolean isRoomAvailable(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.isAvailable();
            }
        }
        return false;
    }

    public void reserveRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(false);
                System.out.println("Room " + roomNumber + " is now reserved.");
                return;
            }
        }
        System.out.println("Invalid room number. Please try again.");
    }

    public void releaseRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(true);
                System.out.println("Room " + roomNumber + " is now released.");
                return;
            }
        }
        System.out.println("Invalid room number. Please try again.");
    }

    // Add additional methods as needed
}
