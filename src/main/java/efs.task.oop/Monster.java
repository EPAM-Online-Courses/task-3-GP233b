package efs.task.oop;

public abstract class Monster implements Fighter {
    protected int health;
    protected int damage;

    public Monster(int health , int damage){
        this.health = health;
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(this.damage);
    }

    @Override
    public void takeHit(int damage) {
        if (this.health - damage >= 0){
            this.health -= damage;
            Monsters.monstersHealth -= damage;
        }
        else {
            Monsters.monstersHealth -= this.health;
            this.health = 0;
        }

    }
}
