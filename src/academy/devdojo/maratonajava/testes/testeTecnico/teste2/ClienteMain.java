package academy.devdojo.maratonajava.testes.testeTecnico.teste2;

import java.util.ArrayList;
import java.util.List;

public class ClienteMain {
    static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>(List.of(
                new Cliente("Lucca",1, 21, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Iann",2, 18, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Josue",3, 15, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Gabriel",4, 30, TipoSexo.MASCULINO,"Brasileiro"),
                new Cliente("Vini",5, 50, TipoSexo.MASCULINO,"Brasileiro")
        ));
        ClienteRepository clienteRepository = new ClienteRepository(clientes);
        clienteRepository.registerCliente(new Cliente("Luccao", 12, TipoSexo.MASCULINO, "br"));
        clienteRepository.updateAge(1, 100);
        System.out.println(clienteRepository.listAllClientes());
        clienteRepository.deleteUser(1);
        clienteRepository.deleteUser(2);
        clienteRepository.deleteUser(3);
        clienteRepository.deleteUser(4);
        clienteRepository.deleteUser(5);
        System.out.println(clienteRepository.listAllClientes());

    }
}
