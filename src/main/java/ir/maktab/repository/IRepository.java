package ir.maktab.repository;

import ir.maktab.model.IEntity;

import java.util.List;

public interface IRepository<U, T extends IEntity<U>> {

	void save(T entity);
	
	void update(T entity);
	
	T load(U id);
	
	List<T> loadAll();
	
	void delete(U id);
	
	void deleteAll();
}
