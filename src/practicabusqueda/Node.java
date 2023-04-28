/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicabusqueda;


/**
 *
 * @author carlo
 */
public class Node {
    private short state; 
    private int x; 
    private int y; 
    private Node parent;

    public Node(){
        
    }
    
    public Node(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
    public Node(short state){
        this.state = state;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Node{" + "state=" + state + ", x=" + x + ", y=" + y + ", parent=" + parent + '}';
    }
    
   
    
    
}
