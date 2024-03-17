package BackendProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BackendProject.entities.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{
	

}
