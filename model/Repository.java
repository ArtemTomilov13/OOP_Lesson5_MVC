package OOP_HomeWork5.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    String DeleteUser(User user);
}
