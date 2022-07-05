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
public class EmployeeListIterator implements Iterator {

    private EmployeeList list;      // Iteratorun gezeceği liste

    private int currentIndex = -1; // Iteratorun bulunduğu index

    public EmployeeListIterator(EmployeeList list) {    // Parametreli constructor
        this.list = list;

    }

    @Override
    public boolean hasNext() {  // Bir sonraki eleman null olmadığı sürece true döndürür.
        return (list.getIndexedElement(currentIndex + 1) != null);
    }

    @Override
    public Employee Next() {    // hasNext metodu true döndürdüğü sürece bir sonraki elemanı döndürür.
        return (hasNext() ? list.getIndexedElement(++currentIndex) : null);
    }

    @Override
    public void reset() {   // Resetlendiği takdirde ilk elemana döner.
        currentIndex = -1;
        list.getIndexedElement(++currentIndex);
    }

}
