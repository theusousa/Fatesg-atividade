package animais;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println(nome + " faz: som generico de animal");
    }
}
