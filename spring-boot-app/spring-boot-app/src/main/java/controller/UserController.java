package controller;
import model.User ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {

    private final List<User> users;

    // Constructor to initialize the list with some sample data
    public UserController() {
        this.users = new ArrayList<>();
        this.users.add(new User(1L, "john_doe", "john@example.com"));
        this.users.add(new User(2L, "jane_doe", "jane@example.com"));
    }

    @GetMapping
    public List<User> getUsers() {
        // In a real-world scenario, you would fetch users from a database here
        return users;

    }
}
