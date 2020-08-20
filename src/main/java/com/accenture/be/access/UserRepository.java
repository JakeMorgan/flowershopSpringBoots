package com.accenture.be.access;

import com.accenture.be.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUserNameAndPassword(String userName, String password);
    Optional<User> findById(Long id);
    Optional<User> findByUserName(String userName);
}
