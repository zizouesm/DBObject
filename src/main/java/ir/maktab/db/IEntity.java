package ir.maktab.db;

public interface IEntity<I> {

	void setId(I id);
	
	I getId();
}
