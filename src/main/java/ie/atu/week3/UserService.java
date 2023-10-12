package ie.atu.week3;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String registerUser(String name, String email){
        return "Hello " + name + ", Welcome to Our Platform";
    }

    public String registerUser(User user){
        return "Hello " + user.getName() + ", Welcome to Our Platform";
    }
}
