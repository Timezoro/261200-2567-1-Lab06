public class Main {
    public static void main(String[] args) {
        // Animal Thing = new Animal();
        Duck psyduck = new Duck();
        psyduck.sound();
        Owl butterOwl = new Owl();
        butterOwl.sound();
        Fly flyGuy = new Fly();
        flyGuy.sound();
        flyGuy.fly();
        psyduck.clean(butterOwl);
        psyduck.feed();
        butterOwl.flying();
    }
}
