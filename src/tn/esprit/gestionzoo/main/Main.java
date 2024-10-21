package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
public static void main(String[] args)
    {
        Zoo myZoo=new Zoo("Belvidere","Tunis");
        Zoo myZoo2=new Zoo("Friguia","Nabeul");
        //Creer un zoo avec un nom vide
        Zoo Zoo3=new Zoo("","Tunis");
        if(Zoo3.getName()==null || Zoo3.getName().isEmpty()){
            System.out.println("Erreur Le nom du Zoo ne peut pas etre vide");
        }

        Animal lion= new Animal("lion","Lion",5,true);
        Animal elephant= new Animal("elephant","elephant",10,true);
        Animal giraffe=  new Animal("giraffe","giraffe",6,true);
        //animal identique au premier
        Animal lion2= new Animal("lion","Lion",5,true);
        Animal giraffe2=  new Animal("giraffe2","giraffe2",6,true);
        Animal tigger= new Animal("tigger","tiger",5,true);
        /// creer animal avec age negatif
        Animal bhim=new Animal("bhayem","Bhim",-2,false);
        if(bhim.getAge()<0){
            System.out.println("Erreur:l age de l animal est negatif!!!");
        }
        /////ajouter l animal au zoo
        System.out.println("============= Ajout dans  myZoo ================");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));

        System.out.println(myZoo.addAnimal(giraffe2));
        System.out.println(myZoo.addAnimal(lion2));
        System.out.println("============= Ajout dans  myZoo2 ================");
        System.out.println(myZoo2.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(elephant));
        System.out.println(myZoo2.addAnimal(giraffe));
        System.out.println(myZoo2.addAnimal(tigger));
        //afficher les animaux
        System.out.println("============= Affichage myZoo ================");
        myZoo.afficher();
        System.out.println("============= Affichage myZoo2 ================");
        myZoo2.afficher();
        //rechercher un animal par son nom
        System.out.println("================ Recherche dans myZoo ================");
         System.out.println("Resultat de recherche de lion:"+myZoo.searchAnimal(lion));
         System.out.println("Resultat de recherche de elephant : "+myZoo.searchAnimal(elephant));
         System.out.println("Resultat de recherche de lion2: "+myZoo.searchAnimal(lion2));

         //Rcherche d un animal n'est pas ajouter au zoo (giraffe)
         System.out.println("Resultat de recherche giraffe: "+myZoo.searchAnimal(giraffe));

        System.out.println("============= Supprimer dans myZoo ================");
         //Supprimer animal existe dans le zoo(elephant)
         System.out.println("Elephant du zoo1 supprimer: "+myZoo.removeAnimal(elephant));

         //supprimer animal n existe pas dans le zoo(giraffe)
        System.out.println("Giraffe de zoo1 supprimé: "+myZoo.removeAnimal(giraffe));
        System.out.println("================ zoo1 aprés suppression ================");
        myZoo.afficher();

        System.out.println("================ IsZooFull myZoo ================");
        System.out.println("Le Zoo1 est plein: "+myZoo.isZooFull());
        System.out.println("Le Zoo2 est plein: "+myZoo2.isZooFull());
        System.out.println("============= Comparer les Zoos ================");
        Zoo biggerZoo= Zoo.compareZoo(myZoo,myZoo2);
        if(biggerZoo!=null)
        {
            System.out.println("Le zoo avec le plus grand nombre d animaux: "+biggerZoo.getName());
        }
        else {
            System.out.println("les deux zoo ont le même nombre d animaux");
        }
        System.out.println("==============Créer Instance(aquatic,teristial)==================");
       // Aquatic aquatic= new Aquatic("hout","hota",5,true,"fel bhar");
        Terestial terestial= new Terestial("sala7ef ninga","soula7fet",10,false,4);
        Dolphin dolphin=new Dolphin("dalafin","delphina",9,true,"mohiit",10.5f);
        Penguin penguin=new Penguin("batri9","batri9",8,false,"thelj",2.5f);
        Penguin penguin2=new Penguin("batri9 e5er","batri9aa",7,false,"ba7thee 5oha",50.0f);
        //System.out.println(aquatic);
        System.out.println(terestial);
        System.out.println(dolphin);
        System.out.println(penguin);

        System.out.println("=======================Appel de la fonction swim()=============================");
       // aquatic.swim();
        dolphin.swim();
        penguin.swim();
        System.out.println("======================Ajout d un animal aquatic au zoo======================");
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);
        myZoo.addAquaticAnimal(penguin2);
        System.out.println("============================================");

        myZoo.afficher();
        System.out.println("============================================");
        myZoo2.afficher();
        System.out.println("=================Appel de la fonction swim dans le tableau aquaticAnimal de myZoo====================");
        for(int i=0;i< myZoo.getNbrAquatic();i++)
        {
            myZoo.getAquaticAnimal()[i].swim();
        }
        System.out.println("=====================Afficher max depth penguin==========================");
        System.out.println("Le profondeur maximal des penguins est: "+myZoo.maxPenguinSwimmingDepth()+" Métres");
        System.out.println("=====================Display number of aquatic animal by type de zoo1==========================");
        myZoo.displayNumberOfAquaticByType();
        System.out.println("=====================Display number of aquatic animal by type de zoo2==========================");
        myZoo2.displayNumberOfAquaticByType();
        System.out.println("=====================equals pour 2 animaux aquatique identique==========================");
        //meme donner que l autre Dolphin (dolphin et dolphin2 sont identique)
        Dolphin dolphin2=new Dolphin("dalafin","delphina",9,true,"mohiit",10.5f);
        //penguin et penguin2 sont indentique
        Penguin penguin3=new Penguin("batri9","batri9",8,false,"thelj",2.5f);
        System.out.println("dolphin et dolphin2 sont ils identiques?: "+dolphin.equals(dolphin2));
        System.out.println("penguin et penguin2 sont ils identiques?: "+penguin.equals(penguin3));
        System.out.println("penguin2 et penguin3 sont ils identiques?: "+penguin3.equals(penguin2));
    }
}
