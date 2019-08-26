package com.massky.dbflow;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {

    //数据库名称
    public static final String NAME = "MyDatabase";
    //数据库版本号
    public static final int VERSION = 1;

}
