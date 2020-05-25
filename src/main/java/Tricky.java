import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tricky {
    private  String field;

    private Tricky (String field){
        this.field = field;
    }

    void show() {
        System.out.println(field);
    }

    void getDateTime () {
        System.out.println(LocalDateTime.now());
    }
}
