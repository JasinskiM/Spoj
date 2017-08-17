package Algorithms;

public abstract class AbstractAlgorithm {
    public AbstractAlgorithm() {
        System.out.println("Konstruktor Abstract algoritm");
    }

    public abstract String getName();

    public abstract void runAlgoritm(String[] input);
}
