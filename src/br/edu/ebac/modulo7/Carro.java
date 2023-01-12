package br.edu.ebac.modulo7;

/**
 * @author ricardo.silva
 */
public class Carro {

    private String modelo;

    /*
    O atributo placa deve respeitar o formato: ABC-1234
     */
    private String placa;

    private int velocidade = 0;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    /**
     * @return retorna a placa no formato string
     */
    public String getPlaca() {
        return placa;
    }


    public void acelerar(int novaVelocidade){

        this.velocidade += novaVelocidade;
    }


    public void  mostraVelocidade() {
        System.out.printf("%d km/h", this.velocidade);
    }

    /**
     * @deprecated
     * @see public void mostraVelocidade();
     */
    public int getVelocidade() {
        return velocidade;
    }
}
