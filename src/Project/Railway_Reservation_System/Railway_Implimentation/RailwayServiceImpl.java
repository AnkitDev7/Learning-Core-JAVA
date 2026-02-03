package Project.Railway_Reservation_System.Railway_Implimentation;

import Project.Railway_Reservation_System.RailwayAll_Domain.User;
import Project.Railway_Reservation_System.Railway_Repositary.TicketRepository;
import Project.Railway_Reservation_System.Railway_Repositary.TrainRepository;
import Project.Railway_Reservation_System.Railway_Repositary.UserRepository;

import java.util.UUID;


public class RailwayServiceImpl implements RailwayService{
    private final UserRepository userRepository = new UserRepository();
    private final TrainRepository trainRepository = new TrainRepository();
    private final TicketRepository ticketRepository = new TicketRepository();


    @Override
    public String UserRegister(String name, String userName, String mobileNo, String password) {

        User user = new User(name, userName, mobileNo, password);
        userRepository.save(user);

        return "User Registered Successfully";
    }

}
