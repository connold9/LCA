<b><u>Lowest Common Ancestor</b></u>

<i>Explanation of the LCA</i>

The lowest common ancestor (LCA) of two nodes v and w in a tree is the lowest node that has both v and w as descendants

Some of the tests I am going to be looking for:

<b>Tests</b>

Check for the Lowest Common Ancestory

Test the constructor

Test a null tree

Test a small tree(at least 2 nodes - including root)

Test same node/elements for LCA

Test for non existing nodes in tree

The tests have been built and time to construct the code to implement the LCA

Adding the Lowest Common Ancestor in a Directed Acyclic Graph

<b>Explanation of a DAG</b>

The directed graph will have nodes pointing to one and other similar to the binary tree above except they will be joining other nodes from different branches at an early or later stage. Not all nodes have edges(connections) leading into them(known as indegree) and not all have edges leading out of them(known as outdegree). A directed acyclic graph will be the same except once a node/vertex is visited, there should be no ability to return to this node(ie there is no cycle within the graph). There must be atleast one vertex/node that has 0 indegrees.

<b>Some Changes</b>

I will need to adjust my node class and my LCA class. I will construct some tests I expect to happen. In previous request, I tested the some of the node class requirements with in the LCATest. As there is more requirements in this assignment, I will give the node class its own test class. As my previous assignment was designed for a BT I will need make changes to both classes.

<b>Tests</b>

Node Class - I will be making this a generic type to better suit more sources. As a peer pointed out that I should not limit the ability of the program to just integers

Test the constructor

Test for when adding/connecting two nodes together

Test for when disconnecting two nodes from one and other
