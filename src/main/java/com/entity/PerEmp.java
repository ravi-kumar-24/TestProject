package com.entity;

public class PerEmp extends Emp {
    private int bonus;

    public PerEmp(int id, String name, int bonus) {
        super(id, name, 1);
        this.bonus = bonus;
    }
}
