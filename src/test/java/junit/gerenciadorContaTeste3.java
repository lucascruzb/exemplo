package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class gerenciadorContaTeste3 {
    private GerenciadoraContas gerContas;
	
	@Test
	public void testTransfereValor() {

		/* ========== Montagem do cen�rio ========== */
		
		// criando alguns clientes
		ContaCorrente conta01 = new ContaCorrente(1, 200, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execu��o ========== */
		gerContas.transfereValor(1, 100, 2);
		
		/* ========== Verifica��es ========== */
		assertEquals(conta02.getSaldo(), 100.0);
		assertEquals(conta01.getSaldo(), 100.0);
	}
}
