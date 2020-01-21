package challenge.mutantes.Entity.Converter;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.List;

public class StringToListConverter implements AttributeConverter<List<String>, String> {
    private static final String DELIMETER = "|";

    @Override
    public String convertToDatabaseColumn(List<String> attribute) {
        return String.join(DELIMETER, attribute);
    }

    @Override
    public List<String> convertToEntityAttribute(String dbData) {
        return Arrays.asList(dbData.split("\\" + DELIMETER));
    }
}
