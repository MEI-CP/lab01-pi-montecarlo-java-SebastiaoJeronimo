package seq;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

/**
 * Base test class for testing ApproxPiSeq
 * Uses 1000000 steps
 * Subtype to setup new tests as in example PITest1000
 */
public class PiTest {

    protected int numberSteps() {
        return 1000000;
    }

    protected Callable<Double> simulation() {
        return new ApproxPiSeq(numberSteps());
    }

    @Test
    public void test() throws Exception {
        var sim = simulation();
        long startTime = System.nanoTime();
        var pi = sim.call();
        long stopTime = System.nanoTime();
        output(startTime, stopTime, pi);
    }

    /**
     * Write the output
     * @param startTime
     * @param stopTime
     * @param pi
     */
    protected void output(long startTime, long stopTime, double pi) {
        System.out.println  ("numberSteps\ttime (µsec)\tπ (estimation)");
        System.out.printf ("%10d\t%.6f\t%.9f\n",
                numberSteps(), (stopTime - startTime)/(float)1e9, pi);
    }
}
