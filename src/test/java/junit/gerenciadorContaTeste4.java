package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class gerenciadorContaTeste4 {
    
	private GerenciadoraContas gerContas;
	
	/**
	 * Teste basico da transferencia de um valor da conta de um cliente para outro,
	 * estando ambos os clientes ativos e havendo saldo suficiente para tal transferencia
	 * ocorrer com sucesso.
	 * 
	 * @author Lucas da Cruz Barbosa
	 * @date 05/10/2022
	 */
	@Test
	public void testTransfereValor() {

		/* ========== Montagem do cenario ========== */
		
		// criando alguns clientes
		ContaCorrente conta01 = new ContaCorrente(1, 200, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execu��o ========== */
		boolean sucesso = gerContas.transfereValor(1, 100, 2);
		
		/* ========== Verifica��es ========== */
		assertEquals(sucesso,true);
		assertEquals(conta02.getSaldo(),100.0);
	}

}

// Documenta��o e coment�rios