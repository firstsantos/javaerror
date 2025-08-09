package Project_Sfinx;

class Lampada {
 // Declaração de atributos
    int voltagem;
    int potência;
    String cor;
    int luminosidade;
    boolean estaLigada;


    //Métodos de classe
    void acender()  {
        estaLigada = true;
        iluminar();
    }

    void apagar() {
        estaLigada = false;
    }

    void iluminar() {
        System.out.println("Quanta luz!");
    }

    boolean verificar() {
        return estaLigada;
    }
}
