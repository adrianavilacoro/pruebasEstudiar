package ejerciciosMoodleTema3;

public class Lectura extends Thread {
private RecursoCompartido recurso;

public Lectura(RecursoCompartido recurso) {
	this.recurso=recurso;
}
public void run() {
	recurso.lectura();
}
}
