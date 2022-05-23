package Memoire;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
    public String randomString(int taille)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<taille;i++)
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public Utilisateur generateUser()
    {
        Utilisateur x= new Utilisateur(randomString(7),randomString(8),randomString(5)+"@"+randomString(4)+"."+randomString(3));
        return x;
    }
    public void generatePanier(Utilisateur user)
    {
        Random r1 = new Random();
        Random r2= new Random();
        user.setPanier(1+(199)* r1.nextDouble(),1+(29)*r2.nextInt());
    }


    public static void main (String[] args) {
        Controller controller = new Controller();
        ArrayList<Utilisateur> util = new ArrayList<>();
        double tempsdexe = 0;
        int nb_exe = 50;
        long tps_deb=0;
        long tps_fin=0;
        long tps_tot=0;
        for (int j = 0; j < nb_exe; j++) {
            tps_deb=System.nanoTime();
            for (int i = 0; i < 500; i++) {
                util.add(controller.generateUser());
            }
            for (int i = 0; i < 500; i++) {
                controller.generatePanier(util.get(i));
            }
            for (int i = 0; i < 500; i++) {
                System.out.println(util.get(i).toString());
            }
            tps_fin=System.nanoTime();
            tps_tot=tps_tot+(tps_fin-tps_deb);
            util.clear();
        }
        System.out.println("Le temps d'exécution moyenne des "+nb_exe+ "exécutions est de " +tps_tot/(nb_exe*10000) + " milisecondes");
    }
}
