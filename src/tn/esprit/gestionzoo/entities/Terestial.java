package tn.esprit.gestionzoo.entities;

public non-sealed class Terestial extends Animal {
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

}
