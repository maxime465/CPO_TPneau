/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes; 
public class Epee extends Arme {
     int indice;
    public Epee(String nom, int niveauAttaque, int indice) {
        super(nom, niveauAttaque);
        if (indice > 100)indice=100;
        this.indice = indice;
}}

