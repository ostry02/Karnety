package org.example;

import java.time.LocalDate;

public class DatyAktywacji {
    public LocalDate dataAktywacji;

    public LocalDate getDataTeraz() {
        return dataTeraz;
    }

    protected LocalDate dataDezaktywacji;
    public final LocalDate dataTeraz = LocalDate.now();

    public LocalDate getDataAktywacji() {
        return dataAktywacji;
    }

    public void setDataAktywacji(LocalDate dataAktywacji) {
        this.dataAktywacji = dataAktywacji;
    }

    public LocalDate getDataDezaktywacji() {
        return dataDezaktywacji;
    }

    public void setDataDezaktywacji(LocalDate dataDezaktywacji) {
        this.dataDezaktywacji = dataDezaktywacji;
    }

}
