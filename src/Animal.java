public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;


    }
  public String toString()
  {
      return "Animal Name: "+name+" ,Family: "+family+" ,Age: "+age+" ,IsMammal: "+isMammal;
  }
}
