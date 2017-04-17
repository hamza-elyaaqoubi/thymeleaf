package fr.ws.service;

import fr.ws.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        User user1 = new User(1, "Hamza", 20);
        User user2 = new User(2, "Mimi", 30);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        return users;
    }

    public List<User> addUser(String id, String name, String age) {
        List<User> users = getUsers();
        users.add(new User(Integer.valueOf(id), name, Integer.valueOf(age)));
        return users;
    }

    public List<User> addUser(User user) {
        List<User> users = getUsers();
        users.add(user);
        return users;
    }

}
