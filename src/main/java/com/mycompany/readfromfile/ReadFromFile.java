/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.readfromfile;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 *
 * @author PC
 */
public class ReadFromFile {
    

    public static void main(String[] args) throws IOException {
       PDFManager pdfManager = new PDFManager();
         pdfManager.setFilePath("C:\\Users\\PC\\Desktop\\Gosterge Kartları_Revizyon No_02.pdf"); //ToEdit.pdf
      try {
         String text = pdfManager.toText();
         System.out.println(text);
         FileWriter write= new FileWriter("Outputnew.txt");
         write.write(text); 
        
          }
         
         
         
         
         
         catch (IOException ex) {
         Logger.getLogger(ReadFromFile.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        
        
        
        
        
        

    
}
         
         
    }

