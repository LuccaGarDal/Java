package academy.devdojo.maratonajava.testes.testeTecnico.teste2;

public class Cliente {
    private String name;
    private int id;
    private int age;
    private TipoSexo tipoSexo;
    private String nationality;

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", tipoSexo=" + tipoSexo +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public Cliente(String name, int age, TipoSexo tipoSexo, String nationality) {
        this.name = name;
        this.age = age;
        this.tipoSexo = tipoSexo;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TipoSexo getTipoSexo() {
        return tipoSexo;
    }

    public void setTipoSexo(TipoSexo tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
