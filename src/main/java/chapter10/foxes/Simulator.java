package chapter10.foxes;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;

/**
 * A simple predator-prey simulator, based on a rectangular field containing 
 * rabbits and foxes.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Simulator extends PopulationGenerator
{

    // The current step of the simulation.
    private int step;

    
    /**
     * Construct a simulation field with default size.
     */
    public Simulator()
    {
       super();
    }
    
    /**
     * Create a simulation field with the given size.
     * @param depth Depth of the field. Must be greater than zero.
     * @param width Width of the field. Must be greater than zero.
     */
    public Simulator(int depth, int width)
    {
        super(depth, width);
        reset();
    }
    
    /**
     * Run the simulation from its current state for a reasonably long 
     * period (4000 steps).
     */
    public void runLongSimulation()
    {
        simulate(4000);
    }
    
    /**
     * Run the simulation for the given number of steps.
     * Stop before the given number of steps if it ceases to be viable.
     * @param numSteps The number of steps to run for.
     */
    public void simulate(int numSteps)
    {
        for(int step=1; step <= numSteps && getView().isViable(getField()); step++) {
            simulateOneStep();
            // delay(60);   // uncomment this to run more slowly
        }
    }
    
    /**
     * Run the simulation from its current state for a single step. Iterate
     * over the whole field updating the state of each fox and rabbit.
     */
    public void simulateOneStep()
    {
        step++;

        // Provide space for newborn rabbits.
        List<Actor> newActors = new ArrayList<>();
        // Let all rabbits act.
        for(Iterator<Actor> it = getAnimals().iterator(); it.hasNext(); ) {
            Actor actor = it.next();
            actor.act(newActors);
            //remove dead animals from the simulation
            if(! actor.isAlive()) {
                it.remove();
            }

        }

        // Add the newly born foxes and rabbits to the main lists.
        getAnimals().addAll(newActors);

        getView().showStatus(step, getField());
    }
        

    

    
    /**
     * Pause for a given time.
     * @param millisec  The time to pause for, in milliseconds
     */
    private void delay(int millisec)
    {
        try {
            Thread.sleep(millisec);
        }
        catch (InterruptedException ie) {
            // wake up
        }
    }
}
