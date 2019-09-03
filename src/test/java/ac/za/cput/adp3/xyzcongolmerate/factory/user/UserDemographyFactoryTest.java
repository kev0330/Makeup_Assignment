package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    private String title, raceId, email, genderId, stringDate;
    private Date date = null;
    private SimpleDateFormat dateFormat = new SimpleDateFormat();


    @Before
    public void setUp() throws Exception{
        this.email = "email";
        this.title = "Mr";
        this.genderId = "1";
        this.raceId = "1";
        this.dateFormat.applyPattern("MM/dd/yyyy");
        this.stringDate = "03/30/1996";
        this.date = dateFormat.parse(stringDate);
    }

    @Test
    public void buildUserDemography() {
        UserDemography course = UserDemographyFactory.buildUserDemography(this.email,this.title,this.genderId,this.raceId,this.date);
        Assert.assertNotNull(course.getUserEmail());
        Assert.assertNotNull(course.getGenderId());
        Assert.assertNotNull(course.getRaceId());
        Assert.assertNotNull(course.getUserTitle());
        Assert.assertNotNull(course.getDateOfBirth());
        Assert.assertNotNull(course);
        System.out.println(course);
    }
}