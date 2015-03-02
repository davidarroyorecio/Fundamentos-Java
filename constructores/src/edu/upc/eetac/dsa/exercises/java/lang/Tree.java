package edu.upc.eetac.dsa.exercises.java.lang;

public class Tree {
    private int height;
    private String name;

    public Tree() {
        this(0, null);
    }

    public Tree(int height) {
        this(height, null);
    }

    public Tree(String name) {
        this(0, name);
    }

    public Tree(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    public int GetAlto(){
    	return this.height;
    }
   
    public String GetNombre(){
    	return this.name;
    }
}