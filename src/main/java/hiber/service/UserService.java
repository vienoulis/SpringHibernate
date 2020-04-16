package hiber.service;

import hiber.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    User getUserByCar(String name, int series);
}
