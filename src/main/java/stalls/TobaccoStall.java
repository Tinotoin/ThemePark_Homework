package stalls;

import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int minAge(int data) {
        return (data);
    }

    public boolean isAllowedTo(ISecurity) {
        while (minAge(15) < 15);
            return false; // can't work out how to have this function properly
    }

}