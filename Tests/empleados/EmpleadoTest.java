package empleados;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmpleadoTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void creoUnEmpleadoPorDefaultTest() {
		Empleado Juan = new Empleado();
		assertEquals(" ", Juan.getNombre());
		assertEquals(0, Juan.getSalario(), 0.001);
		assertNull(Juan.getFechaDeNacimiento());
	}
	
	@Test
	public void creoUnEmpleadoParametrizadotTest() {
		Empleado Ana = new Empleado("Ana",68000, new Fecha(23, 3, 1995));
		assertEquals("Ana", Ana.getNombre());
		assertEquals(68000, Ana.getSalario(), 0.01);
		Fecha esperada = new Fecha(23, 3, 1995);
		assertEquals(esperada, Ana.getFechaDeNacimiento());
	}
	
	@Test
	public void creoUnGerentePorDefaultTest() {
		Gerente Pablo = new Gerente();
		assertEquals(" ", Pablo.getNombre());
		assertEquals(0, Pablo.getSalario(), 0.001);
		assertNull(Pablo.getFechaDeNacimiento());
		assertNull(Pablo.getDepartamento());
	}

	@Test
	public void creoUnGerenteParametrizadotTest() {
		Gerente Julia = new Gerente("Julia",68000, new Fecha(26, 6, 1980), "Produccion");
		assertEquals("Julia", Julia.getNombre());
		assertEquals(68000 * 1.2, Julia.getSalario(), 0.01);
		Fecha esperada1 = new Fecha(26, 6, 1980);
		assertEquals(esperada1, Julia.getFechaDeNacimiento());
		assertEquals("Produccion", Julia.getDepartamento());
	}
}
