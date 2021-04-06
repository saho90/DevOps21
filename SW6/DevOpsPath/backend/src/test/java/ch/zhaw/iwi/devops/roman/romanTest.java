package ch.zhaw.iwi.devops.roman;

import org.junit.*;


public class romanTest {

    @Test
    public void romanConverter1() {
        roman result = new roman();
        Assert.assertEquals("M", result.convert(1000));
    }
    
    @Test
    public void romanConverter2() {
        roman result = new roman();
        Assert.assertEquals("I", result.convert(1));
        Assert.assertEquals("V", result.convert(5));
        Assert.assertEquals("X", result.convert(10));
        Assert.assertEquals("L", result.convert(50));
        Assert.assertEquals("C", result.convert(100));
        Assert.assertEquals("D", result.convert(500));
        Assert.assertEquals("M", result.convert(1000));

    }

    @Test
    public void romanConverter3() {
        roman result = new roman();
        Assert.assertEquals("MMD", result.convert(2500));
        Assert.assertEquals("MD", result.convert(1500));
        Assert.assertEquals("C", result.convert(100));
    }

    @Test
    public void romanConverter4() {
        roman result = new roman();
        Assert.assertEquals("MMDIX", result.convert(2509));
        Assert.assertEquals("IX", result.convert(9));
        Assert.assertEquals("CDXLIV", result.convert(444));
    }

}
