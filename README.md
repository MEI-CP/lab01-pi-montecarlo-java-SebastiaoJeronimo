# Lab 1: Calculation of π Using the Monte Carlo Method

Concurrency and Parallelism 2022-23

Hervé Paulino <<herve.paulino@fct.unl.pt>>

Alex Davidson <<a.davidson@fct.unl.pt>>

March 2023

## Assignment

Task: Write sequential and parallel implementations of a Monte Carlo method simulation for estimating the size of π.

Assignment PDF: <https://raw.githubusercontent.com/MEI-CP/lab-assignments/main/lab01-pi-montecarlo-java.pdf>

### Quick Start

This is a [gradle](https://gradle.org/) project, and is best used when imported into an IDE, like [VS Code](https://code.visualstudio.com/), or [Eclipse](https://www.eclipse.org/downloads/packages/).

Build the project:
```
./gradlew build
```

Run tests (simply checks that things work correctly):
```
./gradlew test
```

Running the compiled classfile (e.g. for 1000 steps):
```
java ApproxPiSeq 1000
```
