package chapter10.foxes;

import java.util.List;

public abstract class Animal {

    // The Animal's age.
    private int age;
    // Whether the Animal is alive or not.
    private boolean alive;
    // The Animal's position.
    private Location location;
    // The field occupied.
    private Field field;

    public Animal(Field field, Location location){
        age = 0;
        alive = true;
        this.field = field;
        setLocation(location);

    }

    /**
     * Check whether the rabbit is alive or not.
     * @return true if the rabbit is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }

    /**
     * Indicate that the rabbit is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }

    /**
     * Return the rabbit's location.
     * @return The rabbit's location.
     */
    public Location getLocation()
    {
        return location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Increase the age. This could result in the fox's death.
     */
    public void incrementAge()
    {
        age++;
        if(age > getMaxAge()) {
            setDead();
        }
    }

    /**
     * Place the rabbit at the new location in the given field.
     * @param newLocation The rabbit's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    public Field getField() {
        return field;
    }

    /**
     * A rabbit can breed if it has reached the breeding age.
     * @return true if the rabbit can breed, false otherwise.
     */
    public boolean canBreed() {
        return age >= getBreedingAge();
    }

    /**
    *Return the breeding age for this animal
     */
    abstract protected int getBreedingAge();

    abstract protected int breed();


    abstract protected int getMaxAge();

     abstract public void act(List<Animal> newAnimal);
}
