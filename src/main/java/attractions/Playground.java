package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public int minAge(int data) {
        return minAge(data);
    }
    public boolean isAllowedTo(ISecurity) {
        while (minAge(15) < 15);
        return false; // can't work out how to have this function properly
    }
}
