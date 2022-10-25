public class Main {

    private String nome;

    private void exibeVelocidade(){
        System.out.println("A velocidade de uma" + nome + "e de 380km/h");
    }

    public static void main(String[] args) {
        Carro c = new Carro();
        c.nome = "Ferrari";
        c.exibeVelocidade();

    }
}
