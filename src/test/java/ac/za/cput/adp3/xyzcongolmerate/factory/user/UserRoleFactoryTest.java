package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    private String orgCode, userEmail, roleId;

    @Before
    public void setUp() throws Exception{
        this.orgCode = "123";
        this.userEmail = "UserEmail";
        this.roleId = "1234";
    }

    @Test
    public void buildUserRole() {
        UserRole course = UserRoleFactory.buildUserRole(this.orgCode, this.userEmail, this.roleId);
        Assert.assertNotNull(course.getUserEmail());
        Assert.assertNotNull(course.getOrgCode());
        Assert.assertNotNull(course.getRoleId());
    }
}