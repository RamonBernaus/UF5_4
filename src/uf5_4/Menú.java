/**/
package uf5_4;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Menú {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner (System.in);
        LlistaDeNoms llista = new LlistaDeNoms();
        String nom;
        int i = 0;
        while( i<4){
        System.out.println("Afegeix un Nom: ");
        nom = s.nextLine();
        llista.afegirNom(nom);
        i++;
    }}
    }
