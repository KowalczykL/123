/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.utils.test;

import com.kowalczyk.measuresupport.measure.beansfromfile.BeanFromTauFile;
import com.kowalczyk.measuresupport.utils.CommasToDotReplacer;
import com.kowalczyk.measuresupport.utils.FileMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.annotations.Ignore;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class FileMapperTest {

    String filename = ("input/DR_ENID_EUPX_20180704_27.csv");
    File file;

    FileMapper fileMapper = new FileMapper();
    List<BeanFromTauFile> tauBeans = new ArrayList<>();

    @Test
    public void mapTauFileIntoTauBean() throws FileNotFoundException {
        file = new File("input/DR_ENID_EUPX_20180704_27.csv");
        assertTrue(file.exists(), "no file");
        System.out.println("before");
        tauBeans = fileMapper.convertTauFileToBeans(file);
        System.out.println("after");
        for (BeanFromTauFile tempOut : tauBeans) {
            System.out.println(tempOut.toString());

        }

    }
    @Ignore
    public void nullFileConv() throws FileNotFoundException{
    File nullFile = null;
    
            tauBeans = fileMapper.convertTauFileToBeans(nullFile);
        System.out.println("after");
        for (BeanFromTauFile tempOut : tauBeans) {
            System.out.println(tempOut.toString());

        }
    
    
    }
}
