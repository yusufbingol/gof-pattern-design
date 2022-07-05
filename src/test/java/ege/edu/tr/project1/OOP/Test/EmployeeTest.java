/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ege.edu.tr.project1.OOP.Test;

import ege.edu.tr.project1.OOP.Director;
import ege.edu.tr.project1.OOP.Officer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ATATURK
 */
public class EmployeeTest {

    public EmployeeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    void calculateCostTest() {   // Maliyet hesaplama metodu test edilmiştir.
                                 // Beklenen değer 9000'dir ve test başarılı bir şekilde gerçekleştirilmiştir.
        Director director1 = new Director("Fatih Akyüz", 5000, "root");
        Director director2 = new Director("Yusuf Bingöl", 3000, "Fatih");
        Officer officer1 = new Officer("Mehmet Ökten", 1000, "Yusuf");
        director1.addSubEmployee(director2);
        director2.addSubEmployee(officer1);
        int result = director1.calculateCost();
        assertEquals(9000, result);
    }
}
