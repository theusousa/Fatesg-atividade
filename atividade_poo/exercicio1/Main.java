public class Main {
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
