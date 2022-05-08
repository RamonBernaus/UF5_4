/*Afegiu una classe prova que instanciï un objecte LlistaDeNoms i provi els seus mètodes.*/
package uf5_4;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Prova {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        LlistaDeNoms ll = new LlistaDeNoms();
        System.out.println("On vols insertar el nom?");
        int insert = s.nextInt();
        System.out.println("Quin nom vols insertar? ");
        String nom = s.nextLine();
        ll.afegirNom(nom);
        ll.InsertarNomEnPosicio(insert, nom);
        ll.eliminarNom(insert);
        ll.imprimirNoms();
    }
}
