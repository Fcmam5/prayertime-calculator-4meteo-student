//
// Created by fcmam5 on 1/23/16.
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//Return days
int days(int jj,int mm,int annee){
    int jours=jj;

    switch (mm){
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



main()
{
    int jj;
    int mm;
    int aa;
    printf("Donner le jours");
    scanf("%d",&jj);

    printf("Donner le mois");
    scanf("%d",&mm);

    printf("Donne l'annee");
    scanf("%d",&aa);

    printf("Donner latitude");
    float g_ltitu;
    scanf("%f",&g_ltitu);

    printf("Donner longitude");
    float l_lngt;
    scanf("%f",&l_lngt);

    printf("Donner la declinaison");
    float s_dcl;
    scanf("%f",&s_dcl);

    printf("Donner l'hauteur");
    float hight;
    scanf("%f",&hight);

    //how many days
    int jours = days(jj,mm,aa);

    //Calculer l'equation du temps
    float et = (0.128*sin(0.9856*(jours-2))+0.164*sin(2*0.9856*(jours+10)));

    //Calculer w
    float w = acos((sin(hight)-sin(s_dcl)*sin(g_ltitu))/(cos(g_ltitu)*cos(s_dcl)));
    //Calculer TSV
    float tsv = 12 - (w / 15);

    //Calculer TSM
    float tsm = et + tsv;
    //Calculer TL
    float tl = tsm + (l_lngt/15) + 1;

//system("pause");
}
