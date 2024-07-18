public class Pig extends Animal implements Pettable {
    void sound(){
        System.out.println("oink oink");
    }
    void fly(){
        System.out.println("I can't fly");
    }
    public void pet(){
        System.out.println("I can pet");
    }
    public void feed(){
        System.out.println("I can feed");
    }
}
