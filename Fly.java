public class Fly extends Animal implements Flyable {
    void sound(){
        System.out.println("fuzz");
    }
    void fly(){
        System.out.println("I can fly");
    }
    public void glide(){
        System.out.println("I am gliding");
    }
    public void flying(){
        System.out.println("I am flying");
    }
    public void land(){
        System.out.println("I am landing");
    }
    
}
