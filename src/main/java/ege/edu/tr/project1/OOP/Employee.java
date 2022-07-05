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
public abstract class Employee {

    private String fullName;
    private String directorName;
    private int salary;
    private EmployeeList empList;

    public Employee() {     //Parametresiz constructor
    }

    public Employee(String fullName, String directorName, int salary) { //Parametreli constructor
        this.directorName = directorName;
        setFullName(fullName);              // İsim setter metoda gönderiliyor
        this.fullName = fullName;
        setSalary(salary);                  // Salary setter metoda gönderiliyor
        this.salary = salary;
        this.empList = new EmployeeList();  // Yeni emp
    }

    public String getFirstName() {          // Çalışanın ismini döndüren metot
        Scanner scan = new Scanner(fullName);
        return scan.next();
    }

    public String getDirectorName() {       // Çalışanın director ismini döndüren metot
        return directorName;
    }

    public void list() {
        // Metoda gelen çalışanın ismi yazdırıldıktan sonra altındakilerin 
        // listelenmesi için recursive metot çağırılıyor.
        System.out.println("\t\tList for " + this.getFullName());
        System.out.println("Employee Name\t\t\t\t\tHis/Her Director");
        System.out.println("-------------\t\t\t\t\t----------------");
        listAll();
    }

    private void listAll() { // Iterasyon ile birlikte çalışanların listelerini yazdıran recursive metot.
        // Metodun çağırıldığı çalışanın listesi için terasyon oluşturuluyor.
        EmployeeListIterator iter = new EmployeeListIterator(this.getEmpList()); 

        while (iter.hasNext()) {    // Liste sonuna ulaşılana kadar liste içerisindeki nesneler yazdırılıyor.

            Employee tempEmployee = iter.Next();
            if (tempEmployee instanceof Director) {
                // Director veya Officer olma durumuna göre farklı düzenlerde yazdırılıyor.
                System.out.println("D: " + tempEmployee.getFullName() + "\t\t\t\t\t" + tempEmployee.getDirectorName());

            } else {
                System.out.print("M: " + tempEmployee.getFullName() + " ");

            }
            tempEmployee.listAll(); 

        }
        if ((this instanceof Director)) {
            System.out.println("");
        }

    }

    public int calculateCost() {        // Çalışanların maliyeti recursive olan bu metot sayesinde hesaplanıyor.
        int cost = this.getSalary();    // Metodun çağıran çalışanın maaşı alınıyor. 
        EmployeeListIterator iter = new EmployeeListIterator(this.getEmpList()); // Metodun çağıran çalışanın listesi için iterator oluşturuluyor.
        while (iter.hasNext()) {        // Liste dolu olduğu sürece maaşlar recursiondan dönen maaşlar ile toplanarak maaliyet elde ediliyor.
            Employee temp = iter.Next();
            cost += temp.calculateCost();
        }
        return cost;

    }

    public String getFullName() { // Full name getter
        return fullName;
    }

    public void setFullName(String fullName) throws NullPointerException { // null isim verildiğinde exception fırlatır.
        if (fullName != null) {
            this.fullName = fullName;
        } else {
            throw new NullPointerException("Name can not be null");
        }
    }

    public int getSalary() {    // Salary getter
        return salary;
    }

    public void setSalary(int salary) throws ArithmeticException { //Negatif maaş girildiğinde exception fırlatır.
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new ArithmeticException("Salary can not be a negatif number!");

        }

    }

    public boolean equals(Employee emp) {   // Equals metodu
        return (this.fullName.equalsIgnoreCase(emp.getFullName()) && this.directorName.equalsIgnoreCase(emp.getDirectorName()) && this.salary == emp.getSalary());
    }

    public EmployeeList getEmpList() {  // List getter
        return empList;
    }

}
