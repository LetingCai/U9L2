public class Runner {
    public static void main (String[] args){
        System.out.println("_________Animal Class_________");
        Animal Isaac = new Animal("Isaac", 16, true);
        Isaac.feed();
        Isaac.adopt();
        Isaac.brush();

        System.out.println("________Dog Class________");
        Dog Alexandre = new Dog("Alexandre", 16, true);
        Alexandre.bark();
        Alexandre.walk();
        Alexandre.adopt();
        Alexandre.brush();
        Alexandre.feed();

        System.out.println("_________Cat Class_________");
        Cat Edmond = new Cat("Edmond", 16, true);
        Edmond.play();
        Edmond.purr();
        Edmond.adopt();
        Edmond.brush();
        Edmond.feed();
    }
}
