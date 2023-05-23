package efs.task.oop;

public class Villager implements Fighter{

    protected String name;
    protected int age;
    protected int health;
    //protected int damage;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
        //this.damage = (int) ((100 - age * 0.5) / 10);
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old.");

    }

    @Override
    public void attack(Fighter victim) {
        int damage = (int) ((100 - age * 0.5) / 10);

        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        if (this.health - damage >= 0){
            this.health -= damage;
        }
        else {
            this.health = 0;
        }

    }

    public int getHealth() {
        return health;
    }
}

