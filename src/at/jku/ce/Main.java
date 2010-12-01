package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

	Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComperator());
	
	objectSet.add(DomainFactory.createDomainObject("Helga"));
	objectSet.add(DomainFactory.createDomainObject("Walter"));
	objectSet.add(DomainFactory.createDomainObject("Hannah"));
	objectSet.add(DomainFactory.createDomainObject("Paul"));
	objectSet.add(DomainFactory.createDomainObject("Claudia"));

	for (DomainObject domainObject : objectSet) {
		LOGGER.debug(domainObject.toString());
	}

	}

}
