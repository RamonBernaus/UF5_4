/*1. Dissenyeu una classe denominada LlistaDeNoms amb un només atribut de tipus ArrayList
anomenat llista i que disposa dels mètodes següents:
• Un constructor on s'inicialitze la llista
• int getNumeroElements(): retorna el nombre d'elements de llista
• afegirNom(String nom): afegeix un nom a llista. Llença una excepció del tipus
RepetitException si el nom ja existeix.
• insertarNomEnPosicio(int index, String nom): afegeix un nom en la posició indicada.
Llença una excepció ForaRangException si no es pot fer la inserció.
• String obtenirNom(int index): retorna el nom en la posició indicada. Llença una
excepció ForaRangException si no es pot fer la inserció.
• eliminarNom(int index): elimina el nom de la posició indicada. Llença una excepció
ForaRangException si no es pot esborrar la posició.
• String imprimirNoms(): retorna un String amb tots els noms indicant la seva posició en
la llista. Utilitza el bucle for tradicional.
• String buscarNom(String nom): cerca totes les coincidències tant parcials com
completes de nom en els noms de llista i retorna un String amb el contingut. En cas de
no trobar cap coincidència retornarà null. Utilitza un objecte Iterator.
Afegiu una classe prova que instanciï un objecte LlistaDeNoms i provi els seus mètodes.*/
package uf5_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class LlistaDeNoms{
    
    private ArrayList llista;

    public LlistaDeNoms() {
        this.llista = new ArrayList<String>();

    }

    int getNumeroElements() {
        return llista.size();
    }

    String afegirNom(String nom) throws Exception{
        llista.add(nom);
        RepetitException e = new RepetitException();
        for (int i = 0; i < llista.size(); i++){
        if (nom.equals(llista.get(i+1))) {
            throw new Exception(e);
    }
        }
        return nom;
    }
    public class RepetitException extends Throwable{
        public RepetitException() {
        super("El nom esta repetit");
    }
    }

}

