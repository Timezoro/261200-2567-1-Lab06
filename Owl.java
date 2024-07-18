public class Owl extends Animal implements Pettable,Flyable {
    void sound(){
        System.out.println("hoot hoot");
    }
    public void pet(){
        System.out.println("I can pet");
    }
    public void feed(){
        System.out.println("I can feed");
    }
    public void glide(){
        System.out.println("I am gliding");
    }
    public void land(){
        System.out.println("I am landing");
    }
    public void flying(){
        System.out.println("I am flying");
    }
}
