public static void dfs(final Graph g, final Node start) {
LinkedList<Node> wait = new LinkedList<>(); // Stack bzw. LIFO-Queue
boolean found;
start.setColor(Color.GRAY);
wait.add(0, start); // push
while (!wait.isEmpty()) {
Node node = wait.getFirst(); // top
found = false;
for (Node n : g.getAllAdjaNodes(node)) {
if (n.getColor().equals(Color.WHITE)) {
n.setColor(Color.GRAY);
wait.add(0, n); // push
found = true;
break;
}
}
if (!found) {
LOG.info(node); // Knoten verarbeiten
node.setColor(Color.BLACK);
wait.remove(); // pop
}
}
}

public static void dfs2(final Graph g, final Node start) {
start.setColor(Color.GRAY);
for (Node n : g.getAllAdjaNodes(start)) {
if (n.getColor().equals(Color.WHITE)) {
dfs2(g, n); // rekursiver Aufruf
}
}
LOG.info(start); // Knoten verarbeiten
start.setColor(Color.BLACK);
}
// => Ausgabe: c, d, b, f, a
