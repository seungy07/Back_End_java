package day27_0812.종합예제_d27.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BaseTime {
    private String cdate;

    public BaseTime() {
        this.cdate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public BaseTime(String cdate) {
        this.cdate = cdate;
    }

    public String getCdate() { return cdate; }
    public void setCdate(String cdate) { this.cdate = cdate; }
}