package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenderFactoryTest {

    private String gender;

    @Before
    public void setUp() throws Exception{
        this.gender = "Male";
    }

    @Test
    public void buildGender() {
        Gender course = GenderFactory.buildGender(this.gender);
        Assert.assertNotNull(course.getGenderId());
        Assert.assertNotNull(course.getGenderDescription());
        Assert.assertNotNull(course);

    }
}