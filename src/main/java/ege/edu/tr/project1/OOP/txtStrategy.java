/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ege.edu.tr.project1.OOP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ATATURK
 */
public class txtStrategy implements ReadStrategy{    // Txt okuma işlemleri bu sınıftan yapılıyor.
 
private Scanner readFromTxt;
private String filePath;

    public txtStrategy() {
    }

    public txtStrategy(String fileName) { // Okunacak dosyanın yolu alınıyor.
        this.filePath = fileName;
    }


    /**
     *
     * @return
     */

    @Override
    public Scanner readFile() { // Txt okuma bir scanner nesnesi döndürüyor.
        try {
            readFromTxt = new Scanner(new FileInputStream(filePath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(txtStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return readFromTxt;
    }
    
}
