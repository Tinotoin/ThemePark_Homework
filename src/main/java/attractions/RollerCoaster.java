package attractions;

import behaviours.ISecurity;

public class RollerCoaster  extends Attraction {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);

    }


    public String isAllowedTo(ISecurity) {
        while (minHeight < 1.45);
        return "Sorry, too short to ride"; // can't work out how to have this function properly
    }
}
