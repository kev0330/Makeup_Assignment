package ac.za.cput.adp3.xyzcongolmerate.util;


import java.util.Arrays;
import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();

    }

    public static String getClassName(Class<?> aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String[] substrings = className.split("[^A-Z]+");
        String factoryName = Arrays.toString(substrings);
        factoryName = factoryName.substring(1,factoryName.length()-1).replaceAll(",","").replaceAll("\\s","");
        return factoryName;
            /**
             * Your implementation goes here
             *
             * INSTRUCTION
             * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
             * 2. Get the capitalized letter(s) from the className and return it.
             */

    }
}
