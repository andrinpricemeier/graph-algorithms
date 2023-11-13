public class GraphB {
// rudimentäre Implementation
private final Map<Node, Set<Node>> map;
GraphB() {
map = new HashMap<>();
}
public boolean isNodeInGraph(final Node node) {
return map.containsKey(node);
}
public boolean addNode(final Node node) {
if (!isNodeInGraph(node)) {
map.put(node, new HashSet<>());
return true;
} else {
return false;
}
}

public boolean isEdgeInGraph(final Node from, final Node to) {
if (isNodeInGraph(from)) {
return map.get(from).contains(to);
} else {
return false;
}
}
public boolean addEdge(final Node from, final Node to) {
if (isNodeInGraph(from) && isNodeInGraph(to)) {
if (!isEdgeInGraph(from, to)) {
map.get(from).add(to);
return true;
} else {
return false;
}
} else {
return false;
}
}

public int getNoOfNodes() {
return map.size();
}
public Set<Node> getAllAdjaNodes(final Node node) {
if (isNodeInGraph(node)) {
return map.get(node);
} else {
return new HashSet<>();
}
}
public static void main(final String[] args) {
GraphB graph = new GraphB();
Node a = new Node("a");
Node b = new Node("b");
...
graph.addNode(a);
graph.addNode(b);
...
graph.addEdge(a, d);
graph.addEdge(a, c);

