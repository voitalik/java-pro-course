package model;

public class UserMapper {
    public static UserDTO toDTO(UserDB user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setCity(user.getCity());
        userDTO.setCountry(user.getCountry());
        userDTO.setBirthdayYear(user.getBirthdayYear());
        userDTO.setUsername(user.getUsername());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        return userDTO;
    }
}
