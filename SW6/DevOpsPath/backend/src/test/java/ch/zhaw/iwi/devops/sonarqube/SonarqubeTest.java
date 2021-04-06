package ch.zhaw.iwi.devops.sonarqube;

import org.junit.*;

public class SonarqubeTest {

    @Test
    public void sonarqubeConverter1() {
        Sonarqube result = new Sonarqube();
        Assert.assertEquals(1, result.convert(1));
        Assert.assertEquals(2, result.convert(2));
        Assert.assertEquals(3, result.convert(3));
        Assert.assertEquals(4, result.convert(4));
        Assert.assertEquals(5, result.convert(200000));
        Assert.assertEquals(5, result.convert(984998));
        Assert.assertEquals(5, result.convert(5));
    }
    
}
