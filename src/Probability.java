/**
 * Created by gurushan on 1/30/14.
 */
public class Probability {

    private double probability;

    public Probability(double probability) {
        if(probability > 1 || probability < 0) throw new IllegalArgumentException();
        this.probability = probability;
    }
    public Probability(double favorableOptions,double possibleOptions){
            this(favorableOptions/possibleOptions);
        }

    public double getProbability(){
        return probability;
    }

    public Probability getInverseProbability(){
        return  new Probability(1 - probability);
    }

    public Probability getSimultaneousProbability(Probability anotherProbability){
        return new Probability(this.probability*anotherProbability.probability);
    }

    public Probability getEitherOfProbability(Probability anotherProbability){
        return new Probability((this.probability+anotherProbability.probability)-(this.getSimultaneousProbability(anotherProbability).getProbability()));
    }

    public Probability getXorProbability(Probability anotherProbability){
        return new Probability((this.getEitherOfProbability(anotherProbability)).getProbability()-(this.getSimultaneousProbability(anotherProbability)).getProbability());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }

}
