package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10,70) {};



    static final Monster blacksmith  = new Monster(100,25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage() + 5 );
        }

        @Override
        public void takeHit(int damage) {
            super.takeHit(damage+5);
        }
    };



    static int  monstersHealth = andariel.getHealth() + blacksmith.getHealth();



}
