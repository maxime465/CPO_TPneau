

/*
 * Convertisseur
 */

/**
 *
 * @author maxneau
 */
public class Convertisseur {
    int nbConversions = 0;

    public float CelciusVersKelvin(float t) {
        nbConversions++;
        return t + 273.15f;}
    public float KelvinVersCelcius(float t) {
        nbConversions++;
        return t - 273.15f;}
    public float FarenheitVersCelcius(float t) {
        nbConversions++;
        return (t - 32) * 5 / 9;}
     public float CelciusVersFarenheit(float t) {
        nbConversions++;
        return (t * 9 / 5) + 32;}
        public float FarenheitVersKelvin(float t) {
        nbConversions++;
        return (t - 32) * 5 / 9 + 273.15f;}

    public float KelvinVersFarenheit(float t) {
        nbConversions++;
        return (t - 273.15f) * 9 / 5 + 32;}

    public String toString() {
        return "Nombre de conversions : " + nbConversions;}

  } 