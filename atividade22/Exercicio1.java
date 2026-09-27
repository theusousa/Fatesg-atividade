class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double calcularPreco() {
        return 0;
    }
}

class UsuarioBasico extends Usuario {
    public UsuarioBasico(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 19.90;
    }
}

class UsuarioPremium extends Usuario {
    public UsuarioPremium(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 34.90;
    }
}

class UsuarioFamilia extends Usuario {
    public UsuarioFamilia(String nome, String email) {
        super(nome, email);
    }

    @Override
    public double calcularPreco() {
        return 49.90;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Usuario u1 = new UsuarioBasico("Joao", "joao@gmail.com");
        Usuario u2 = new UsuarioPremium("Maria", "maria@gmail.com");
        Usuario u3 = new UsuarioFamilia("Pedro", "pedro@gmail.com");

        Usuario[] usuarios = {u1, u2, u3};

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Nome: " + usuarios[i].getNome());
            System.out.println("Email: " + usuarios[i].getEmail());
            System.out.println("Preco: R$ " + usuarios[i].calcularPreco());
            System.out.println();
        }
    }
}
