public class Duck extends Animal implements Flyable, Pettable {

    public void clean(Animal cleanee){
        System.out.println(this.toString()+ " is cleaning " + cleanee);
    }
    public void sound(){
        System.out.println("kaboom");
    }

    public void flying(){
        System.out.println("I can fly");
    }
    public void glide(){
        System.out.println("I am ron");
    }
    public void land(){
        System.out.println("I am land");
    }

    public void pet(){
        System.out.println("I am pet");
    }

    public void feed(){
        System.out.println("I am feed");
    }
}
