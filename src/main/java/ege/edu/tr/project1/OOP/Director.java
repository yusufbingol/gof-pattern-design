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
public class Director extends Employee {

    // Refactoring uygulanarak Officer ve Director class'larının ortak metotları abstract superclass'da toplanmıştır.
    // Tek fark addSubEmployee metodu. Bu metot Director'e özeldir.
    public Director() {
    }

    public Director(String FullName, int salary, String directorName) {
        super(FullName, directorName, salary);
    }

    public void addSubEmployee(Employee subEmployee) { // Directorun listesine Sub Employee ekleniyor.
        super.getEmpList().add(subEmployee);
    }

    /**
     *
     * @return
     */
    @Override
    public int calculateCost() {
        return super.calculateCost();
    }

    @Override
    public void list() {
        super.list();
    }

    @Override
    public String getDirectorName() {
        return super.getDirectorName();
    }

    @Override
    public EmployeeList getEmpList() {
        return super.getEmpList();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
    
}
