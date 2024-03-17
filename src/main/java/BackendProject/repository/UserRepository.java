package BackendProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import BackendProject.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
}
