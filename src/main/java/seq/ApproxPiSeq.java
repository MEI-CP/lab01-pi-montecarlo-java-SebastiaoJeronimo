package seq;

import java.util.concurrent.Callable;

/**
 * Calculation of π Using the Monte Carlo Method
 * Sequential version.
 * You must implement method pi4()
 */
public class ApproxPiSeq implements Callable<Double> {

    /**
     * Number of steps of the simulation
     */
    private final long numberSteps;

    /**
     * Constructor
     * @param numberSteps Number of steps of the simulation
     */
    public ApproxPiSeq(long numberSteps) {
        this.numberSteps = numberSteps;
    }

    /**
     * Calculates the estimated value of pi/4 by running the Monte Carlo simulation for this.numberSteps times.
     * @return The approximate value of pi/4
     */
    protected double pi4() {
        // TODO: implement
        return 0;
    }

    /**
     * Runs the Montecarlo simulation to compute the approximate value of pi
     * @return The approximate value of pi
     */
    public Double call() {
        return pi4() * 4;
    }

    /**
     * Main method
     * Usage: ApproxPiSeq <nSteps>
     * @param args
     */
    public static void main(final String[] args) {
        if (args.length <1 || args.length > 1) {
            System.out.println ("Usage: ApproxPiSeq <nSteps>");
            return;
        }

        long numberSteps = Long.parseLong(args[0]);
        ApproxPiSeq sim = new ApproxPiSeq(numberSteps);
        long startTime = System.nanoTime();
        double pi = sim.call();
        long stopTime = System.nanoTime();
        System.out.printf ("%s\t%s\t%s\n", 
                           "numberSteps", "time (µsec)", "π (estimation)");
        System.out.printf ("%10d\t%.6f\t%.9f\n", numberSteps, (stopTime - startTime)/(float)1e9, pi);
    }
}
