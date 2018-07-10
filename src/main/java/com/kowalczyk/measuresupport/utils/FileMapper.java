/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.utils;

import com.kowalczyk.measuresupport.measure.beansfromfile.BeanFromTauFile;
import com.opencsv.bean.CsvToBean;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class FileMapper {

    //CsvToBean qq = new CsvToBean();
    public List<BeanFromTauFile> convertTauFileToBeans(File file) throws FileNotFoundException {
        if (file.exists()) {
            System.out.println("file exist");
        }
        
         if (!file.exists()) {
            System.out.println("file not exist");
            file = new File("empty.csv");
        }       
        
        
        
        String filename = file.getName();
//System.out.println("start of mapping");
        //System.out.println(file.getPath());
        List<BeanFromTauFile> beans = new CsvToBeanBuilder(new FileReader(CommasToDotReplacer.replace(file)))
                .withSeparator(';').withType(BeanFromTauFile.class).build().parse();
        //System.out.println("testlog" + qq);
        for (BeanFromTauFile output : beans) {
            output.setFilename(filename);

        }
        return beans;
    }

}
