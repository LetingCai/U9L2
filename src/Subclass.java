public class Subclass extends Superclass{
    private String SubclassString;

    public Subclass(String string, boolean Boolean, int integer, double Double, String SubclassString){
        super(string, Boolean, integer, Double);
        this.SubclassString = SubclassString;
    }

    public void subclassMethod(){}
}
