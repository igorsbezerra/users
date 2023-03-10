package dev.igor.users.service.impl;

import dev.igor.users.dto.UserRequest;
import dev.igor.users.dto.UserResponse;
import dev.igor.users.model.User;
import dev.igor.users.repository.UserRepository;
import dev.igor.users.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserResponse create(UserRequest request) {
        return UserResponse.of(repository.save(User.of(request)));
    }
}
