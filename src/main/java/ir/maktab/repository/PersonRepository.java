package ir.maktab.repository;

import ir.maktab.util.IdGenerator;
import ir.maktab.model.Person;
public class PersonRepository extends AbstractRepository<Long,Person>{
    public PersonRepository(IdGenerator<Long> idGenerator) {
        super(idGenerator);
    }
}
