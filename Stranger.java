package lab3;

public class Stranger extends Person{
    Stranger(){
        super();
    }

    @Override
    public void detailmove() {
        System.out.print("Stranger Leaves\n");
    }
}
