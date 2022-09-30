package ir.maktab.repository;

import ir.maktab.db.IdGenerator;
import ir.maktab.model.User;

public class UserRepository extends AbstractRepository<String,User>{

    public UserRepository(IdGenerator<String> idGenerator) {
        super(idGenerator);
    }
}