package ejerciciosMoodleTema3;

import java.util.concurrent.ThreadLocalRandom;

public class RecursoCompartido {
public int numero;

public RecursoCompartido(int numero) {
	this.numero=numero;
}

public void lectura(){
	System.out.print(numero);
}
public synchronized void escritura() {
	numero = ThreadLocalRandom.current().nextInt(0, 10);
}
}
