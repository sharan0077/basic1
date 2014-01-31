import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void returnsTheProbability(){
        Probability probability = new Probability(0.5);
//        assertEquals(0.5, probability.getProbability());
        assertEquals(new Probability(0.5),probability);
    }

    @Test
    public void returnsInverseProbability(){
        Probability probability = new Probability(0.35);
        Probability inverseProbability = probability.getInverseProbability();
        assertEquals(new Probability(0.65), inverseProbability);
    }

    @Test
    public void returnsProbabilityByTakingTwoParameters(){
        Probability probability = new Probability(2.0d,4.0d);
        Probability inverseProbability = probability.getInverseProbability();
        assertEquals(new Probability(0.5), probability);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsIllegalArgumentsException(){
        Probability probability = new Probability(4,2);
        assertEquals(new Probability(0.5), probability);
    }

    @Test
    public void CaluculateProbabilityForTwoSimulataneousProbability(){
        Probability probability1 = new Probability(1d,6d);
        Probability probability2 = new Probability(1d,6d);
        Probability simultaneosProbability  = probability1.getSimultaneousProbability(probability2);
        assertEquals(new Probability(1d/36d),simultaneosProbability);
    }

    @Test
    public void CaluculateProbabilityForThreeSimulataneousProbability(){
        Probability probability1 = new Probability(1d,6d);
        Probability probability2 = new Probability(1d,6d);
        Probability probability3  = new Probability(1d,6d);
        Probability simultaneousProbability = probability3.getSimultaneousProbability(probability1.getSimultaneousProbability(probability2));
        assertEquals(new Probability(1d/216d),simultaneousProbability);
    }

    @Test
    public void CalculateEitherOneOrMoreOccurancesOfProbability(){
        Probability probability1 = new Probability(1d,6d);
        Probability probability2 = new Probability(1d,6d);
        Probability eitherProbability = probability1.getEitherOfProbability(probability2);
        assertEquals(new Probability(2d/6d-1d/36d),eitherProbability);
    }

    @Test
    public void CalculateEitherOneOrMoreOccurancesOfProbabilityForCoins(){
        Probability probability1 = new Probability(1d,2d);
        Probability probability2 = new Probability(1d,2d);
        Probability eitherProbability = probability1.getEitherOfProbability(probability2);
        assertEquals(new Probability(3d/4d),eitherProbability);
    }

    @Test
    public void CalculateXorOfProbability(){
        Probability probability1 = new Probability(1d,2d);
        Probability probability2 = new Probability(1d,2d);
        Probability xorProbability = probability1.getXorProbability(probability2);
        assertEquals(new Probability(2d / 4d), xorProbability);
    }
}
