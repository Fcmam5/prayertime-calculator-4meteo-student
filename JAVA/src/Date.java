/**
 * Created by fcmam5 on 1/22/16.
 */
public class Date {
    private int mois;
    private int jours;
    private int annee;

    public Date(int jours, int mois,int annee) {
        this.mois = mois;
        this.jours = jours;
        this.annee = annee;
    }


    public int getNbJours() {
        switch (mois){
            case 2:
                return 31+jours;

            case 3:
                if (annee%4==0) return 31+29+jours;
                else return 31+28+jours;

            case 4:
                if (annee%4==0) return 31+29+31+jours;
                else return 31+28+31+jours;
            case 5:
                if (annee%4==0) return 31+29+31+30+jours;
                else return 31+28+31+30+jours;

            case 6:
                if (annee%4==0) return 31+29+31+30+31+jours;
                else return 31+28+31+30+31+jours;

            case 7:
                if (annee%4==0) return 31+29+31+30+31+30+jours;
                else return 31+28+31+30+31+30+jours;

            case 8:
                if (annee%4==0) return 31+29+31+30+31+30+31+jours;
                else return 31+28+31+30+31+30+31+jours;

            case 9:
                if (annee%4==0) return 31+29+31+30+31+30+31+31+jours;
                else return 31+28+31+30+31+30+31+31+jours;

            case 10:
                if (annee%4==0) return 31+29+31+30+31+30+31+31+30+jours;
                else return 31+28+31+30+31+30+31+31+30+jours;

            case 11:
                if (annee%4==0) return 31+29+31+30+31+30+31+31+30+31+jours;
                else return 31+28+31+30+31+30+31+31+30+31+jours;

            case 12:
                if (annee%4==0) return 31+29+31+30+31+30+31+31+30+31+30+jours;
                else return 31+28+31+30+31+30+31+31+30+31+30+jours;
        }
        return jours;
    }
}