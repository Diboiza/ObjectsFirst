package chapter10.foxes;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PopulationGenerator {

    // Constants representing configuration information for the simulation.
    // The default width for the grid.
    private static final int DEFAULT_WIDTH = 120;
    // The default depth of the grid.
    private static final int DEFAULT_DEPTH = 80;
    // The current state of the field.
    private Field field; // The probability that a fox will be created in any given grid position.
    private static final double FOX_CREATION_PROBABILITY = 0.02;
    // The probability that a rabbit will be created in any given position.
    private static final double RABBIT_CREATION_PROBABILITY = 0.08;
    // Lists of animals in the field.
    private List<Animal> animals;
    // The current step of the simulation.
    private int step;

    // A graphical view of the simulation.
    private SimulatorView view;

    public PopulationGenerator(){
        this(DEFAULT_DEPTH, DEFAULT_WIDTH);
    }

    public PopulationGenerator(int depth, int width) {
        if(width <= 0 || depth <= 0) {
            System.out.println("The dimensions must be >= zero.");
            System.out.println("Using default values.");
            depth = DEFAULT_DEPTH;
            width = DEFAULT_WIDTH;
        }

        animals = new ArrayList<>();
        field = new Field(depth, width);

        // Create a view of the state of each location in the field.
        view = new SimulatorView(depth, width);
        view.setColor(Rabbit.class, Color.ORANGE);
        view.setColor(Fox.class, Color.BLUE);

        // Setup a valid starting point.
        reset();
    }


    public Field getField() {
        return field;
    }

    public SimulatorView getView() {
        return view;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public int getStep() {
        return step;
    }

    /**
     * Randomly populate the field with foxes and rabbits.
     */
    public void populate()
    {
        Random rand = Randomizer.getRandom();
        field.clear();
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                if(rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, field, location);
                    animals.add(fox);
                }
                else if(rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, field, location);
                    animals.add(rabbit);
                }
                // else leave the location empty.
            }
        }
    }

    /**
     * Reset the simulation to a starting position.
     */
    public void reset()
    {
        step = 0;
        animals.clear();
        populate();

        // Show the starting state in the view.
        getView().showStatus(step, getField());
    }


}
