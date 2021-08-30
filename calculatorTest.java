import calculator.*;
import org.junit.*;


public class calculatorTest
{
    @Test
    public void shouldReturnZeroOnEmptyString(){
        Assert.assertEquals(0,calculator.add(""));
    }
    @Test
    public void shouldReturnNumberOnNumber(){
        Assert.assertEquals(1,calculator.add("1"));
    }
    @Test
    public void shouldReturnSumOnTwoNumberDelimetByComa(){
        Assert.assertEquals(3,calculator.add("1,2"));
    }
    @Test
    public void shouldReturnSumOnMultipalNumber(){
        Assert.assertEquals(6,calculator.add("1,2,3"));
    }
    @Test
    public void shouldAcceptNewLineasValidDelimetr(){
        Assert.assertEquals(6,calculator.add("1,2\n3"));
    }
    @Test
    public void shouldIgnoreGretheThen1000(){
        Assert.assertEquals(2,calculator.add("1001,2"));
    }
    @Test
    public void should(){
        Assert.assertEquals(3,calculator.add("//;\n1;2"));
    }
    @Test
    public void should2(){
        Assert.assertEquals(6,calculator.add("//[***]\n1***2***3"));
    }




}
