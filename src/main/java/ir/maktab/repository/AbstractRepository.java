package ir.maktab.repository;

import ir.maktab.model.IEntity;
import ir.maktab.util.IRepository;
import ir.maktab.util.IdGenerator;

import java.util.*;

public abstract class AbstractRepository<U, T extends IEntity<U>> implements IRepository<U, T> {

    private final Map<U, T> data = new HashMap<>();
    IdGenerator<U> idGenerator;

    public AbstractRepository(IdGenerator<U> idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(T entity) {
        if (entity != null) {
            U id = idGenerator.generate();
            entity.setId(id);
            data.put(id, entity);
        } else {
            throw new IllegalArgumentException("Your Entity Is Null");
        }
    }

    @Override
    public void update(T entity) {
        U id = entity.getId();
        if (id.equals("null")) {
            throw new IllegalArgumentException("id is null");
        } else {
                if (!data.containsKey(id)) {
                    throw new RuntimeException("this id not found");
                } else {
                    data.put(id, entity);
                }
        }
    }

    @Override
    public T load(U id) {
//        Set<U> keys = data.keySet();
//        for (U key : keys) {
//            if(key.equals(id)){
//                return data.get(key);
//            }
//        }
//        return null;
        return data.get(id);
    }

    @Override
    public List<T> loadAll() {
        List<T> tList = new ArrayList<>();
        Set<U> keys = data.keySet();
        for (U key : keys) {
            tList.add(data.get(key));
        }
        return tList;
    }

    @Override
    public void delete(U id) {
        if (data.containsKey(id)) {
            data.remove(id);
        } else {
            throw new RuntimeException();
        }

    }

    @Override
    public void deleteAll() {
        data.clear();
    }
}
