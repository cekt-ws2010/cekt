package at.jku.ce

import java.util.Comperator;

public class DomainObjectComperator implements Comperator<DomainObject>{
	
	public int compare(DomainObject o1, DomainObject o2){
		return o1.getName().compareTo(o2.getName());
	}
}