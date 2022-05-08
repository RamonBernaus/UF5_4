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
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ramon
 */
public class LlistaDeNoms {
    Scanner s = new Scanner (System.in);
    private ArrayList llista;

    public LlistaDeNoms() {
        this.llista = new ArrayList();

    }

    int getNumeroElements() {
        return llista.size();
    }

    String afegirNom(String nom) throws Exception {
        RepetitException repetit = new RepetitException();
        for (int i = 0; i < llista.size(); i++) {
            String str = (String) llista.get(i);
            if (!nom.equals(str)) {
                llista.add(nom);
                System.out.println(llista.get(i));
                
            } else {
                throw new Exception(repetit);
            }
        }
        return nom;
    }
String InsertarNomEnPosicio(int index, String nom) throws Exception{
ForaRangException forarang = new ForaRangException();
    System.out.println("Digues en quina posicio vols insertar el nom: ");
    index = s.nextInt();
if (index <= llista.size()){
    llista.add(index, nom);
} else {
    throw new Exception(forarang);
}
return nom;
}

String obtenirNom(int index) throws Exception{
String nom = "";
ForaRangException forarang = new ForaRangException();
    System.out.println("Digues quina posicio vols veure: ");
    index = s.nextInt();
if (index <= llista.size()){
    llista.get(index);
} else {
    throw new Exception(forarang);
}
return nom;
}

String eliminarNom(int index)  throws Exception{
String nom = "";
ForaRangException forarang = new ForaRangException();
    System.out.println("Digues quina posicio vols elimanar: ");
    index = s.nextInt();
if (index <= llista.size()){
    llista.remove(index);
} else {
    throw new Exception(forarang);
}
return nom;

}

String imprimirNoms(){
String str = "";
for(int i = 0 ; i<llista.size(); i++){
    System.out.println(i + " " + llista.get(i));
}
return str; 
}

String buscarNom(String nom){
Iterator<String> it = llista.iterator();
String expresioRegular = nom;
Pattern regles = Pattern.compile(expresioRegular);
Matcher textAnalitzar = regles.matcher(nom);
if (textAnalitzar.matches() == true){
System.out.print("La cadena coincideix en la seva totalitat");
while(it.hasNext()) {
  System.out.println(it.next());
}
} else {
    System.out.println("null");
} return nom;
}

    public class RepetitException extends Throwable {

        public RepetitException() {
            super("El nom esta repetit");
        }
    }

    public class ForaRangException extends Throwable {

        public ForaRangException() {
            super("El numero es més gran que l'espai de la llista");
        }
    }

}
