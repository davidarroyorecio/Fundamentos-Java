package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5, "Pino");
         
        for (int i=0;i<4;i++){
            
        	if(arboles[i].GetAlto()==0){
        		if(arboles[i].GetNombre()!=null)
        			System.out.println("Un "+arboles[i].GetNombre());
        		else
        			System.out.println("Un árbol");
        	}
        	else{
            	if(arboles[i].GetNombre()!=null)	
            		System.out.println("Un "+arboles[i].GetNombre()+" de "+arboles[i].GetAlto()+ "metros");
            	else
            		System.out.println("Un árbol de "+arboles[i].GetAlto()+ "metros");
            }
        	
        }	//System.out.println(t);
    }
}