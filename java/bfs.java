public static void bfs(final Graph g, final Node start) {
Queue<Node> wait = new LinkedList<>(); // FIFO-Queue
start.setColor(Color.GRAY);
wait.add(start); // put
while (!wait.isEmpty()) {
Node node = wait.remove(); // get
LOG.info(node); // Knoten verarbeiten
node.setColor(Color.BLACK);
for (Node n : g.getAllAdjaNodes(node)) {
if (n.getColor().equals(Color.WHITE)) {
n.setColor(Color.GRAY);
wait.add(n); // put
}
}
}
}


