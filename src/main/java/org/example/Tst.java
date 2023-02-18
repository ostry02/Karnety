package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tst {
    public String x ="10/11/2100";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date y;

    {
        try {
            y = simpleDateFormat.parse(x);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

}
