/*
 * Un convertisseur de températuresis template
 */
package tp2un.convertisseur.de.températures;
        import java.util.Scanner;
public class TP2UnConvertisseur  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur();

        System.out.println("1 : Celsius -> Kelvin");
        System.out.println("2 : Kelvin -> Celsius");
        System.out.println("3 : Fahrenheit -> Celsius");
        System.out.println("4 : Celsius -> Fahrenheit");
        System.out.println("5 : Fahrenheit -> Kelvin");
        System.out.println("6 : Kelvin -> Fahrenheit");
        System.out.print("Choix : ");
        int choix = sc.nextInt();

        System.out.print("Température à convertir : ");
        float t = sc.nextFloat();
        float res = 0;

        if (choix == 1) res = conv.CelciusVersKelvin(t);
        else if (choix == 2) res = conv.KelvinVersCelcius(t);
        else if (choix == 3) res = conv.FarenheitVersCelcius(t);
        else if (choix == 4) res = conv.CelciusVersFarenheit(t);
        else if (choix == 5) res = conv.FarenheitVersKelvin(t);
        else if (choix == 6) res = conv.KelvinVersFarenheit(t);
        else System.out.println("Choix invalide");

        System.out.println("Résultat : " + res);
        System.out.println(conv);
    }
}

// Classe Convertisseur
class Convertisseur {
    private int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public float CelciusVersKelvin(float c) {
        nbConversions++;
        return c + 273.15f;
    }

    public float KelvinVersCelcius(float k) {
        nbConversions++;
        return k - 273.15f;
    }

    public float FarenheitVersCelcius(float f) {
        nbConversions++;
        return (f - 32) * 5 / 9;
    }

    public float CelciusVersFarenheit(float c) {
        nbConversions++;
        return (c * 9 / 5) + 32;
    }

    public float FarenheitVersKelvin(float f) {
        nbConversions++;
        return (f - 32) * 5 / 9 + 273.15f;
    }

    public float KelvinVersFarenheit(float k) {
        nbConversions++;
        return (k - 273.15f) * 9 / 5 + 32;
    }

    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}
