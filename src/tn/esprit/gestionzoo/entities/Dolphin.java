package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;
    public Dolphin(){}
    public Dolphin(String family,String name,int age,boolean isMammal,String habitat,float swimmingSpeed)
    {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public String toString()
    {
        return super.toString()+" ,SwimmingSpeed: "+swimmingSpeed;
    }

    @Override
    public void swim()
    {
        System.out.println("This Dolphin is swimming.");
    }
}
