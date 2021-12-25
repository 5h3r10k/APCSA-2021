package ch4;

public class Teenager {
    
    private int knowledge, popularity, hunger, thirst, fitness, mentalhealth;
    private String name;


    /* CONSTRUCTORS */

    public Teenager(){

        name = "Unnamed Teenager";
        knowledge = 10;
        popularity = 10;
        hunger = 0;
        thirst = 0;
        fitness = 50;
        mentalhealth = 50;

    }

    public Teenager(String str){

        name = str;
        knowledge = 10;
        popularity = 10;
        hunger = 0;
        thirst = 0;
        fitness = 50;
        mentalhealth = 50;

    }


    /* Getter methods */

    public String getName(){
        return name;
    }

    public int getKnowledge(){
        return knowledge;
    }

    public int getPopularity(){
        return popularity;
    }

    public int getHunger(){
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public int getFitness(){
        return fitness;
    }

    public int getMentalHealth(){
        return mentalhealth;
    }


    /* Other methods */

    public void study(){
        knowledge+=10;
        burnEnergy();
    }

    public void hangOut(){
        popularity+=10;
        mentalhealth+=10;
        burnEnergy();
    }

    public void eatIn(){
        hunger-=20;
        thirst+=10;
        fitness+=10;
    }

    public void drinkWater(){
        thirst-=20;
        fitness+=10;
    }

    public void eatOut(){
        hunger-=30;
        fitness-=20;
    }

    public void drinkSoda(){
        fitness-=20;
        mentalhealth+=5;
    }

    public void workOut(){
        fitness+=20;
        burnEnergy();
    }

    public void jog(){
        fitness+=10;
        burnEnergy();
    }

    public void dance(){
        mentalhealth+=10;
        fitness+=5;
    }

    public void listenMusic(){
        mentalhealth+=10;
    }

    private void burnEnergy(){
        hunger+=10;
        thirst+=10;
    }

    public String toString(){
        return 
        "Name: " + name + "\n" +
        "knowledge: " + knowledge + "\n" +
        "popularity: " + popularity + "\n" +
        "hunger: " + hunger + "\n" +
        "thirst: " + thirst + "\n" +
        "fitness: " + fitness + "\n" +
        "mentalhealth: " + mentalhealth;
    }

}
