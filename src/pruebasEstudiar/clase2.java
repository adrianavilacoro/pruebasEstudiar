package pruebasEstudiar;

public class clase2 {
	
//imprimir enteros positivos menores que 100, multiplos de 2 y de 3
	public static void ImprimeNumero() {
			for (int i=0; i<100; i++) {
				if (i%2==0 || i%3 ==0) {
					System.out.println(i);
				} 
					
			}
			
		}
	
//calcular el factorial de n
	public static double factorialn(int n) {
		if (n==0|| n==1) {
			return 1;
		}

		double numero =1;
		for(int i=1; i<n+1; i++) {
			double factorial= numero*i;
			numero=factorial;
		}
				
		return numero;
	}
	
	
//suma de todos los impares desde 0 hasta numero parametro
	public static int sumaImpares(int fin) {
		int suma=0;
		for(int i=0; i<=fin; i++) {
			if(i%2 != 0) {
				suma += i;
				
			}
		}
		return suma;
	}
	
	
	
/*comprobar si para todos los numeros entre 4 y 2000000 existe siempre un numero primo entre 
 n y 2n. Solo se saca el valor del numero que NO cumple la suposicion.
 utilizo metodo ya dado para comprobar si es numero primo 
*/	

private static boolean esPrimo(long num) {
	if (num%2==0) return false;
	for(long n=3; n*n<= num; n+=2)
		if (num% n==0)
			return false;
	return true;
	
}
public static void comprobacionPostulado (long n) throws Exception{
	if(n<4 || n>2000000) throw new Exception ("numero no valido");

	for (long i=3; i<=2*n; i++) {
		if(esPrimo(i)==false) {
			System.out.print(i);
		}
		else {
			return;
		}
			
	}
}


//calcular los n+1 primeros elementos de una serie de taylor  de un numero x. n mayor que 0.
public static double serieTaylor(double x, int n) {
	double desarrollo=0;
	double factorial=1;
	for(int i=1; i<=n;i++) {
		double multiplicacion= factorial* i;
		factorial=multiplicacion;
		double exponencial=Math.pow(x,i);	
		desarrollo+=(exponencial/multiplicacion); 
	}
	
	return desarrollo+1;
}

//el termino precision determina hasta que termino n se va a calcular pi
public static double calcularPi(double precision) {
	double resultado=0; 
	for(int n=0;n<=precision;n++) {
	double operacion = (Math.pow(-1.0, n)* (1.0/(2.0*n+1.0)));
	resultado += operacion;
	}
	return 4.0*resultado;
}

//el termino precision determina el margen de error
public static double calculaPi(double precision) {
	double n=0.0;
	double suma=0.0;
	double an=0.0;
	do {
		an= Math.pow(-1.0, n)*(1.0/(2.0*n+1.0));
		suma+=an;
		n++;
	}while(Math.abs(an)>precision);
	return 4.0*suma;
	}





public static void main (String[] args) {
	
System.out.print(calculaPi(0.000001));

}
}
