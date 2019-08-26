package com.massky.dbflow;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = AppDataBase.class)
public class User2Model extends BaseModel {

    @PrimaryKey(autoincrement = true)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private long timeStamp;

    @Column
    private long timeStamp1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTimeStamp1() {
        return timeStamp1;
    }

    public void setTimeStamp1(long timeStamp1) {
        this.timeStamp1 = timeStamp1;
    }
}
