package par;

import java.util.concurrent.Callable;

/**
 * Base test class for testing ApproxPiPar
 * Uses 1000000 steps and 4 threads
 * Subtype to setup new tests as in example PITest1000
 */
public class PiTest extends seq.PiTest {

    protected int numberThreads() {
        return Runtime.getRuntime().availableProcessors();
    }

    protected Callable<Double> simulation() {
        return new ApproxPiPar(numberSteps(), numberThreads());
    }

    protected void output(long startTime, long stopTime, double pi) {
        System.out.println ("numberThreads\tnumberSteps\ttime (µsec)\tπ (estimation)");
        System.out.printf ("%13d\t%10d\t%.6f\t%.9f\n", numberThreads(),
                numberSteps(), (stopTime - startTime)/(float)1e9, pi);
    }

}
