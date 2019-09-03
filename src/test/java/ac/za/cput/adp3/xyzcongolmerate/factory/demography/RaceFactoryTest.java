package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    private String race;

    @Before
    public void setUp() throws Exception{
        this.race = "Asian";
    }

    @Test

    public void buildRace() {
        Race course = RaceFactory.buildRace(this.race);
        Assert.assertNotNull(course.getRaceId());
        Assert.assertNotNull(course.getRaceDescription());
        Assert.assertNotNull(course);
    }
}