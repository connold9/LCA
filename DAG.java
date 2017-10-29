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
}