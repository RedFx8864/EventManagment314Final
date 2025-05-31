package BackEnd.Repository;

import BackEnd.Model.User;
import java.util.*;

public class UserRepository 
{
    private Map<Long, User> users = new HashMap<>();

    public void addUser(User user) 
    {

    }

    public User findById(Long id)
    {
        return users.get(id);
    }

    public List<User> getAllUsers() 
    {
        return new ArrayList<>(users.values());
    }
}
