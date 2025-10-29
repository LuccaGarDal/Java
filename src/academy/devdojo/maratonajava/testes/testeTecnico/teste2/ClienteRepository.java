package academy.devdojo.maratonajava.testes.testeTecnico.teste2;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public ClienteRepository(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void registerCliente (Cliente cliente) {
        clientes.add(cliente);

    }

    public List<Cliente> listAllClientes () {
        return clientes;
    }

    public List<Cliente> searchByName (String name) {
        List<Cliente> list = clientes.stream()
                .filter(s -> s.getName().contains(name))
                .toList();

        return list;


    }
}
