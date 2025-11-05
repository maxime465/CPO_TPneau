/*
 * TP2_manip
 */
package tp2_manip;

/**
 *
 * @author maxneau
 */
public class TP2_manip {
    public static void main(String[] args) {Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

      
        assiette3.nbCalories += 100;

        System.out.println("\nAprès modification :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : ");
            }
    
}
