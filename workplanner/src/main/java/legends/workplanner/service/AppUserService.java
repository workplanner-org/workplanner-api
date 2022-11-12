package legends.workplanner.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import legends.workplanner.model.AppUser;
import legends.workplanner.repository.AppUserRepo;

@Service
public class AppUserService implements UserDetailsService {


    private AppUserRepo appUserRepo;
    private PasswordEncoder passwordEncoder;

    public AppUserService(
        AppUserRepo appUserRepo,
        PasswordEncoder passwordEncoder
    ) {
        this.appUserRepo = appUserRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser found = appUserRepo.findAppUserByUsername(username);
        if (found == null) throw new UsernameNotFoundException("User not found");
        return found;
    }

    public AppUser createUser(
        String username, 
        String password, 
        String role
    ) {
        AppUser newUser = new AppUser();
        newUser.setUsername(username);
        newUser.setRole(role);
        newUser.setPassword(passwordEncoder.encode(password));
        return appUserRepo.save(newUser);
    }
    
}
