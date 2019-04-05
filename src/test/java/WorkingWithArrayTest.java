import org.junit.Assert;
import org.junit.Test;

public class WorkingWithArrayTest {
    WorkingWithArray testInstance = new WorkingWithArray();

    @Test
    public void sumOfArray_positiveNumbers(){
        int[] testArray = {10,20,40,30};
        Assert.assertEquals(100,testInstance.sumOfArray(testArray));
    }

    @Test
    public void minOfArray_positiveNumbers(){
        int[] testArray = {5,4,8,10};
        Assert.assertEquals(4, testInstance.minOfArray(testArray));
    }


}
