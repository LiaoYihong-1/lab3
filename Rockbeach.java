package lab3;

public class Rockbeach extends Place{
    Rockbeach(String name){
        super(name);
    }

    @Override
    public boolean allcome() {
        if (numbermember == 3) {
            return true;
        } else {
            return false;
        }
    }
}
