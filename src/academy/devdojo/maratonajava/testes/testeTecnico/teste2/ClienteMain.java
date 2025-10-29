package academy.devdojo.maratonajava.testes.testeTecnico.teste2;

import java.util.ArrayList;
import java.util.List;

public class ClienteMain {
    static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>(List.of(
                new Cliente("Lucca", 21, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Iann", 18, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Josue", 15, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Gabriel", 30, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Vini", 50, TipoSexo.MASCULINO,"Brasileiro")
        ));
        ClienteRepository clienteRepository = new ClienteRepository(clientes);
        clienteRepository.registerCliente(new Cliente("Luccao", 12, TipoSexo.MASCULINO, "br"));
        System.out.println(clienteRepository.listAllClientes());
        System.out.println( clienteRepository.searchByName("Lucca"));


    }
}
