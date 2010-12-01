package at.jku.ce;

public class DomainObject {

	public String uuid;
	private String name;

	/**
	*	Default constructor
	*/

	public DomainObject(String id) {
		super();
		this.id = id;
	}

	public DomainObject() {
		super();
	}

	public String getUuid() {
		return uuid;
	}
}
