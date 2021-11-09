package com.entity;

public class ConEmp extends Emp{


    private int incetive;

    public ConEmp(int id, String name, int incetive) {
        super(id, name,1);
        this.incetive = incetive;
    }

    public int getIncetive() {
        return incetive;
    }

    public void setIncetive(int incetive) {
        this.incetive = incetive;
    }
}
