/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.measure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class Osd {
    private long id;
    private String name;
    private String shortName;
    private String directory;



    public Osd() {
    }

    @Override
    public String toString() {
        return "Dystrybutor{" + "nazwa=" + name + ", skrot=" + shortName + ", folder=" + directory + '}';
    }
    
    
    
    

    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDirectory() {
        return directory;
    }

    public void setFolderPlikow(String folderPlikow) {
        this.directory = folderPlikow;
    }







    
    
    
}

