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
public class Libro {
private Autore autore;
private int anno;
private double prezzo;
private String titolo;

    public Libro(Autore autore, int anno, double prezzo, String titolo) {
        this.autore = autore;
        this.anno = anno;
        this.prezzo = prezzo;
        this.titolo = titolo;
    }
        public Libro() {
        this.autore = null;
        this.anno = 0;
        this.prezzo = 0.0;
        this.titolo = null;
    }

    /**
     * @return the autore
     */
    public Autore getAutore() {
        return autore;
    }

    /**
     * @param autore the autore to set
     */
    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    /**
     * @return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno the anno to set
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the titolo
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * @param titolo the titolo to set
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
