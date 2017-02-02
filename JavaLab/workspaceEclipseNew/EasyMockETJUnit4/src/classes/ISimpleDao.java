package classes;

public interface ISimpleDao {
	void save(String title);
	void remove(String title) throws NotExistingException;
	int count();
	void debug();
	boolean isValid(String title);
	void insert(String title);
}