package em.model;

public class Weapon {
	long id;
	String name;
	String condition;

	public Weapon() {
	}

	public Weapon(long id, String name, String condition) {
		super();
		this.id = id;
		this.name = name;
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
