package dev.igor.users.dto;

import dev.igor.users.model.User;

public record UserResponse(String id, String email) {
    public static UserResponse of(User user) {
        return new UserResponse(user.id(), user.email());
    }
}
