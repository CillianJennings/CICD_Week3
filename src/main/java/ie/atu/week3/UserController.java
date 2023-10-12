package ie.atu.week3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService us){
        this.userService = us;
    }

    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        return userService.registerUser(name, email);
    }

    @PostMapping("/registerUserBody")
    public String getUser(@RequestBody User user){
        return userService.registerUser(user);
    }
}
