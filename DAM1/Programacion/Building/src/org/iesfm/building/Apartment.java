package org.iesfm.building;

import java.util.Arrays;
import java.util.Objects;

public class Apartment {

    private int floor;
    private String door;
    private Owner[] owners;

    public Apartment(int floor, String door, Owner[] owners) {
        this.floor = floor;
        this.door = door;
        this.owners = owners;
    }
    public void info(){
        System.out.println("El piso es " + floor);
        System.out.println("La puerta es " + door);
        for(Owner owner : owners){
            owner.info();
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return floor == apartment.floor &&
                Objects.equals(door, apartment.door) &&
                Arrays.equals(owners, apartment.owners);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(floor, door);
        result = 31 * result + Arrays.hashCode(owners);
        return result;
    }
}
