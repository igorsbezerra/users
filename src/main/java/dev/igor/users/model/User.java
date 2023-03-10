package dev.igor.users.model;

import dev.igor.users.dto.UserRequest;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public record User(String id, String name, String email) {
    public User(String name, String email) {
        this(null, name, email);
    }

    public static User of(UserRequest request) {
        return new User(request.email(), request.name());
    }
}
