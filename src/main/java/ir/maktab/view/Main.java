package ir.maktab.view;

import ir.maktab.db.IEntity;
import ir.maktab.db.IRepository;
import ir.maktab.db.IdGenerator;
import ir.maktab.model.NumericIdGenerator;
import ir.maktab.model.Person;
import ir.maktab.model.StringIdGenerator;
import ir.maktab.model.User;
import ir.maktab.repository.AbstractRepository;
import ir.maktab.repository.PersonRepository;
import ir.maktab.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        IEntity<String> user = new User();
        IEntity<Long> person = new Person();

        IdGenerator<String> stringIdGenerator = new StringIdGenerator();
        IdGenerator<Long> numericIdGenerator = new NumericIdGenerator();

        IRepository<String, User> userRepository = new UserRepository(stringIdGenerator);
        AbstractRepository<Long, Person> personRepository = new PersonRepository(numericIdGenerator);
    }
}
