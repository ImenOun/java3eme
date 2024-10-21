package tn.esprit.gestionzoo.entities;

public abstract non-sealed class Aquatic extends Animal {
    String habitat;
    public Aquatic(){}
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat)
    {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Habitat: "+habitat;
    }
    public abstract  void swim();
    @Override
    public boolean equals(Object obj)
    {

        if(this == obj)
        {
            return true;
        }
        //verification  que l objet comparé est de type aquatic
        if(obj ==null|| getClass() != obj.getClass())
        {
            return false;
        }
        //cast de  objet a comparer en aquatic
        Aquatic other =(Aquatic) obj;
        //comparaison des attributs name,age,et habitat
        return this.getNameA().equals(other.getNameA()) && this.getAge()==other.getAge() && this.habitat.equals(other.habitat);
    }
}
