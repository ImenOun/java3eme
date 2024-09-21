public class Main {
public static void main(String[] args)
    {
        Animal lion= new Animal("lion","Lion",5,true);
        Zoo myZoo=new Zoo("belvidere","Tunis",10);
        //ajouter le lion ai zoo
        //myZoo.addAnimal(lion,0);
        //afficher les infos
      //  System.out.println("first animal: "+myZoo.animals[0].name+" Family: "+myZoo.animals[0].family+" Age: "+myZoo.animals[0].age+" IsMammal: "+myZoo.animals[0].isMammal);
        myZoo.displayZoo(); //affichage normal
        //System.out.println(myZoo); //affiche l'emplacement dans la  memoire
        System.out.println(myZoo.toString());
        System.out.println(lion);
    }
}
