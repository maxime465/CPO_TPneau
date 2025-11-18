/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes; 
public class Baton extends Arme {
      int age;
    public Baton(String nom, int niveauAttaque, int par1) {
        super(nom, niveauAttaque);
        if (age > 100)age=100;
    this.age = age;}
}
