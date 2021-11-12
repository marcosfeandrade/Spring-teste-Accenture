package acc.br.springThymeLeaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import acc.br.springThymeLeaf.model.User;
import acc.br.springThymeLeaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
