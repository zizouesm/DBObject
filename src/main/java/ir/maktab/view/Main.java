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


import java.util.List;

public class Main {
    public static void main(String[] args) {
        User jack = new User();
        User rose = new User();
        User monica = new User();
        IEntity<Long> person = new Person();

        IdGenerator<String> stringIdGenerator = new StringIdGenerator();
        IdGenerator<Long> numericIdGenerator = new NumericIdGenerator();

        IRepository<String, User> userRepository = new UserRepository(stringIdGenerator);
        AbstractRepository<Long, Person> personRepository = new PersonRepository(numericIdGenerator);

        try {
            jack.setName("jack");
            rose.setName("rose");
            monica.setName("monica");
            userRepository.save(jack);
            userRepository.save(rose);
            userRepository.save(monica);
            userRepository.save(monica);

            System.out.println("... before deleting the rose ...");
            List<User> users = userRepository.loadAll();
            users.forEach(System.out::println);

            System.out.println("... after deleting the rose ...");
            userRepository.delete(rose.getId());
            users = userRepository.loadAll();
            users.forEach(System.out::println);

            System.out.println("... update monica ...");
            monica.setName("new monica");
            userRepository.update(monica);
            users = userRepository.loadAll();
            users.forEach(System.out::println);

            System.out.println("... update rose ...");
            rose.setName("new rose");
            userRepository.update(rose);
            users = userRepository.loadAll();
            users.forEach(System.out::println);

            System.out.println("... delete All ...");
            userRepository.deleteAll();
            users = userRepository.loadAll();
            users.forEach(System.out::println);
        } catch (Exception exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }
}


//public class Main {
//    public static void main(String[] args) {
//        IEntity<String> user = new User();
//        IEntity<Long> person = new Person();
//
//        IdGenerator<String> stringIdGenerator = new StringIdGenerator();
//        IdGenerator<Long> numericIdGenerator = new NumericIdGenerator();
//
//        IRepository<String, User> userRepository = new UserRepository(stringIdGenerator);
//        AbstractRepository<Long, Person> personRepository = new PersonRepository(numericIdGenerator);
//    }
//}
