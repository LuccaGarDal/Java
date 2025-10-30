package academy.devdojo.maratonajava.testes.testeTecnico.teste2;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private final List<Cliente> clientes;

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

    public void updateAge (int id, int age) {
        List<Cliente> list = clientes.stream()
                .filter(i -> i.getId() == id)
                .toList();

        for (Cliente cliente : list) {
            cliente.setAge(age);
        }
    }
    public void deleteUser (int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);

    }

}
