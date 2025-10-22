package ControledeEvento.Events.repository;

import ControledeEvento.Events.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findbyemail(String email);
}
