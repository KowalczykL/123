/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.utils.test;

import com.kowalczyk.measuresupport.utils.FileRecognizer;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class FileRecognizerTest {

    static FileRecognizer fileReco;
    String ddg1 = "DDGD_ZEUP_PGED_P_1761_20170303.csv";
    String fileType;

    String watddg = "WATDDG";

    @BeforeAll
    public static void initialize() {

        fileReco = new FileRecognizer();

    }

    @Test
    public void recognitionTestWatddg() {
        fileType = FileRecognizer.recognizeFile(ddg1);
        assertEquals(fileType, watddg);

    }

    @Test
    public void recognitionTestNull() {
        ddg1 = null;
        fileType = FileRecognizer.recognizeFile(ddg1);
        assertEquals(fileType, "Something went wrongI dont know him");

    }

    @Test
    public void recognitionTestEmpty() {
        ddg1 = "";
        fileType = FileRecognizer.recognizeFile(ddg1);
        assertEquals(fileType, "Something went wrongI dont know him");

    }
    @Test
    public void recognitionTestIntAsString() {
        ddg1 = "123";
        fileType = FileRecognizer.recognizeFile(ddg1);
        assertEquals(fileType, "Something went wrongI dont know him");

    }
    
    
    
    @AfterEach
    public void finalizing() {
        System.out.println(fileType);
        fileType = null;

    }
}
