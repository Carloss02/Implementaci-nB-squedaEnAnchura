/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabusqueda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Problem {

    private Laberinto laberinto;
    private Node initial;
    private short goalState;

    public Problem(Laberinto laberinto, Node initial, short goalstate) {
        this.laberinto = laberinto;
        this.initial = initial;
        this.goalState = goalstate;
    }

    public boolean isGoal(short state) {
        return state == goalState;
    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public Node getInitial() {
        return initial;
    }

    public void setInitial(Node initial) {
        this.initial = initial;
    }

    public short getGoalState() {
        return goalState;
    }

    public void setGoalState(short goalState) {
        this.goalState = goalState;
    }
    
    public List<Node> expand(Node node){
        List<Node> acciones = new ArrayList<>();
        int x = node.getX();
        int y = node.getY();
        
        Node izquierda = new Node(x, y - 1);
        Node derecha = new Node(x, y + 1);
        Node arriba = new Node(x - 1, y);
        Node abajo = new Node(x + 1, y);
        
        if(isValidNode(izquierda)){
            izquierda.setState(laberinto.getValor(izquierda.getX(), izquierda.getY()));
            acciones.add(izquierda);
        }
        if(isValidNode(derecha)){
            derecha.setState(laberinto.getValor(derecha.getX(), derecha.getY()));
            acciones.add(derecha);
        }
        if(isValidNode(arriba)){
            arriba.setState(laberinto.getValor(arriba.getX(), arriba.getY()));
            acciones.add(arriba);
        }
        if(isValidNode(abajo)){
            abajo.setState(laberinto.getValor(abajo.getX(), abajo.getY()));
            acciones.add(abajo);
        }
        
        return acciones;
    }
    
    public boolean isValidNode(Node node){
        int x = node.getX();
        int y = node.getY();
        
        return x >= 0 && y >= 0 && (laberinto.getValor(x,y) >= 0 || laberinto.getValor(x,y) == getGoalState());
    }
}
