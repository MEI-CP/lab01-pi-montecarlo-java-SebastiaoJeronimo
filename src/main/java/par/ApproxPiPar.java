package par;

import seq.ApproxPiSeq;

/**
 * Calculation of π Using the Monte Carlo Method
 * Parallel version.
 * You must implement method pi4()
 */
public class ApproxPiPar extends ApproxPiSeq {

    /**
     * The number of threads running the simulation
     */
    protected final int numberThreads;

    /**
     * Constructor
     * @param numberSteps Number of steps of the simulation
     * @param numberThreads Number of threads running the simulation
     */
    public ApproxPiPar(long numberSteps, int numberThreads) {
        super(numberSteps);
        this.numberThreads = numberThreads;
    }

    @Override
    protected double pi4() {
        // TODO: implement using numberThreads threads
        // Suggestion 1: Use Java Threads
        // Suggestion 2: use a fixed size thread pool: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/Executors.html#newFixedThreadPool(int)
        return 0;
    }

    /**
     * Main method
     * Usage: ApproxPiPar <nSteps> [nThreads]
     * @param args
     */
    public static void main(final String[] args) {
        if (args.length <1 || args.length > 2) {
            System.out.println ("Usage: ApproxPiPar <nSteps> [nThreads]");
            return;
        }
        long numberSteps = Integer.parseInt(args[0]);
        int nThreads = (args.length == 2) ? Integer.parseInt(args[1]) : 1;

        ApproxPiPar sim = new ApproxPiPar(numberSteps, nThreads);
        long startTime = System.nanoTime();
        double pi = sim.call();
        long stopTime = System.nanoTime();
        System.out.println  ("numberThreads\tnumberSteps\ttime (µsec)\tπ (estimation)");
        System.out.printf ("%13d\t%10d\t%.6f\t%.9f\n", nThreads,
                numberSteps, (stopTime - startTime)/(float)1e9, pi);
    }
}
