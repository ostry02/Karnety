package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


public class DatyAktywacji {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private String dataAktywacjis = "19/02/2023";
    private String dataDezaktywacjis=  "19/02/2023";
    private Date dataAktywacji = simpleDateFormat.parse(dataAktywacjis);

    private Date dataDeaktywacji = simpleDateFormat.parse(dataDezaktywacjis);
    public Date dataTeraz =new Date();

    public String getDataDezaktywacjis() {
        return dataDezaktywacjis;
    }

    public void setDataDezaktywacjis(String dataDezaktywacjis) {
        this.dataDezaktywacjis = dataDezaktywacjis;
    }

    public String getDataAktywacjis() {
        return dataAktywacjis;
    }

    public void setDataAktywacjis(String dataAktywacjis) {
        this.dataAktywacjis = dataAktywacjis;
    }

    public DatyAktywacji() throws ParseException {
    }

    public Date getDataAktywacji() {
        return dataAktywacji;
    }

    public Date getDataDeaktywacji() {
        return dataDeaktywacji;
    }

    public void setDataDeaktywacji(Date dataDeaktywacji) {
        this.dataDeaktywacji = dataDeaktywacji;
    }
}

