package se.ceutbildning.hala;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ProgrammerTest {
    @Test
    public void test_Object_created_successfully(){
        String name = "Test";
        LocalDate birthDate = LocalDate.parse("2001-01-27");
        Prgrammer testObject = new Prgrammer(name,birthDate);

        Assert.assertNotNull(testObject.getId());
        Assert.assertEquals(birthDate,testObject.getBirthDate());
        Assert.assertEquals(name,testObject.getName());
        Assert.assertNotNull(testObject.getSkills());

    }
}
