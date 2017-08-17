import Algorithms.AbstractAlgorithm;

public class AlgorithmFabric {

    public AbstractAlgorithm getAlgorithm(String name) throws Exception {

        switch (name.toLowerCase()) {


            default:
                throw new Exception("Nie ma takego algorytmu");
        }
    }
}
