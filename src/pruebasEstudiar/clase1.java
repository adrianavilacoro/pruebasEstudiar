package pruebasEstudiar;
import java.util.Arrays;

public class clase1 {
 public static void main (String[] args) {
 
 
  int[] array = {8,9,10};
  
  try {
	  invertirArray(array);
	  } 
  catch (Exception e) {
	 
  }
 

 }
 
 public static void ImprimeArray(String[] array) throws Exception {
		 if(array==null|| array.length==0)
			 throw new Exception ("no funciona");
	 
		 for (int i=0; i<array.length; i++) {
			 if (array[i] != null) {
				 String palabra = array[i];
			     char letra = palabra.charAt(0);
			     System.out.print(letra + " ");
			 }
		 }
	 
}

 public static void invertirArray (int[] array) {
	 int [] arraydevuelve = new int[array.length];
	 for (int i=0; i<array.length; i++) {
		 int posicion = array.length - i -1 ;
		 arraydevuelve[posicion] = array[i];
		
	 }
	 System.out.println(Arrays.toString(arraydevuelve));
	 return;
 }

}
 
