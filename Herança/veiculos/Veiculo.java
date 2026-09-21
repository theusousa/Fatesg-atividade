package veiculos;

public class Veiculo {
  protected String marca;
  protected String modelo;
  protected int ano;
  
  public Veiculo (String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void acelerar() {
    System.out.println("Veiculo esta acelerando");
  }

  public void frear() {
    System.out.println("Veiculo esta freando");
  }
}
