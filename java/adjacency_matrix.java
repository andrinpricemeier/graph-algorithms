public class GraphA {
private int noOfNodes;
private String[] nodeName;
private boolean[][] adjaMx;
// rudimentäre Implementation
GraphA(final String[] nodeName, final boolean[][] adjaMx) {
this.noOfNodes = nodeNames.length;
this.nodeName = nodeName;
this.adjaMx = adjaMx;
}
public String getNodeName(final int k) {
return nodeName[k];
}
public int getNoOfNodes() {
return noOfNodes;
}
public boolean isEdge(final int i, final int j) {
return adjaMx[i][j];
}
...

public static void main(final String[] args) {
String[] nodeName = {"a", "b", "c", "d", "e"};
boolean[][] adjaMx = {
{false, true, true, true, false},
{true, false, true, false, false},
{false, false, true, true, false},
{false, false, false, false, false},
{false, false, false, false, false}};
GraphA g = new GraphA(nodeName, adjaMx);
}
