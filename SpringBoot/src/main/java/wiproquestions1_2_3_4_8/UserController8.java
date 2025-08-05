package wiproquestions1_2_3_4_8;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController8 {

    @PostMapping
    public String createUser(@RequestBody User8 user) {
        return "User8 created: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}
