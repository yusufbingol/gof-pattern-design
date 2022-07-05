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
public class Officer extends Employee {

    // Refactoring uygulanarak Officer ve Director class'larının ortak metotları abstract superclass'da toplanmıştır.
    public Officer() {
    }

    public Officer(String FullName, int salary, String directorName) { // Parametreli constructor
        super(FullName, directorName, salary);
    }

    @Override
    public int calculateCost() {
        return super.calculateCost();
    }

    @Override
    public void list() {
        super.list(); 
    }

    @Override
    public EmployeeList getEmpList() {
        return super.getEmpList();
    }

    @Override
    public String getDirectorName() {
        return super.getDirectorName();
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
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

}
