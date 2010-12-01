package at.jku.ce;

public class DomainObject {

	public String id;
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

	public String getId() {
		return id;
	}
}
