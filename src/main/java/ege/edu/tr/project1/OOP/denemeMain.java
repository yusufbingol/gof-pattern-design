/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ege.edu.tr.project1.OOP;

import java.util.Scanner;

/**
 *
 * @author ATATURK
 */
public class denemeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee employee; // Okunan veriler Employee nesnesinde tutulacak.
        EmployeeList empList = new EmployeeList(); // Employee nesneleri Employee listesine atılacak.
        Director MustafaTurkser = new Director();
        Director OguzDemir = new Director();
        Officer AhmetEgeli = new Officer();

        readingMethod method1 = new readingMethod(new txtStrategy("girdi.txt"));
        Scanner readFromFile = (Scanner)method1.read();
        
        while (readFromFile.hasNext()) { // Scanner nesnesindeki veriler ayrılarak ilgili nesneler oluşturulup listeye ekleniyor.
            int counter = 0;
            String temp = readFromFile.nextLine();
            String[] splits = temp.split(",");

            if (splits[counter].equalsIgnoreCase("d")) {
                employee = new Director(splits[++counter], Integer.parseInt(splits[++counter]), splits[++counter]);
                empList.add(employee);
            } else {
                employee = new Officer(splits[++counter], Integer.parseInt(splits[++counter]), splits[++counter]);
                empList.add(employee);
            }

        }
        // Dosya okuma işleminden sonra listedeki elamanlar hiyerarşik olarak yerleştiriliyor.
        EmployeeListIterator iter1 = new EmployeeListIterator(empList);
        EmployeeListIterator iter2 = new EmployeeListIterator(empList);
        while (iter1.hasNext()) {           // Iterator ile liste geziliyor ve hiyerarşik düzen kuruluyor.
            Employee temp1 = iter1.Next();
            iter2.reset();
            while (iter2.hasNext()) {
                Employee temp2 = iter2.Next();
                if (temp2.getDirectorName().equalsIgnoreCase(temp1.getFirstName())) {
                    Director director =  (Director) temp1;
                    director.addSubEmployee(temp2);
                }
            } 
            if (temp1.getDirectorName().equalsIgnoreCase("root")) { // Hiyerarşi kurulurken aynı zamanda projede istenen çalışanlar çekiliyor.
                MustafaTurkser = (Director) temp1;
            } else if (temp1.getFullName().equalsIgnoreCase("oguz demir")) {
                OguzDemir = (Director) temp1;
            } else if (temp1.getFullName().equalsIgnoreCase("ahmet egeli")) {
                AhmetEgeli = (Officer) temp1;
            }
        }
        // Projede istenen çalışanlari için maliyet ve listeler yazıdırılıyor
        System.out.println("\nTotal cost for " + MustafaTurkser.getFullName() + " is: " + MustafaTurkser.calculateCost());
        MustafaTurkser.list();
        System.out.println("\nTotal cost for " + OguzDemir.getFullName() + " is: " + OguzDemir.calculateCost());
        OguzDemir.list();
        System.out.println("\nTotal cost for " + AhmetEgeli.getFullName() + " is: " + AhmetEgeli.calculateCost());
        AhmetEgeli.list();

    }
}
