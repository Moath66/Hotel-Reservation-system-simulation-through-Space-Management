public class Visualization {
    private Hotel hotel;

    public Visualization(Hotel hotel) {
        this.hotel = hotel;
    }

    public void displayHotelStatus() {
        hotel.displayRooms();
    }


    public void updateAfterReservation(int roomNumber) {
        System.out.println("Room " + roomNumber + " is now reserved.");
        displayHotelStatus();
    }

    public void updateAfterRelease(int roomNumber) {
        System.out.println("Room " + roomNumber + " is now available.");
        displayHotelStatus();
    }

}
