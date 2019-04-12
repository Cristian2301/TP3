package unq;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	private Integer cantidadPares() {
		Integer cantPares = 0;
		for (Integer n : numeros) {
			cantPares += esPar(n)?1:0;
		}
		return cantPares;
	}   
	
	private Boolean esPar(Integer n) {
		return n % 2 == 0;
	}
		
	private Integer cantidadImpares() {
		Integer cantImpares = 0;
		for (Integer n : numeros) {
			cantImpares += !esPar(n)?1:0;
		}
		return cantImpares;
	}
	
	private Integer cantidadMultiplosDe(Integer num) {
		Integer cantMultiplosDeN = 0;
			for(Integer n : numeros) {
				cantMultiplosDeN += esMultiplo(n, num)?1:0;
			}
			return cantMultiplosDeN;
	}
	
	private Boolean esMultiplo(Integer n, Integer num) {
		return num % n == 0 ;
	}

	public void addNumber(int i) {
		numeros.add(i);	
	}

	public int getEvenOcurrences() {
		return this.cantidadPares();
	}
	
}
