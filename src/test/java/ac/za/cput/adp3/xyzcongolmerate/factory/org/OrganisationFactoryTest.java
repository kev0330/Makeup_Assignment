package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    private String orgName;

    @Before
    public void setUp() throws Exception{
        this.orgName = "NewOrgName";
    }

    @Test
    public void buildOrganisation() {
        Organisation course = OrganisationFactory.buildOrganisation(this.orgName);
        Assert.assertNotNull(course.getOrgCode());
        Assert.assertNotNull(course.getOrgName());
        Assert.assertNotNull(course);

    }
}