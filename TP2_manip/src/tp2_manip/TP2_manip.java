/*
 * TP2_manip
 */
package tp2_manip;

/**
 *
 * @author maxneau
 */


public class TP2_manip {

    public static void main(String[] args) {

        // Création de deux tartiflettes différentes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // assiette3 référence la même tartiflette que assiette2
        Tartiflette assiette3 = assiette2;

        System.out.println("Assiette 1 : " + assiette1.nbCalories + " calories");
        System.out.println("Assiette 2 : " + assiette2.nbCalories + " calories");
        System.out.println("Assiette 3 : " + assiette3.nbCalories + " calories");

        // Modification : on change les calories de assiette3
        assiette3.nbCalories += 100;

        System.out.println("\nAprès modification :");
        System.out.println("Assiette 2 : " + assiette2.nbCalories + " calories");
        System.out.println("Assiette 3 : " + assiette3.nbCalories + " calories");

        // Inversion des références entre assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nAprès inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories + " calories");
        System.out.println("Assiette 2 : " + assiette2.nbCalories + " calories");

        // Création d'un tableau de 10 objets Moussaka
        Moussaka[] tabMoussaka = new Moussaka[10];

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(100 + i * 10);
        }

        System.out.println("\n10 Moussakas créées :");
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
}

