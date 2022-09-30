package ir.maktab.repository;

import ir.maktab.db.IdGenerator;
import ir.maktab.model.Person;
public class PersonRepository extends AbstractRepository<Long,Person>{
    public PersonRepository(IdGenerator<Long> idGenerator) {
        super(idGenerator);
    }
}
