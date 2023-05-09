package flight;

public class Flight {
    int seats;
    int passengers;
    Flight() {
        seats = 10;
        passengers = 0;
    }

    public void addPassenger() {
        if (passengers >= seats){
            System.out.println("FULL! No Seats Available.");
        } else {
            passengers++;
        }

    }

    public void setNumberOfSeats(int seats) {
        this.seats = seats; //this.seats calls instance variable --> yung pinakaunang seats
    }
}
