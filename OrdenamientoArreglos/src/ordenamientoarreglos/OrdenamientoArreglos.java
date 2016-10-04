/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoarreglos;

import static ordenamientoarreglos.Metodos.eje1ordenaQuick;

/**
 *
 * @author sofilop
 */
public class OrdenamientoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t \tEjercicio 1 ");
        System.out.println("");
        int arreglo[]={25,14,5,1,0,33,15,16,21,6,0};
		eje1ordenaQuick(arreglo,0, arreglo.length-1);
		for(int i=0; i < arreglo.length;i++){
		System.out.print(arreglo[i]+",");
		}
                System.out.println(" ");
                
             System.out.println(" ");   
         System.out.println("\t \tEjercico 2 ");
         
	
    double[] numeros ={10.23, 23.10, 55.10, 55.001, 24.5, 24.014, 18.0, 13.3, 10.23};
		
		Metodos mostrar = new Metodos();
		
		double[] result = mostrar.ejer2ShellSort(numeros);

		for(int i=0; i<result.length;i++){
			System.out.print(result[i] + " ,");
		}
                System.out.println("");
                System.out.println(" ");   
         System.out.println("\t \tEjercico 3 ");
         
  
       //  System.out.println(""+re);
        String [] nom={"Karen","Andres", "Yuliana", "Alondra", "Daniela", "Isaac", "Nicolas","Laura", "Joselyn", "Emiliano"};
			for(int i=0;i<Metodos.nombres(nom).length;i++){
				
                                System.out.println("\t \t "+Metodos.nombres(nom)[i]);
			
		}
        // TODO code application logic here
}
    
}
