package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    @Test
     public void catNameTest() {
        //Given
        String expectedName = "catName";
        Date expectedBirthday = null;
        Integer expectedID= null;
        Cat cat = new Cat(expectedName, expectedBirthday, expectedID);

        //When
         String actualName = cat.getName();
         Date actualBirthday = cat.getBirthDate();
        Integer actualId= cat.getId();
        //Then
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualBirthday, expectedBirthday);
        Assert.assertEquals(actualId,expectedID);
    }
    @Test
    public void speakTest(){
        //Given
        String expectedCatSpeak = "meow!";
        String expectedName = "catName";
        Date expectedBirthday = null;
        Integer expectedID= null;
        Cat cat = new Cat(expectedName, expectedBirthday, expectedID);
        //When
        String actualCatSpeak= cat.speak();
        //Then
        Assert.assertEquals(expectedCatSpeak, actualCatSpeak);

    }
    @Test
    public void dateTest(){
        //Given
        String expectedCatSpeak = "meow!";
        String expectedName = "catName";
        Date expectedBirthday  = new Date();
        Integer expectedID= null;
        Cat cat = new Cat(expectedName, expectedBirthday, expectedID);
        //When
        Date actualDate = cat.getBirthDate();
        //Then
        Assert.assertEquals(expectedBirthday,actualDate);

    }

   @Test
   void eaten(){
       String expectedCatSpeak = "meow!";
       String expectedName = "catName";
       Date expectedBirthday  = new Date();
       Integer expectedID= null;
       Cat cat = new Cat(expectedName, expectedBirthday, expectedID);
       ArrayList<food> =
       //Given



   }
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
