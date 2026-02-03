package Project.Railway_Reservation_System.RailwayAll_Domain;


import java.util.Random;

public class Ticket {
        private int pnr;
        private String username;
        private String trainName;
        private int seats;
        private String status;

        public Ticket(String username, String trainName, int seats) {
            this.pnr = new Random().nextInt(900000) + 100000;
            this.username = username;
            this.trainName = trainName;
            this.seats = seats;
            this.status = "CONFIRMED";
        }

        public int getPnr() {
            return pnr;
        }

        public String getUsername() {
            return username;
        }

      public String getTrainName() {
         return trainName;
      }

    public int getSeats() {
            return seats;
        }

        public String getStatus() {
            return status;
        }

        public void cancel() {
            this.status = "CANCELLED";
        }


}
