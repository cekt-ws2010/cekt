package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();

	private String name;

	/**
	*	Default constructor
	*/

	public DomainObject(String id) {
		super();
		this.id = id;
	}

	public DomainObject(String name, String comment) {
		super();
	}

	public String getId() {
		return id;
	}
}
