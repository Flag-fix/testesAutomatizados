package testeAutomatizados.testeAutomatizados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteOperacoes {

	@Test
	public void TesteSomar(){
		int a = 3;
		int b = 2;
		
		int resultadoEsperado = 5;
		
		int resultado = Operacoes.soma(a, b);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
}
