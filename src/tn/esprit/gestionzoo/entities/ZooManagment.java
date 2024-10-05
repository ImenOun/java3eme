package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class ZooManagment {
    int nbrCages=20;
    String zooName="My Zoo";
    public static void main(String[] args) {

        ZooManagment zoo = new ZooManagment();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        Scanner scanner = new Scanner(System.in);
        ZooManagment zm1 = new ZooManagment();
        System.out.println("donner le nom de zoo: ");
        zm1.zooName=scanner.nextLine();
        System.out.println("Donner le nombre de cages de zoo: ");
        zm1.nbrCages = scanner.nextInt();
        System.out.println(zm1.zooName+" comporte "+zm1.nbrCages+ " cages");

    }
}
