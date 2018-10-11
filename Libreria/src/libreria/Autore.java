/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Fabio Moscariello
 */
public class Autore {
    private int eta;
    private int numeroLibri;
    private String nome;

    public Autore(int eta, int numeroLibri, String nome) {
        this.eta = eta;
        this.numeroLibri = numeroLibri;
        this.nome = nome;
    }
    public Autore() {
        this.eta = 0;
        this.numeroLibri = 0;
        this.nome = null;
    }

    /**
     * @return the eta
     */
    public int getEta() {
        return eta;
    }

    /**
     * @param eta the eta to set
     */
    public void setEta(int eta) {
        this.eta = eta;
    }

    /**
     * @return the numeroLibri
     */
    public int getNumeroLibri() {
        return numeroLibri;
    }

    /**
     * @param numeroLibri the numeroLibri to set
     */
    public void setNumeroLibri(int numeroLibri) {
        this.numeroLibri = numeroLibri;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
