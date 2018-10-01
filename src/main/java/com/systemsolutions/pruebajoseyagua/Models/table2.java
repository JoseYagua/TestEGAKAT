package com.systemsolutions.pruebajoseyagua.Models;

public class table2 {
    private int idtable2;
    private String d;
    private double c;
    private table1 vtable1;

    public table2(int idtable2, String d, double c, table1 vtable1) {
        this.idtable2 = idtable2;
        this.d = d;
        this.c = c;
        this.vtable1 = vtable1;
    }

    public table2() {
    }

    public int getIdtable2() {
        return idtable2;
    }

    public void setIdtable2(int idtable2) {
        this.idtable2 = idtable2;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public table1 getVtable1() {
        return vtable1;
    }

    public void setVtable1(table1 vtable1) {
        this.vtable1 = vtable1;
    }

    
    
}
