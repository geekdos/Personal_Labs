package Exercice2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by root on 10/11/16.
 */
public class Bibliotheque {

    ArrayList<Livre> livres = new ArrayList<Livre>();
    ArrayList<Dictionnaire> dictionnaires = new ArrayList<Dictionnaire>();


    public Bibliotheque(ArrayList<Livre> livres, ArrayList<Dictionnaire> dictionnaires) {
        this.livres = livres;
        this.dictionnaires = dictionnaires;
    }

    public static void main(String[] args) {
        this.menu();
    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        int choixMenu;
        do {
            choixMenu = 0;
            System.out.println("***********************************");
            System.out.println("******Gestion du Bibliothéque******");
            System.out.println("***********************************");
            System.out.println("--1-- Gestion des livres");
            System.out.println("--2-- Gestion des dictionnaires");
            System.out.println("--3-- Quitter");
            System.out.println("***********************************");
            do {
                choixMenu = input.nextInt();
            }while (choixMenu != 1 && choixMenu != 2 && choixMenu != 3);

            switch (choixMenu){
                case 1 : //Gestion des livres
                    int choixLivre;
                    do {
                        choixLivre = 0;
                        System.out.println("************************************");
                        System.out.println("*********Gestion des livres*********");
                        System.out.println("************************************");
                        System.out.println("--1-- Ajouter un livre");
                        System.out.println("--2-- Calculer nombre des livres");
                        System.out.println("--3-- Afficher la liste des livres");
                        System.out.println("--4-- Quitter");
                        System.out.println("************************************");
                        do {
                            choixLivre = input.nextInt();
                        }while (choixLivre != 1 && choixLivre != 2 && choixLivre != 3 && choixLivre != 4);

                        switch (choixLivre){
                            case 1: //Ajouter un livre
                                System.out.print("\t\t  Réference : ");
                                Scanner reference = new Scanner(System.in);
                                int ref  = reference.nextInt();
                                //------------------------------------
                                System.out.print("\t\t  Titre : ");
                                Scanner title = new Scanner(System.in);
                                String titre  = title.nextLine();
                                //--------------------------------------
                                System.out.print("\t\t  Auteur : ");
                                Scanner Auteur = new Scanner(System.in);
                                String auteur  = Auteur.nextLine();
                                //--------------------------------------
                                System.out.print("\t\t  Nombre des pages : ");
                                Scanner nbPages = new Scanner(System.in);
                                int nbrPages  = nbPages.nextInt();

                                Livre livre = new Livre(ref,titre,auteur,nbrPages);
                                livres.add(livre);
                                System.out.println("Le livre "+ titre+" est bien ajouter");
                                break;
                        }
                    }while (choixLivre == 1 || choixLivre == 2 || choixLivre == 3 || choixLivre == 4);
                    break;
                case 2 : //Gestion des dictionnaires
                    System.out.println("************************************");
                    System.out.println("*********Gestion des dictionnaires*********");
                    System.out.println("************************************");
                    System.out.println("--1-- Ajouter un dictionnaire");
                    System.out.println("--2-- Calculer nombre des dictionnaires");
                    System.out.println("--3-- Afficher la liste des dictionnaires");
                    System.out.println("--4-- Quitter");
                    System.out.println("************************************");
                    break;

                case 3 : //Quitter
                    System.exit(1);
                    break;
            }
        }while (choixMenu == 1 || choixMenu == 2 || choixMenu == 3);
    }
}
