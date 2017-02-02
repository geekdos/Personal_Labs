package classes;

public class SimpleService {
	private ISimpleDao dao;

	public void setDao(ISimpleDao dao) {
		this.dao = dao;
	}

	public void insert(String title) {
		if (dao.isValid(title)) {
			dao.insert(title);
		}
	}

	public void save(String... titles) {
		for (String title : titles) {
			dao.save(title);
		}
	}

	public boolean remove(String title) {
		try {
			dao.remove(title);
		} catch (NotExistingException e) {
			return false;
		}
		return true;
	}

	public int size() {
		return dao.count();
	}

	public void debug() {
		System.out.println("Debug information of SimpleService");
		dao.debug();
	}
}
