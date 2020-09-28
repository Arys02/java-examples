public abstract class Animal {
    public int nb_legs;
    public String name;

    public Animal(int nb_legs, String name){
        this.nb_legs = nb_legs;
        this.name = name;
    }

    public abstract void makeNoise();

    public String getName() {
        return name;
    }
}

interface Mammal {
    public void growFur();
}

class Cat extends Animal implements Mammal{
    public Cat(String name) {
        super(4, name);
    }

    public void makeNoise() {
        // Miaou Miaou
    }
    public void growFur() { }
}

class Dog extends  Animal implements Mammal{
    public Dog(String name) {
        super(4, name);
    }
    public void makeNoise() {
        // Ouaf Ouaf
    }
    public void growFur() { }
}

class Snake extends Animal {
    public Snake (String name) {
        super(0, name);
    }
    public void makeNoise() {
        // sssssssSSSSssssSSSsssSSS

    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(2, name);
    }

    public void makeNoise() {
        //coin coin

    }
}
