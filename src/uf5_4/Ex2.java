/*2. Implementar una classe anomenada Loteria que contindrà un atribut d'algun dels tipus de
Collection per a emmagatzemar els números premiats sense que permeti emmagatzemar
números repetits. Per a emmagatzemar els números utilitzar objectes Integer. La classe haurà
de tenir un mètode nou(int numero) per a emmagatzemar el número i que llanci una excepció
de tipus RepetitException amb un missatge d'error en cas que el número ja existeixi en la
col·lecció. */
package uf5_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Ex2 {

    class Loteria {
Scanner s = new Scanner (System.in);
        private ArrayList loteria;

        public Loteria() {
            this.loteria = new ArrayList();

        }

        public int nou(int numero) throws Exception {
            RepetitException repetit = new RepetitException();
            if (loteria.contains(numero)) {
                throw new Exception(repetit);
            } else {
                loteria.add(numero);
            }
            return numero;
        }
public  Iterator<String> imprimirPremiats(){
Iterator<String> llista = loteria.iterator(); 
while(llista.hasNext()) {
  System.out.println(llista.next());

}
return llista;
}
public  boolean premiat(int n){
boolean existeix;
if(loteria.contains(n)){
existeix = true;
} else{
existeix = false;
}
return existeix;
}
        public class RepetitException extends Throwable {

            public RepetitException() {
                super("El numero esta repetit");
            }
        }
    }
}
