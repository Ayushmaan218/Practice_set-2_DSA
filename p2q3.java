/*Create a superclass called Animal with the method makeSound(). Create a subclass called
Dog that overrides makeSound() to print "Woof!". Create another subclass called Cat that
overrides makeSound() to print "Meow!". Write a main method that creates an instance of each
subclass and calls their makeSound() methods. */

class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}
class dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }
}
class cat extends Animal{
    public void makeSound(){
        System.out.println("Meow!");
    }
}

public class p2q3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        dog d = new dog();
        cat c = new cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
