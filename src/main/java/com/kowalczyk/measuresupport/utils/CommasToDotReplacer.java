/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kowalczyk.measuresupport.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class CommasToDotReplacer {

    public static File replace(File file) {

        File tempFile;
try {
     String content = FileUtils.readFileToString(file, "UTF-8");
     content = content.replaceAll(",", ".");
     tempFile = new File("OutputFile");
     FileUtils.writeStringToFile(tempFile, content, "UTF-8");
  } catch (IOException e) {
     //Simple exception handling, replace with what's necessary for your use case!
     throw new RuntimeException("Generating file failed", e);
  }

        return tempFile;
    }
}
