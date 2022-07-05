/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ege.edu.tr.project1.OOP;

/**
 *
 * @author ATATURK
 */
public class readingMethod { 
    // Read strategy nesnesi bu sınıftan oluşturuluyor ve ilgili nesnenin metodu çalıştırılıyor.
    private final ReadStrategy strategy;

    public readingMethod(ReadStrategy strategy) {
        this.strategy = strategy;
    }
    
    public Object read(){
        return strategy.readFile();
    }
    
    
}
