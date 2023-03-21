public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean purr;

    public Cat(String Name, int Age, boolean Vaccinated){
        super(Name, Age, Vaccinated);
        hasPlayedWith = false;
        purr = false;
    }

    public void play(){
        System.out.println("Meow!");
        hasPlayedWith = true;
    }

    public void purr(){
        System.out.println("purrrrrr");
        purr = true;
    }

}
