/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.measure.beansfromfile;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

/**
 *
 * @author Łukasz Kowalczyk bean to map csv to object (for saving to db) fields
 * like in file, annotated by headers names
 */
public class BeanFromTauFile {

    private long id;

    private String filename;

    @CsvBindByName(column = "PPE")
    private String ppe;

    @CsvBindByName(column = "Nr licznika")
    private long counterNumber;

    @CsvBindByName(column = "Kod OT")
    private int otKode;

    @CsvBindByName(column = "Taryfa")
    private String tariff;

    @CsvBindByName(column = "Energia")
    private String energy;

    @CsvBindByName(column = "Strefa")
    private int zone;

    @CsvBindByName(column = "Data od")
    private String dateFrom;

    @CsvBindByName(column = "Data do")
    private String dateTo;

    @CsvBindByName(column = "Wskazanie poprzednie")
    private double currentIndication;

    @CsvBindByName(column = "Wskazanie biezace")
    private double previousIndication;

    @CsvBindByName(column = "Zuzycie brutto[kWh]")
    private long grossConsumption;

    @CsvBindByName(column = "Straty[kWh]")
    private double losses;

    @CsvBindByName(column = "Korekty[kWh]")
    private double corrections;

    @CsvBindByName(column = "Mnozna")
    private int multiplicand;

    @CsvBindByName(column = "Wersja danych")
    private int version;

    @CsvBindByName(column = "Status Odczytu")
    private String readingStatus;

    @CsvBindByName(column = "Status Rozliczenia")
    private String settlementStatus;

    @CsvBindByName(column = "Rodzaj Odczytu")
    private String typeOfReadings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPpe() {
        return ppe;
    }

    public void setPpe(String ppe) {
        this.ppe = ppe;
    }

    public long getCounterNumber() {
        return counterNumber;
    }

    public void setCounterNumber(long counterNumber) {
        this.counterNumber = counterNumber;
    }

    public int getOtKode() {
        return otKode;
    }

    public void setOtKode(int otKode) {
        this.otKode = otKode;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public double getCurrentIndication() {
        return currentIndication;
    }

    public void setCurrentIndication(double currentIndication) {
        this.currentIndication = currentIndication;
    }

    public double getPreviousIndication() {
        return previousIndication;
    }

    public void setPreviousIndication(double previousIndication) {
        this.previousIndication = previousIndication;
    }

    public long getGrossConsumption() {
        return grossConsumption;
    }

    public void setGrossConsumption(long grossConsumption) {
        this.grossConsumption = grossConsumption;
    }

    public double getLosses() {
        return losses;
    }

    public void setLosses(double losses) {
        this.losses = losses;
    }

    public double getCorrections() {
        return corrections;
    }

    public void setCorrections(double corrections) {
        this.corrections = corrections;
    }

    public int getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(int multiplicand) {
        this.multiplicand = multiplicand;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getReadingStatus() {
        return readingStatus;
    }

    public void setReadingStatus(String readingStatus) {
        this.readingStatus = readingStatus;
    }

    public String getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(String settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getTypeOfReadings() {
        return typeOfReadings;
    }

    public void setTypeOfReadings(String typeOfReadings) {
        this.typeOfReadings = typeOfReadings;
    }

    @Override
    public String toString() {
        return "TauFromFileFileBean{" + "id=" + id + ", filename=" + filename + ", ppe=" + ppe + ", counterNumber=" + counterNumber + ", otKode=" + otKode + ", tariff=" + tariff + ", energy=" + energy + ", zone=" + zone + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", currentIndication=" + currentIndication + ", previousIndication=" + previousIndication + ", grossConsumption=" + grossConsumption + ", losses=" + losses + ", corrections=" + corrections + ", multiplicand=" + multiplicand + ", version=" + version + ", readingStatus=" + readingStatus + ", settlementStatus=" + settlementStatus + ", typeOfReadings=" + typeOfReadings + '}';
    }

}
