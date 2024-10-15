package tn.esprit.gestionzoo.entities;
public sealed class  Animal permits Aquatic,Terestial {

    private  String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(){}
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;


    }
   @Override
    public String toString()
  {
      return "Animal Name: "+name+" ,Family: "+family+" ,Age: "+age+" ,IsMammal: "+isMammal;
  }
    public String getNameA(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean setAge(int age)
    {
        if(age>=0){
            this.age=age;
            return true;
        }
        return false; // age negatif
    }

    public void setNameA(String name) {
        this.name = name;
    }
}
