import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    ArrayList<Person> people = new ArrayList<>();

    public void setUpPeople() {
        people.add(new Person("person 1", LocalDate.of(1111, Month.JANUARY, 1), Person.Sex.MALE, "person1@gmail.com"));
        people.add(new Person("person 2", LocalDate.of(2222, Month.JANUARY, 2), Person.Sex.FEMALE, "person2@gmail.com"));
        people.add(new Person("person 3", LocalDate.of(3333, Month.JANUARY, 3), Person.Sex.MALE, "person3@gmail.com"));
        people.add(new Person("person 4", LocalDate.of(4444, Month.JANUARY, 4), Person.Sex.FEMALE, "person4@gmail.com"));
        people.add(new Person("person 5", LocalDate.of(5555, Month.JANUARY, 5), Person.Sex.MALE, "person5@gmail.com"));
    }

    @Test
    public void getNameTest(){
        setUpPeople();
        Assert.assertEquals( "person 1" , people.get(0).getName() );
    }
    @Test
    public void getBirthdayTest(){
        setUpPeople();
        Assert.assertEquals( LocalDate.of(2222,1,2) , people.get(1).getBirthday());
    }
    @Test
    public void getGenderTest(){
        setUpPeople();
        Assert.assertEquals(Person.Sex.MALE , people.get(2).getGender());
    }
    @Test
    public void getEmailAddressTest(){
        setUpPeople();
        Assert.assertEquals( "person4@gmail.com" , people.get(3).getEmailAddress());

    }
}
