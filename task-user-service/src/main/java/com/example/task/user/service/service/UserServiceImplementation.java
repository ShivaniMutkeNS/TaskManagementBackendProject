package com.example.task.user.service.service;

import com.example.task.user.service.config.JwtProvider;
import com.example.task.user.service.exception.UserException;
import com.example.task.user.service.model.User;
import com.example.task.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email = JwtProvider.getEmailFromJwtToken(jwt);


        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new UserException("user not exist with email " + email);
        }
        return user;
    }

    @Override
    public User findUserByEmail(String username) throws UserException {

        User user = userRepository.findByEmail(username);

        if (user != null) {

            return user;
        }

        throw new UserException("user not exist with username " + username);
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        Optional<User> opt = userRepository.findById(userId);

        if (opt.isEmpty()) {
            throw new UserException("user not found with id " + userId);
        }
        return opt.get();
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

}
