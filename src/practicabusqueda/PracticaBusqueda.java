/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabusqueda;

/**
 *
 * @author carlos
 */
public class PracticaBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
        Laberinto laberinto = new Laberinto();
        Node initial = new Node();
        initial.setState((short)-2);
        initial.setX(2);
        initial.setY(2);
        short goalState = -3;
        //System.out.println("VALOR 3,3 " + l.getValor(3,3));
        Problem problem = new Problem(laberinto, initial, goalState);
        
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        Node solution = bfs.breadthFirstSearch(problem);
        System.out.println("[" + solution.getX() + "," + solution.getY() + "] = " + solution.getState());
    }
    
}
