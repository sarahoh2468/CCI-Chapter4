import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;

import java.util.LinkedList;
import java.util.Stack;

public class RouteBetweenNodes {
    /* Given a directed graph, design an algorithm to find out whether there is a route
    between two nodes
     */
    enum State { Unvisited, Visited, Visiting;}
    public class graphNode extends Node {
        public State state;
    }

    public static void dfs(graphNode node) {


    }
    public static boolean search(Graph g, graphNode start, graphNode end) {
        if (start == end) {
            return true;
        }
        LinkedList<graphNode> q = new LinkedList<graphNode>();


    }
}