import java.util.Arrays;

public class DAG <Value> {
	private class Node {
		private Value val;					// Value stored in Node
		private Node[] successors;			// Array of Nodes' successors
	
		public Node(Value val) {
			this.val = val;
		}
	}
	private Node[] nodeList = new DAG.Node[0];
}