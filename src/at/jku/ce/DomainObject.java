package at.jku.ce;

public class DomainObject implements Compareable<DomainObject> {

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

	public compareTo(sjdjsdjsjdj) {
		fwefwef
		wgvwe
		wwe
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		return "DomainObject [name=" + name + ", comment=" + comment
			+ ", uuid=" + uuid + "]";
	}

	public boolean equals(Object obj){
		if(!(obj instanceof DomainObject)){
			return false;
		}

		DomainObject domainObj = (DomainObject) obj;
		return uuid.equals(domainObj.getUuid());
	}

	public int hashCode(){
		if(uuid != null){
			return uuid.hashCode();
		} else {
			return super.hashCode();
		}
	}
}
