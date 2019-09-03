package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    private String roleName;

    @Before
    public void setUp() throws Exception{
        this.roleName = "NewRole";

    }

    @Test
    public void buildRole() {

        Role course = RoleFactory.buildRole(this.roleName);
        Assert.assertNotNull(course.getRoleId());
        Assert.assertNotNull(course.getRoleName());
        Assert.assertNotNull(course);

    }
}