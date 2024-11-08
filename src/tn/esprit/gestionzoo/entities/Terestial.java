package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;

public non-sealed class Terestial extends Animal implements Omnivore <Food> {
    int nbrLegs;
    public Terestial(){}
    public Terestial(String family,String name,int age,boolean isMammal,int nbrLegs)
    {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString()
    {
        return  super.toString()+" ,Nbr Legs: "+nbrLegs;

    }


    @Override
    public void eatMeat(Food meat) {
        if (meat== Food.MEAT || meat== Food.BOTH) {
            System.out.println("the Teristial: "+getNameA() + " is eating meat.");
        } else {
            System.out.println("the Teristial: "+getNameA() + " cannot eat meat.");
        }
    }
    @Override
    public void eatPlant(Food plant) {
        if (plant== Food.MEAT || plant== Food.BOTH) {
            System.out.println("the Teristial: "+getNameA() + " is eating plant.");
        } else {
            System.out.println("the Teristial: "+getNameA() + " cannot eat plant.");
        }
    }

    @Override
    public void eatMeatAndPlant(Food food) {
        if (food == Food.BOTH) {
            System.out.println("the Teristial: "+getNameA() + " is eating both plants and meat.");
        } else {
            System.out.println("the Teristial: "+getNameA() + " cannot eat both types of food.");
        }
    }
}
