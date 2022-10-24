package tuan7.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public User register(@RequestBody User user){
       return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
    	 return userService.login(user);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(Principal principal){
        return  ResponseEntity.ok("hello world");
    }

}
