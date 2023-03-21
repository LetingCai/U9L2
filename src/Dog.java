public class Dog extends Animal{
    private boolean hasBeenWalked;
    private boolean bark;
    public Dog(String Name, int Age, boolean Vaccinated){
        super(Name, Age, Vaccinated);
        hasBeenWalked = false;
        bark = false;
    }

    public void walk(){
        System.out.println("Woof!");
        hasBeenWalked = true;
    }

    public void bark(){
        bark = true;
        System.out.println("Bark!");
    }

}
