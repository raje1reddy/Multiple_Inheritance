package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EmployeeTest {

        private Employee employee;
        private Philanthropist philanthropist;
        private Programmer programmer;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){

            employee = new Employee();
            philanthropist = new Philanthropist();
            programmer = new Programmer();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            employee = null;
        }
        @Test
        public void inheritanceExample() {
             employee.receiveSalary();

            //System.out.println(result);
            //int expectedresult = 6;
            //assertEquals(expectedresult,result);
        }
    @Test
    public void inheritanceExample1() {
        employee.receiveSalary();
        //manager.teamSize();
    }

    @Test
    public void inheritanceExample2() {
        employee.receiveSalary();
    }


}



