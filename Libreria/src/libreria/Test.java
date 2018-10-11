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
public class Test {
    public static void main(String[] args) {
        int i=0;
        int indice=0;
        Autore autore= new Autore(20,1,"Mirko Apicella");
        Autore autore2= new Autore(30,1,"Fabio Moscariello");
        Autore autore3= new Autore(22,1,"Salvatore Manzo");
        Libro lib = new Libro(autore,2016,22.10,"Come superare ETC");
        Libro lib2 = new Libro(autore2,2015,33.50,"Come coglioneggiare in C");
        Libro lib3 =new Libro(autore3,2018,10.00,"Come prendere Java in 1 giorno");
        Libro[] libri= {lib,lib2,lib3};
        Libreria libreria= new Libreria(libri,"Unisa");
        libreria.mostraLibri();
        Libro libTemp=libreria.trovaLibroFromTitolo("Come prendere Java in 1 giorno");
        if(!(libTemp==null))        
        {
                System.out.println("Autore trovato: "+ libTemp.getAutore().getNome());
                }
        libTemp=new Libro();
        for (Libro libro: libreria.getLibri()) {
            
            if(libTemp.getPrezzo()<libro.getPrezzo()){
                indice=i;
                libTemp=libro;
            
            }
        i++;
        }
        
        System.out.println("Autore: "+libTemp.getAutore().getNome()+ " Titolo: "+ libTemp.getTitolo()+ " prezzo "+ libTemp.getPrezzo() + "con indice "+ indice);
        
    }
}
