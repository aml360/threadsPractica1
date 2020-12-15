package Ejercicio4_7_8_13;

public class Client extends Thread{
	private Cartera cartera;
	public Client(Cartera cartera) {
		this.cartera = cartera;
	}
	@Override
	public void run() {
		cartera.incrementarDinero();
	}
}
