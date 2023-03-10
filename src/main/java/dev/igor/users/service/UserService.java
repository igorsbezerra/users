package dev.igor.users.service;

import dev.igor.users.dto.UserRequest;
import dev.igor.users.dto.UserResponse;

public interface UserService {
    UserResponse create(UserRequest request);
}
