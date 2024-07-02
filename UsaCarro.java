package TrabalhosProz;

public class UsaCarro {
    public static void main(String[] args) {
        Carro c;
        c = new Carro();
        c.carro = "bmw";
        c.ano = "2003";
        c.modelo= "bmw x3";
        c.combustivel = "dissel";
        c.quilometragem = "600";
        c.cor = "preto";
        c.numerodeporta = "4";
        c.potencia = "500 cavalo";
        c.preço = "42.000";
        c.passageiro = "5"; 

        System.out.println("Carro: " + c.carro);
        System.out.println("Ano: " + c.ano);
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Combustivel " + c.combustivel);
        System.out.println("Cor: " + c.cor);
        System.out.println("Numerodeporta: " + c.numerodeporta);
        System.out.println("Potencia: " + c.potencia);
        System.out.println("Preço: " + c.preço);
        System.out.println("Passageiro: " + c.passageiro);
    }
    
}
