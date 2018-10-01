
package com.systemsolutions.pruebajoseyagua.Models;

import java.util.Date;

public class table1 {
    private int id, a;
    private Date b;

    public table1() {
    }

    public table1(int id, int a, Date b) {
        this.id = id;
        this.a = a;
        this.b = b;
    }
      public table1(int id, int a) {
        this.id = id;
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Date getB() {
        return b;
    }

    public void setB(Date b) {
        this.b = b;
    }
    
    
}
