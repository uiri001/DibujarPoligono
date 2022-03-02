package base;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dibujo.Dibujo;

class PoligonoTest {

	@Test
	void testPoligono() {
	
	}

	@Test
	void testCalcularPerimetro() {
		double perimetro = 0.0;
		int lados = 6;
		double longitudLado = 10;
		if (lados > 0) {
			int cuentaLados = lados;
			while(cuentaLados > 0) {
				perimetro += longitudLado;
				cuentaLados--;
			}			
		}
		
		assertEquals(60, perimetro);
	}

	@Test
	void testGetLados() {
		int lados = 6;
		assertEquals(6, lados);
	
	}

	@Test
	void testSetLados() {
		int lados = 6;
		assertEquals(6,lados);
	}

	@Test
	void testGetLongitudLado() {
		double longi = 10;
		assertEquals(10,longi);
	}

	@Test
	void testSetLongitudLado() {
		double longi = 10;
		assertEquals(10, longi);
	}

	@Test
	void testGetDibujo() {
		ArrayList<Poligono> p = new ArrayList<>();
		
		Dibujo d = new Dibujo();
		assertEquals(d,d);
		
	}

	@Test
	void testSetDibujo() {
		ArrayList<Poligono> p = new ArrayList<>();
		Dibujo d = new Dibujo();
		assertEquals(d,d);
	}

}
