import java.util.Scanner;

/**
 * Created by fcmam5 on 1/22/16.
 * Project for Nihed (a "Météo" student)
 */
public class Main {
    public static void main(String[] args) {
        /**
         * tsv: temps solaire vraie
         * tsm: temps solaire moyen
         * et : equation du temps
         * tu : temps universel
         * tl : temps legal
         * s_dcl : Declinaison
         * l_lngt : Longitude
         * g_ltitu: Latitude
         * jj,mm,aa : Jours,Mois,Année
         * h,m,s : heur,minute,second
         * higt: l'hauteur
         * w:
         */


        //double w =0.0172;
        int jj;
        int mm;
        int aa;
        Date laDate;
        double nihed;
        Scanner clavier;

        clavier = new Scanner(System.in);

        //Lire la date :
        System.out.println("Donner le jours");
        jj = clavier.nextInt();

        System.out.println("Donner le mois");
        mm = clavier.nextInt();

        System.out.println("Donne l'annee");
        aa = clavier.nextInt();

        System.out.println("Donner latitude");
        double g_ltitu = clavier.nextDouble();

        System.out.println("Donner longitude");
        double l_lngt = clavier.nextDouble();

        System.out.println("Donner la declinaison");
        double s_dcl = clavier.nextDouble();

        System.out.println("Donner l'hauteur");
        double hight = clavier.nextDouble();

        //Crée l'objet Date JJ/MM/AA
        laDate = new Date(jj,mm,aa);

        //Calculer l'equation du temps
        double et =  (0.128*Math.sin(0.9856*(laDate.getNbJours()-2))+0.164*Math.sin(2*0.9856*(laDate.getNbJours()+10)));

        //Calculer w
        double w = Math.acos((Math.sin(hight)-Math.sin(s_dcl)*Math.sin(g_ltitu))/(Math.cos(g_ltitu)*Math.cos(s_dcl)));

        //Calculer TSV
        double tsv = 12 - (w / 15);

        //Calculer TSM
        double tsm = et + tsv;

        //Calculer TL
        double tl = tsm + (l_lngt/15) + 1;

    }
}
