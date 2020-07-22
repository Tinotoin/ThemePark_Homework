package stalls;

import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int minAge(int data) {
        return (data);
    }

    public boolean isAllowedTo() {
        while (minAge(15) < 15);
            return false;
    }

}