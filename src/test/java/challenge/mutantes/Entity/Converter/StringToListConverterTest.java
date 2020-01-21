package challenge.mutantes.Entity.Converter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StringToListConverterTest {
    List<String> stringList = new ArrayList<>();
    String string;
    StringToListConverter stringToListConverter = new StringToListConverter();

    @Before
    public void setUp() throws Exception {
        stringList.add("meli");
        stringList.add("mutant");
        stringList.add("challenge");

        string = "meli|mutant|challenge";
    }

    @Test
    public void convertToDatabaseColumn() {
        assertEquals(string, stringToListConverter.convertToDatabaseColumn(stringList));
    }

    @Test
    public void convertToEntityAttribute() {
        assertEquals(stringList, stringToListConverter.convertToEntityAttribute(string));
    }
}