package ege.edu.tr.project1.OOP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATATURK
 */
public class EmployeeList { // Çalışanları tutacak olan liste

    private int numberOfelements;
    private int size;
    private Employee list[]; 

    public EmployeeList() {
        list = new Employee[20]; // Varsayılan olarak 20 elemanlı liste oluşuyor.
        numberOfelements = 0;
    }

    public EmployeeList(int theSize) { // Dışarıdan boyut belirlenebiliyor.
        setSize(theSize);
        list = new Employee[theSize];
    }
    public Employee getHead(){ // Listenin ilk elemanını döndürüyor.
        return list[0];
    }
    public Employee getIndexedElement(int index){ // İstenilen indexde bulunan nesne döndürülüyor.
        return list[index];
        
    }
    public void add(Employee e){ // Ekleme metodu.
        if (numberOfelements==list.length) {
            updateListSize();       // Liste boyutunu aşarsa boyut güncelleniyor.
        }
        else 
           list[numberOfelements++]=e;
    }
    
    public int getSize(){ // Listenin boyutunu döndürüyor.
       return size;
    }
  
    
    private void updateListSize(){
        size += 10; // Kapasite 10 kadar arttırılıyor
        Employee[] temp = new Employee[size];   // Nesnelerin aktarılacağı geçici dizi
        for (int i = 0; i < list.length; i++) // Nesneler bu döngü içerisinde geçici diziye aktarılıyor
        {
            temp[i] = list[i];
        }
        list = temp; // Yeni kapasiteli dizi deep copy ile oluşmuş oluyor.
    }
    

    public void setSize(int size) { // Dışarıdan girilen boyut kontrol ediliyor.
        if (size < 0) {
            System.out.println("Enter a valid size");
            System.exit(0);
        } else {
            this.size = size;
        }
    }

}
