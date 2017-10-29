
import java.util.Arrays;

public class DAG <Value> {
//DAG Branch
		
	public Node[] nodelist; // Keeps track of the nodes in the list	
	
	
		private class Node{
			private Value val;
			private Node[] successors;
			@SuppressWarnings("unused")
			private int succNumber;
			
			@SuppressWarnings("unused")
			public Node(Value val, int succNumber){
				this.val = val;
				this.succNumber = succNumber;
			}
			
			@SuppressWarnings("unused")
			int value;
		}
		
		
	public boolean isEmpty(){
		if(size()==0) return true;
		else return false;
		
	}
	//Number of nodes in graph
	public int size(){
		return nodelist.length;
	}
		
	//Checks for Node n in the graph
	public boolean contains(Node n){
		if(Arrays.asList(nodelist).contains(n)==true){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//Adds a node to the graph
	public void put(Node n, Node from, Node to){
		if(from.val!=null){
			from.successors = extendArrayByOne(from.successors);
			from.successors[from.successors.length-1] = n;
		}
		
		if(to.val != null){
			n.successors = extendArrayByOne(n.successors);
			n.successors[n.successors.length-1] = to;
			
		}
		
		nodelist = extendArrayByOne(nodelist);
		nodelist[nodelist.length-1] = n;	
		
		
	}
	
public Node[] extendArrayByOne(Node[] originalArray){
	@SuppressWarnings("unchecked")
	Node[] arrayCopy = new DAG.Node[originalArray.length+1];
	System.arraycopy(originalArray,0,arrayCopy,0 , originalArray.length);
	return arrayCopy;
}
	
//NOTES: Non circular 		
		
}