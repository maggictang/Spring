package loosely_coupled;

public class OutputHelper {

    IOutputGenerator outputGenerator;

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generatorOutput() {
        this.outputGenerator.generateOutput();
    }


}
