package pruebasEstudiar;

public class clase6 {
			 
//crear un METODO ITERATIVO (BUCLES) PARA CALCULAR EL FACTORIAL DE N, EXCEPCION SI N NEGATIVO
	public static int factorialIterativo (int n) throws Exception {
			if (n<0) throw new Exception ("valor no definido");
			int producto=1;
			for(int i=1; i<=n; i++) 
				 producto*=i;
			return producto; 
		 }

//factorial RECURSIVO. Invoco al propio metodo constantemente.
	public static int factorialRecursivo(int n) throws Exception {
		if (n<0) throw new Exception ("factorial no definido para negativos");
		if (n==0 || n==1)
			return 1;
		return n*factorialRecursivo(n-1);
	}
	
//ITERATIVO. Recorrer array y devolver la suma de los elementos
	public static int sumaArrayIterativo(int [] enteros) throws Exception{
		if (enteros ==null || enteros.length==0) throw new Exception ("invalido");
		int suma=0;
		for (int i=0; i<enteros.length; i++) {
			suma+=enteros[i];
		}
		return suma;		
	}
//RECURSIVO. lo mismo.
//1. Creo metodo privado que es el recursivo
	private static int sumaArrayRecursivo(int [] enteros, int indice) {
		if (indice == enteros.length -1)
			return enteros[indice];
		else {
			return enteros[indice]+sumaArrayRecursivo(enteros,indice+1);
		}		
	}
//2.Creo metodo fachada que es al que voy a invocar, con indice 0
	public static int sumaArrayRecursivo(int[] enteros) throws Exception{
		if (enteros ==null || enteros.length==0) throw new Exception ("invalido"); 
		return sumaArrayRecursivo(enteros,0);
	}

/*METODO ITERATIVO para calcular la suma de los primeros n elementos de una SERIE ARITMETICA. 
excepcion si n negativo
n numero de terminos, d diferencia o razon que sumas cada vez, a valor incial desde donde empieza la serie*/
	public static double sumaAritmetica(int n, double d, double a) throws Exception{
		if (n<0) throw new Exception ("expresion invalida");
		double resultado=0;
		for(int i=0; i<n; i++) {
			double termino= d*i + a;
			resultado += termino;
		}
		return resultado;
	}

//METODO RECURSIVO para suma SERIE ARITMETICA CON FORMULA DE GAUSS
	public static double sumaAritmeticaRecursivo(int n, double d, double a) throws Exception{
		if (n<0) throw new Exception ("expresion invalida");
		if (n==0)
			return 0;
		else 
			return a + (n-1)*d + sumaAritmeticaRecursivo(n-1, d, a);
	}

	
  public static void main (String[] args) {
	 //ejercicio1 
	 try{ System.out.println(factorialIterativo(15));
	 System.out.println(factorialRecursivo(15));
	 } catch(Exception e) {
	 }
	 
	 //ejercicio2
	 int [] enteros= {1,2,3,4,5,6,7,8,9,10};
	 try{ System.out.println(sumaArrayIterativo(enteros));
	 System.out.println(sumaArrayRecursivo(enteros));
	 } catch(Exception e) {
	 }
	 
	 //ejercicio3
	 try{ System.out.println(sumaAritmeticaRecursivo(15,5,4));
	 System.out.println(sumaAritmetica(15,5,4));
	 } catch(Exception e) {
	 }
	 
}
}
