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


}

