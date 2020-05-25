import java.lang.reflect.Constructor;

public class Runner {
    public static void main(String[] args) throws Throwable{
        Class trickyClass = Class.forName("Tricky");
        Constructor constructor = trickyClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object trickyObj = constructor.newInstance("Java Start");
        trickyObj.getClass().getDeclaredMethod("show").invoke(trickyObj);
        trickyObj.getClass().getDeclaredMethod("getDateTime").invoke(trickyObj);

    } 
}
