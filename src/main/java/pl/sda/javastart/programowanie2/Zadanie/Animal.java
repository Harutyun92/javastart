package pl.sda.javastart.programowanie2.Zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String name;
    private Person owner;
    private List<Food> favoriteFoods=new ArrayList<>();
    private Food food;

    public Animal(int i) {
        this.name = "animal " + i;  // dajemy drugi konsturktor ktory jest potrzebny do streamow
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, List<Food> favoriteFoods) {
        this.name = name;
        this.favoriteFoods = favoriteFoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Food> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<Food> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public void feedAnimal(Food food) {  // piszemy metode dla  zwierzaka
        this.food = food;
    }
    public boolean isHungry(){  // metoda na to czy zwierzak sie najadal czy nie
        if(food==null){
            return true;
        }else{
            return false;
        }
    }
public boolean isMyFavFood(Food food){
        return favoriteFoods.contains(food);
       // return favoriteFoods.stream().anyMatch(food::equals);
}
public String eat(List foodList){
        String hungry ="";
        if(foodList==null) {
            hungry = "głodny, czlowiek nie ma jedzenia ";
        }else{
            for (Object o : foodList) {
                for(Food food : favoriteFoods){
                    if(o.equals(food)){
                        hungry="najedzony";
                        break;
                    }else{
                        hungry="dalej głodny";
                    }
                }
            }
        }
        return hungry;
}
//metoda still hungry
    //public String stillHungry()
}
