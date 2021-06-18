package be.intecbrussel.entiteit;

public class Tank extends Hero {

    public Tank(){

    }
    public Tank(String alias){
        this.alias = alias;
    }
    public Tank(String alias, int age){
        this.alias = alias;
        this.age = age;
    }

    @Override
    public String toString() {

        return super.toString();
    }
    @Override
    public void useSuperPower() {
        System.out.println("haha no damage done, stupid enemy");
    }
}
