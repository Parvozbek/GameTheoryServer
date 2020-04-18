package diploma.gametheory.service;

import diploma.gametheory.forms.UserForm;
import diploma.gametheory.model.Role;
import diploma.gametheory.model.User;
import diploma.gametheory.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .userName(userForm.getUserName())
                .hashPassword(hashPassword)
                .role(Role.STUDENT)
                .build();
        usersRepository.save(user);
    }
}