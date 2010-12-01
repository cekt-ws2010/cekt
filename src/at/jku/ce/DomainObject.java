package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();

	private String name;
	private String comment;

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

	public String getComment() {
		return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}
}
