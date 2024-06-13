package com.sun;

public class InstrumenetsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrumenets[] instrumenets = new Instrumenets[2];
		instrumenets[0] = new Guitar();
		instrumenets[1] = new Piano();

		for (Instrumenets instrument : instrumenets) {
			instrument.display();
		}
	}
}
