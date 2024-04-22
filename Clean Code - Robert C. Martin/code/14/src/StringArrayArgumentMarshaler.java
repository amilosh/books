import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {

    private String[] stringValue = null;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue[0] = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_STRING);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArrayArgumentMarshaler)
            return ((StringArrayArgumentMarshaler) am).stringValue;
        else
            return null;
    }
}
