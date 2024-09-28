public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages=4;
    int animalCount=0;
    public Zoo(String name,String city)
    {
        this.animals=new Animal[25];

        this.name=name;
        this.city=city;

    }
    //methode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        //verifier maximmum dans le zoo
        if(animalCount>=nbrCages)
        {
            System.out.println("Impossible d ajouter l animal:"+animal.name+" Le zoo est plein ");
            return false;
        }

        //ajouter un animal une seul fois
        for(int j=0 ;j<animalCount; j++)
        {
            if(animals[j].name.equals(animal.name))
            {
              System.out.println("L'animal: "+ animal.name +" est deja dans le zoo ");
                return false;
            }

        }
        //ajouter un animal
        animals[animalCount]=animal;
        animalCount++;
        return true;
    }


    public String toString()
    {
        return "Zoo Name: "+name+" ,City: "+city+" ,Nombre de Cage: "+nbrCages;
    }

   public int searchAnimal(Animal animal)
   {

       for(int i=0;i<animalCount;i++)
       {
           if(animals[i].name==animal.name)
           {
               return i;
           }
       }
       return -1;
   }
   public void afficher()
   {
       for(int i=0;i<animalCount;i++)
       {
           System.out.println(animals[i]);
       }
   }

   public  boolean removeAnimal(Animal animal)
   {
       int index=searchAnimal(animal);
       //si l animal n existe pas
       if(index==-1)
       {
           System.out.println("Animal: "+animal.name+" n existe pas");
           return false;
       }
       //supprimer  l animal
       for(int i=index;i<animalCount-1;i++)
       {
           animals[i]=animals[i+1];

       }
       animals[animalCount-1]=null;
       //reduire compteur
       animalCount--;
       return true;
   }

    public boolean isZooFull()
    {
        return animalCount>=nbrCages;
    }

    public  static Zoo compareZoo(Zoo z1,Zoo z2)
    {
        if(z1.animalCount>z2.animalCount)
        {
            return z1;
        } else if (z2.animalCount >z1.animalCount) {
            return z2;
        }
        else {
            return null;
        }
    }
}
