package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    private String orgCode, userEmail;

    @Before
    public void setUp() throws Exception{
        this.userEmail = "email";
        this.orgCode = "123";
    }

    @Test
    public void buildOrganisationUser() {
        OrganisationUser course = OrganisationUserFactory.buildOrganisationUser(this.userEmail, this.orgCode);
        Assert.assertNotNull(course.getUserEmail());
        Assert.assertNotNull(course.getOrgCode());
        Assert.assertNotNull(course);
    }
}