package BackendProject.services;

import java.util.List;

import BackendProject.moduls.UserDto;

public interface UserService {

	UserDto signupUser(UserDto user);

	UserDto signinUser(UserDto user);

	UserDto createUser(UserDto userDto);

	UserDto updateUser(UserDto userDto, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUser();

	void deleteUser(Integer userId);

}
