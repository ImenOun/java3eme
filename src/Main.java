public class Main {
public static void main(String[] args)
    {
        Zoo myZoo=new Zoo("Belvidere","Tunis");
        Zoo myZoo2=new Zoo("Friguia","Nabeul");

        Animal lion= new Animal("lion","Lion",5,true);
        Animal elephant= new Animal("elephant","elephant",10,true);
        Animal  giraffe=  new Animal("giraffe","giraffe",6,true);
        //animal identique au premier
        Animal lion2= new Animal("lion","Lion",5,true);
        Animal  giraffe2=  new Animal("giraffe2","giraffe2",6,true);
        Animal tigger= new Animal("tigger","tiger",5,true);

        //ajouter l animal au zoo
        System.out.println("============= Ajout dans le myZoo ================");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(giraffe2));
        System.out.println(myZoo.addAnimal(lion2));
        System.out.println("============= Ajout dans le myZoo2 ================");
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
            //resultat de recherche d'un autre animal lion2  identique au premier lion affiche l index de premier animal

         //Rcherche d un animal n'est pas ajouter au zoo (giraffe)
         System.out.println("Resultat de recherche giraffe: "+myZoo.searchAnimal(giraffe));

        System.out.println("============= Supprimer ================");
         //Supprimer animal existe dans le zoo(elephant)
         System.out.println("Elephant du zoo1 supprimer: "+myZoo.removeAnimal(elephant));
         //supprimer animal n existe pas dans le zoo(giraffe)
        System.out.println("Giraffe de zoo1 supprimé: "+myZoo.removeAnimal(giraffe));
        System.out.println("================ IsZooFull myZoo ================");
        System.out.println("Le Zoo1 est plein: "+myZoo.isZooFull());

        System.out.println("============= Comparer les Zoos ================");
        Zoo biggerZoo= Zoo.compareZoo(myZoo,myZoo2);
        if(biggerZoo!=null)
        {
            System.out.println("Le zoo avec le plus grand nombre d animaux: "+biggerZoo.name);
        }
        else {
            System.out.println("les deux zoo ont le même nombre d animaux");
        }
    }
}
