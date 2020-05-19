import java.lang.reflect.Constructor;

public class Runner {
    public static void main(String[] args) throws Throwable{
        byte[] tricky = {112, 108, 46, 106, 97, 118, 97, 115, 116, 97, 114, 116, 46, 84, 114, 105, 99, 107, 121};

        Class trickyClass = Class.forName(new String(tricky));
        Constructor constructor = trickyClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object trickyObj = constructor.newInstance("Java Start");
        trickyObj.getClass().getDeclaredMethod("show").invoke(trickyObj);

    }
}
