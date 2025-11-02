package academy.devdojo.maratonajava.exercicios.ExercicioPadroes.Builder;

public class User {
    private String username;
    private int id;
    private int age;
    private String nome;

    private User(String username, int id, int age, String nome) {
        this.username = username;
        this.id = id;
        this.age = age;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static final class UserBuilder {
        private String username;
        private int id;
        private int age;
        private String nome;

        private UserBuilder() {
        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public User build() {
            return new User(username, id, age, nome);
        }
    }
}
