package tn.esprit.gestionzoo.interfaces;
import tn.esprit.gestionzoo.entities.Food;
public interface Carnivore<T> {
    void eatMeat(T meat);
}
