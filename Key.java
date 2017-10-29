// imports
import java.util.*;
import java.lang.*;

/**
 * DAG Map Assignment Interface and Class
 *  CITS2200 Project
 * 
 * @author Caleb Fetzer 21384976	
 * @author Reece Notargiacomo 21108155
 */
 
 public class Key<Value> extends Object
 {
	// properties
	public Value value;
	@SuppressWarnings("rawtypes")
	public LinkedHashSet<Key> successors = new LinkedHashSet<Key>();
	@SuppressWarnings("rawtypes")
	public LinkedHashSet<Key> predecessors = new LinkedHashSet<Key>();
	
	// constructor
	public Object Key()
	{
		Object key = new Object();
		value = null;
		return key;
	}

	@SuppressWarnings("rawtypes")
	public Set<Key> getSuccessors()
	{
		return successors;
	}
}