public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo(String name,String city,int nbrCages)
    {
        this.animals=new Animal[25];

        this.name=name;
        this.city=city;

        this.nbrCages=nbrCages;
    }
    //methode pour ajouter un animal au zoo
    public void addAnimal(Animal animal,int index)
    {
        if(index >=0 && index<25)
        {
            animals[index]=animal;
        }
        else
        {
            System.out.println("Le zoo ne peut contenir que 25 aimaux");
        }

    }
    public void displayZoo()
    {
        System.out.println("Zoo name: "+name+" City: "+city+" Nbr de cage: "+nbrCages);

    }
    public String toString()
    {
        return "zoo{Name:'"+name+"', City: "+city+"' nbrCages: "+nbrCages+"}";
    }
}
