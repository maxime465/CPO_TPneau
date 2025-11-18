import Armes.Baton;
import Armes.Epee;

 /*
 * tp1.1
 */
public class Main {
    public static void main(String[] args) {
        Epee monEpee = new Epee("Excalibur", 90, 30);
        Baton monBaton = new Baton("Baton Magique", 70, 10);
        System.out.println(monEpee);
        System.out.println(monBaton);
    }
}



