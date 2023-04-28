/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabusqueda;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author carlo
 */

/*
public class BreadthFirstSearch {

    public Node breadthFirstSearch(Problem problem) {
        Node node = problem.getInitial();
        if (problem.isGoal(node.getState())) {
            return node;
        }
        Queue<Node> frontier = new LinkedList<>();
        frontier.add(node);
        List<Short> reached = new ArrayList<>();
        reached.add(problem.getInitial().getState());
        while (!frontier.isEmpty()) {
            node = frontier.remove();
            for (Node child : problem.expand(node)) {
                short s = child.getState();
                if (problem.isGoal(s)) {
                    // Trace back the path from the goal node to the initial node
                    Node pathNode = child;
                    while (pathNode.getParent() != null) {
                        System.out.println("X: " + pathNode.getX() + ", Y: " + pathNode.getY() + ", State: " + pathNode.getState());
                        pathNode = pathNode.getParent();
                    }
                    System.out.println("X: " + pathNode.getX() + ", Y: " + pathNode.getY() + ", State: " + pathNode.getState());
                    return child;
                }
                if (!reached.contains(s)) {
                    reached.add(s);
                    child.setParent(node);  // Update the parent of the child node
                    frontier.add(child);
                }
            }
        }
        return null; // failure
    }
}  */
public class BreadthFirstSearch {

    public Node breadthFirstSearch(Problem problem) {
        System.out.println("Inicia: breadthFirstSearch");
        Node node = problem.getInitial();
        if (problem.isGoal(node.getState())) {
            return node;
        }
        Queue<Node> frontier = new LinkedList<>();
        frontier.add(node);
        List<Short> reached = new ArrayList<>();
        reached.add(problem.getInitial().getState());
        while (!frontier.isEmpty()) {
            node = frontier.remove();
            for (Node child : problem.expand(node)) {
                short s = child.getState();
                if (problem.isGoal(s)) {
                    System.out.println("FRONTIER: ");
                    
                    for (Node n : frontier) {
                        System.out.println("[" + n.getX() + "," + n.getY() + "] = " + n.getState());
                    } 
                    
                    System.out.println("REACHED: ");
                    for (short ss : reached){
                        System.out.println("estado: " + ss);
                    }
                    return child;
                }
                if (!reached.contains(s)) {
                    reached.add(s);
                    frontier.add(child);
                }
            }
        }

        return null; // failure
    }

}
