import java.util.Arrays;

public class DAG <Value> {
	private class Node {
		private Value val;					// Value stored in Node
		private Node[] successors;			// Array of Nodes' successors

		public Node(Value val) {
			this.val = val;
		}
	}

	@SuppressWarnings("unchecked")
	private Node[] nodeList = new DAG.Node[0];

	public boolean isEmpty() { //method to check if the DAG is empty
		if (size()==0) {
			return true;
		}
		else {
			return false;
		}
	}


	public int size() { 
		return nodeList.length;  //returns number of nodes the DAG
	}

	// Checks whether Node n is in the graph.
	public boolean contains(Value v) {
		boolean valInList = false;
		for (int i=0; i<nodeList.length; i++) {
			if (nodeList[i].val == v) {
				valInList = true;
				break;
			}			
		}
		return valInList;
	}

	// Needed a way to convert from value to a Node, so this method returns the assocaited node given a value.
	public Node retrieveNodefromVal (Value v){
		Node nodeToRet = new Node(null); 				
		for (int i=0; i<nodeList.length; i++){
			if (nodeList[i].val == v){
				nodeToRet = nodeList[i];
				break;			
			}	
		}
		return nodeToRet;
	}

	public void put(Value v, Value fromVal, Value toVal) {	
		Node n = new Node(v);
		Node from = retrieveNodefromVal(fromVal);
		Node to = retrieveNodefromVal(toVal);

		if (fromVal != null) {
			from.successors = extendArray(from.successors); //need a method to extend array
			from.successors[from.successors.length-1] = n;
			// If 'from' Node is not already in the graph.
			if (from.val == null) {

			}
		}

		if (toVal != null) {
			//has nowhere to get connected to?
		}
	}
	
	// Extend the array by one element
		@SuppressWarnings("unchecked")
		public Node[] extendArray(Node[] originalArray) {
			Node[] copyArray = new DAG.Node[originalArray.length+1];
			System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);
			return copyArray;
		}


}