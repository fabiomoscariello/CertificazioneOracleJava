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
public class Libreria {

    private Libro[] libri;
    private String indirizzo;

    public Libreria(Libro[] libri, String indirizzo) {
        this.libri = libri;
        this.indirizzo = indirizzo;
    }

    public Libreria() {
        this.libri = null;
        this.indirizzo = null;
    }

    /**
     * @return the libri
     */
    public Libro[] getLibri() {
        return libri;
    }

    /**
     * @param libri the libri to set
     */
    public void setLibri(Libro[] libri) {
        this.libri = libri;
    }

    /**
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Libro trovaLibroFromAutore(String nomeAutore) {
        //for(int i=0;i<libri.length;i++)
        for (Libro libro : libri) {

            if (libro.getAutore().getNome().equals(nomeAutore)) {
                return libro;
            }
        }
        return null;
    }

    public Libro trovaLibroFromTitolo(String titolo) {
        //for(int i=0;i<libri.length;i++)
        for (Libro libro : libri) {

            if (libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostraLibri() {
        for (Libro libro : libri) {
            System.out.println(libro.getTitolo());
        }
    }
}
