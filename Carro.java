public class Carro {
  String modelo;
  String cor;
  int ano; 

public Carro (String modelo, String cor, int ano) {
  this.modelo = modelo;
  this.cor = cor;
  this.ano = ano;
 }
public void exibirInformacoes() {

   System.out.println("Modelo: " + modelo);
   System.out.println("Cor: " + cor);
   System.out.println("Ano: " + ano);

 }

public static void main(String[] args) {

  Carro primeiroCarro = new Carro("BMW", "Preto", 1999);
  Carro segundoCarro = new Carro("Gol", "Vermelho", 2009);
  Carro terceiroCarro = new Carro("Uno", "Branco", 1995);

  primeiroCarro.exibirInformacoes(); 
  segundoCarro.exibirInformacoes();
  terceiroCarro.exibirInformacoes(); 

 }

}

