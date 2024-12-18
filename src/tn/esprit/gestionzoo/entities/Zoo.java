package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=3;
    private int animalCount=0;
     int nbrAquatic=0;
    ///tableau pour les animaux aquatic
     Aquatic [] aquaticAnimal=new Aquatic[10];

    public Zoo(String name,String city)
    {
        this.animals=new Animal[3];

        this.name=name;
        this.city=city;
    }


    public void displayNumberOfAquaticByType()
    {
        int nbrDolphin=0;
        int nbrPenguin=0;
        for(int i=0;i<nbrAquatic;i++)
        {
        if(aquaticAnimal[i] instanceof Dolphin)
        {
            nbrDolphin++;
        } else if (aquaticAnimal[i] instanceof Penguin) {
            nbrPenguin++;

        }
        }
        System.out.println("Nombre de dolphin: "+nbrDolphin);
        System.out.println("Nombre de penguin: "+nbrPenguin);
    }
    public void addAquaticAnimal(Aquatic aquatic)
    {
        if(nbrAquatic<10)
        {
            aquaticAnimal[nbrAquatic]=aquatic;
            nbrAquatic++;
            System.out.println("l'Animal: "+aquatic.getNameA()+" est ajoutée avec succées.");
        }
        else
        {
            System.out.println("Impossible d ajouter l animal.");
        }
    }

    public int getNbrAquatic()
    {
        return nbrAquatic;
    }
    //getters et settes
     public  int getAnimalCount(){
        return animalCount;
     }
    public Aquatic[] getAquaticAnimal() {
        return aquaticAnimal;
    }

    public  float maxPenguinSwimmingDepth()
    {
         float maxDepth=0.f;
         for(int i=0;i<nbrAquatic;i++)
         {
             if(aquaticAnimal[i] instanceof Penguin)
             {
                 Penguin penguin=(Penguin) aquaticAnimal[i];
                 if(penguin.swimmingDepth>maxDepth)
                 {
                     maxDepth=penguin.swimmingDepth;
                 }
             }
         }
         return maxDepth;
    }
    public boolean setName(String name) {
        if(name!=null && !name.trim().isEmpty() )
        {
            this.name=name;
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    //methode pour ajouter un animal au zoo
    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        // Vérifier si l'animal a un âge valide
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif!!!!!!");
        }
        //verifier maximmum dans le zoo
       if(isZooFull())
        {
            throw new ZooFullException ("Impossible d ajouter l animal Le zoo est plein!!!!!!!! ");

        }

        //ajouter un animal une seul fois
        for(int j=0 ;j<animalCount; j++)
        {
            if(animals[j].getNameA().equals(animal.getNameA()))
            {
              System.out.println("L'animal: "+ animal.getNameA() +" est deja dans le zoo ");
                return;
            }

        }
        //ajouter un animal
        animals[animalCount]=animal;
        animalCount++;
        System.out.println("L'animal: "+animal.getNameA()+" a été ajouté avec succées.");

    }


    public String toString()
    {
        return "Zoo Name: "+name+" ,City: "+city+" ,Nombre de Cage: "+nbrCages;
    }

   public int searchAnimal(Animal animal)
   {

       for(int i=0;i<animalCount;i++)
       {
           if(animals[i].getNameA()==animal.getNameA())
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
       for(int j=0;j<nbrAquatic;j++)
       {
           System.out.println(aquaticAnimal[j]);
       }
   }

   public  boolean removeAnimal(Animal animal)
   {
       int index=searchAnimal(animal);
       //si l animal n existe pas
       if(index==-1)
       {
           System.out.println("Animal: "+animal.getNameA()+" n existe pas");
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
