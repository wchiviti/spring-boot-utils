package io.github.hobbstech.springbootutils.commons;

public interface UserRepository {

    AbstractUser findByUsername(String authenticatedUser);

}
