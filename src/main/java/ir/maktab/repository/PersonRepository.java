package ir.maktab.repository;

import ir.maktab.db.IdGenerator;
import ir.maktab.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository extends AbstractRepository{
    private Map<Long, Person> data = new HashMap<>();
    private IdGenerator idGenerator;

    public PersonRepository(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    public void save(Person person) {
        person.setId((Long) idGenerator.generate());
        // implementation
    }

    public void update(Person person) {
        // implementation
    }

    public Person load(Long id) {
        // implementation
        return null;
    }

    public List<Person> loadAll() {
        // implementation
        return null;
    }

    public void delete(Long id) {
        // implementation
    }

    public void deleteAll() {
        // implementation
    }


}
