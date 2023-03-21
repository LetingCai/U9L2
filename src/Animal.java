public class Animal {
    private String Name;
    private int Age;
    private boolean Vaccinated;

    private boolean Feed;
    public Animal(String Name, int Age, boolean Vaccinated){
        this.Age = Age;
        this.Name = Name;
        this.Vaccinated = Vaccinated;
        Feed = false;
    }

    public void adopt(){
        System.out.println("I have been adopted!");
    }

    public void feed(){
        System.out.println("I've been fed!");
        Feed = true;
    }

    public void brush(){
        System.out.println("I've been brushed!");
    }
}
