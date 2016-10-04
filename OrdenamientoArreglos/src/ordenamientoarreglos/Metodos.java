/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoarreglos;

/**
 *
 * @author sofilop
 */
public class Metodos {
//    
// public static String  mostarDatosEjer1(){
// int datos[]={25,14,5,1,0,33,15,16,21,6,0};
//
//     String res="";
//
//     for (int i = 0; i <= datos.length; i++) {
//       
//             res=res+datos[i]+" ";
//        
//       
//     }
//
//       res=res+"\n";
//     return res;
//     
// }
     public static void eje1ordenaQuick (int[] vector, int izq, int der){
		int i=0;
                 int j=0;
		int x=0, aux=0;
		i=izq;
		j=der;
		x=vector[(izq+der)/2];
		do{
			while((vector[i] < x) && (j <= der)){
				i++;
			}
			while((x < vector[j]) && (j > izq)){
				j--;
			}
			if(i<=j){
				aux=vector[i];
				vector[i]=vector[j];
				vector[j]=aux;
				i++; j--;
			}
		}while(i<=j);
		if(izq < j){
			eje1ordenaQuick(vector, izq, j);
		}
		if(i < der){
			eje1ordenaQuick(vector, i, der);
		}
		
	}
	
    
  public double [] ejer2ShellSort(double[] arreglo){
		boolean estado;
		for(int j =( arreglo.length / 2); j > 0; j = j == 2 ? 1 : j / 2){
			do{
				estado = false;
			for(int i = 0; i + j < arreglo.length;i++ ){
				if(arreglo[i+j] < arreglo[i]){
					double aux = arreglo[i+j];
					arreglo[i+j] = arreglo[i];
					arreglo[i] = aux;	
					estado = true;
				}
			}
			}while(estado);
		}
		
		return arreglo;
	}
	public static String[]  nombres(String []nom){
            // nom={"Karen","Andres", "Yuliana", "Alondra", "Daniela", "Isaac", "Nicolas","Laura", "Joselyn", "Emiliano"};
            
            String aux;
		
		for(int i=0;i<nom.length;i++){
			for(int j=0;j<nom.length-1;j++){
				if(nom[j].compareTo(nom[j+1])>0){
					aux=nom[j];
					nom[j]=nom[j+1];
					nom[j+1]=aux;
				}
			  }
			}
            return nom;
        }
}
