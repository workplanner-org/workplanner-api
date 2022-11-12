package legends.workplanner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import legends.workplanner.controller.TO.RegistrationTO;
import legends.workplanner.model.AppUser;
import legends.workplanner.service.AppUserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/")
public class RootController {

    private AppUserService appUserService;

    public RootController(
        AppUserService appUserService
    ) {
        this.appUserService = appUserService;
    }


    @GetMapping
    public String greeting() {
        return "how are u";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("register")
    public String createUser(@RequestBody RegistrationTO reg) {
        
        AppUser newUser = appUserService.createUser(
            reg.getUsername(),
            reg.getPassword(),
            reg.getRole()
        );

        if (newUser == null) {
            return "cant register bad request";
        }
        return "Welcome " + newUser.getUsername();
        
    }

    @PostMapping("login")
    public String login() {
        return "you have logged in";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
    

}
