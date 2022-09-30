package ir.maktab.repository;

import ir.maktab.db.IdGenerator;
import ir.maktab.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository extends AbstractRepository{
    private Map<String, User> data = new HashMap<>();
    private IdGenerator idGenerator;

    public UserRepository(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    public void save(User user) {
        user.setId((String) idGenerator.generate());
        // implementation
    }

    public void update(User user) {
        // implementation
    }

    public User load(String id) {
        // implementation
        return null;
    }

    public List<User> loadAll() {
        // implementation
        return null;
    }

    public void delete(String id) {
        // implementation
    }

    public void deleteAll() {
        // implementation
    }
}