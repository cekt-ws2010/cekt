package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();

	private String name;
	private String comment;

	/**
	*	Default constructor
	*/

	protected DomainObject(String id) {
		super();
		this.id = id;
	}

	protected DomainObject(String name, String comment) {
		super();
	}

	public String getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
