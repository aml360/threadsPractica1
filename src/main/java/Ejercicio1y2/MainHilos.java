package Ejercicio1y2;

import java.util.ArrayList;
import java.util.List;

public class MainHilos {
	
	/**
	 * Codigo copiado del repositorio publico de manuel revuelto (A.Molina)
	 * @author Manuel Revuelto
	 */
	public static void main(String[] args) {
		
		List<MisHilos> misHilos = new ArrayList<MisHilos>();
		for (int i = 0; i < 100; i++) {
			misHilos.add(new MisHilos());
		}
		for (MisHilos h : misHilos) {
			h.start();
		}
	}
}