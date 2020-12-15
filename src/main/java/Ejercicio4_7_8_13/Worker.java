package Ejercicio4_7_8_13;

public class Worker extends Thread{
	private Cartera cartera;
	public Worker(Cartera cartera) {
		this.cartera = cartera;
	}
	@Override
	public void run() {
		cartera.decrementarDinero();
	}
}
