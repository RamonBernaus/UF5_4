/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5_4;

import java.util.Scanner;

/**
 *
 * @author ausias
 */
public class Menú {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner (System.in);
        LlistaDeNoms llista = new LlistaDeNoms();
        String nom;
        System.out.println("Quin nom vols afegir? ");
        nom = s.nextLine();
        llista.afegirNom(nom);
    }
    }
