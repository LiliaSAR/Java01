import org.junit.Assert;
import org.junit.Test;

public class WorkWithStringTest {
    WorkWithString stringInstanceTest = new WorkWithString();

    @Test
    public void sumOfArray_positiveNumbers(){
        String str = "Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation.";
        Assert.assertEquals(47,stringInstanceTest.count_Vowels(str));
    }


}
