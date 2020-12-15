package Ejercicio1y2;

public class MisHilos extends Thread {

	
	/**
	 * Imprime por pantalla el tiempo a dormir y despierta pasados esos segundos
	 * @author Manuel Revuelto
	 */
	@Override
	public void run() {
		
		Long seg = (long) (Math.random() * 5 + 1);
		System.out.println("Soy el hilo " + getId() + " y me pongo a dormir " + seg + " segundos.");
		try {
			Thread.sleep(seg * 1000);
		} catch (InterruptedException e) {
			System.out.println("Error a la hora de dormir los hilos");
		}
		System.out.println("Soy el hilo " + getId() + " y he terminado de dormir");
	}

}
