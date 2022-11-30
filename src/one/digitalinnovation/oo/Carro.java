package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
class Carro {

    String cor; // atributo
    String modelo; // atributo
    int capacidadeTanque; // atributo

    Carro() { //construtor mais simples, constroi o carro vazio sem nenhuma informação. objeto vazio

    }
    // construtor
    Carro(String cor, String modelo, int capacidadeTanque) { //sobrecarga do método. parâmetros dentro dos parênteses. objeto com valores iniciais
        this.cor = cor; // o atributo cor recebe cor como parâmetro...
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    //getters setters

    void setCor(String cor) { //para colocar um valor no atributo cor. String cor nesse caso é parâmetro do método set cor
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    
    //metodo

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
