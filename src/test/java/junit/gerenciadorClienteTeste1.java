package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class gerenciadorClienteTeste1 {

    /**
     * 
     */
    @Test
    public void testPesquisacliente(){
        //Montagem do cenário

        //criando usuarios
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);

        // criando lista e adicionando usuarios 
        List <Cliente> ClienteDoBanco = new ArrayList<>();
        ClienteDoBanco.add(cliente01);
        ClienteDoBanco.add(cliente02);

        GerenciadoraClientes gClientes = new GerenciadoraClientes(ClienteDoBanco);

        // execução
        Cliente cliente = gClientes.pesquisaCliente(1);

        // verificação
        assertEquals(cliente.getId(), 1);
        assertEquals(cliente.getEmail(), "gugafarias@gmail.com");
    }
    
}
