package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class gerenciadorClienteTeste3 {
    @Test
    public void testPesquisacliente(){
        //Montagem do cenário

        //criando usuarios
        Cliente cliente1 = new Cliente(1, "agua", 2000, "agua@hotmail.com", 1, true);
        Cliente cliente2 = new Cliente(2, "vapor", 1000, "vapo@hotmail.com", 2, true);


        // criando lista e adicionando usuarios 
        List <Cliente> ClienteDoBanco = new ArrayList<>();
        ClienteDoBanco.add(cliente1);
        ClienteDoBanco.add(cliente2);

        GerenciadoraClientes gClientes = new GerenciadoraClientes(ClienteDoBanco);
        
        // execução
        Cliente cliente = gClientes.pesquisaCliente(1);

        // verificação
        assertEquals(cliente.getId(), 1);
        assertEquals(cliente.getEmail(), "agua@hotmail.com");

    }

    @Test
    public void testRemoveCliente() {
        //Montagem do cenário

        //criando usuarios
        Cliente cliente1 = new Cliente(1, "agua", 2000, "agua@hotmail.com", 1, true);
        Cliente cliente2 = new Cliente(2, "vapor", 1000, "vapo@hotmail.com", 2, true);


        // criando lista e adicionando usuarios 
        List <Cliente> ClienteDoBanco = new ArrayList<>();
        ClienteDoBanco.add(cliente1);
        ClienteDoBanco.add(cliente2);

        // execução
        GerenciadoraClientes gerClientes = new GerenciadoraClientes(ClienteDoBanco);
        boolean clienteRemovido = gerClientes.removeCliente(2);
		
        // verificação
        assertEquals(clienteRemovido, true);
        assertEquals(gerClientes.getClientesDoBanco().size(), 1);
		assertEquals(gerClientes.pesquisaCliente(2),null);
    }

}
