import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Comment: I think this may be too complex an implementation for me to manage. May have to simplify my old code.
//Have seen a working implementation in which root.left.right.add etc is used to add nodes, seeming simple.
//Will do some research but may have to start from scratch again.

//found a simplified Node class constructor. Will use this and try to simplify from here. Ignore the mountain of errors.
class Node {
	int data;
	ArrayList<Node> parentNodes;
	Node left;
	Node right;

	Node(int value) {
		data = value;
		parentNodes = new ArrayList<Node>();
		left = right;
		left = null;
		right = null;
	}
}

public class DAG {
	Node root;
	private List<Integer> path1 = new ArrayList<>();
	private List<Integer> path2 = new ArrayList<>();
	
	int LCADag(Node node1, Node node2) {
		return LCADag(root, node1, node2);
	}

	static int LCADag(Node root2, Node node1, Node node2) {
		if (node1.parentNodes != null && node2.parentNodes != null) {
			for (int i = 0; i < node2.parentNodes.size(); i++) {
				for (int j = 0; j < node1.parentNodes.size(); j++) {
					if (node2.parentNodes.get(i) == node1.parentNodes.get(j)) {
						return node2.parentNodes.get(i).data;
					}
				}
			}
		} else {
			return root2.data;
		}
		return 0;

	}
}

