package Project.Railway_Reservation_System.RailwayAll_Domain;

public class Train {
    private int trainNo;
    private String trainName;
    private String Source;
    private String Destination;
    private  int availablSseats;
    private double fare;

    public Train(int trainNo,String trainName,String Source,String Destination,int availablSseats,double fare){
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.Source = Source;
        this.Destination = Destination;
        this.availablSseats = availablSseats;
        this.fare = fare;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }

    public int getavailableSeats() {
        return availablSseats;
    }

    public void bookSeats(int seats) {
        this.availablSseats -= seats;
    }

    public void cancelSeats(int seats) {
        this.availablSseats += seats;
    }

    public double getFare() {
        return fare;
    }

    public String getTrainName() {
        return trainName;
    }


    @Override
    public String toString() {
        return String.format(
                "| %-6d | %-18s | %-6s | %-6s | %-15d | %-7.2f |",
                trainNo, trainName, Source, Destination, availablSseats, fare
        );
    }


}
