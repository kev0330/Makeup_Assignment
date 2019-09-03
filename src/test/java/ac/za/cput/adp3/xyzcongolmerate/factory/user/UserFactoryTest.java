package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    private String name, surname, email;

    @Before
    public void setUp() throws Exception{
        this.surname = "Surname";
        this.name = "Name";
        this.email = "email";

    }

    @Test
    public void buildUser() {
        User course = UserFactory.buildUser(this.email,this.name,this.surname);
        Assert.assertNotNull(course.getLastName());
        Assert.assertNotNull(course.getUserEmail());
        Assert.assertNotNull(course.getFirstName());
        Assert.assertNotNull(course);

    }
}