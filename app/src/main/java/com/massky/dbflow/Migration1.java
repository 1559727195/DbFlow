package com.massky.dbflow;

import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

@Migration(version = AppDataBase.VERSION,database = AppDataBase.class)
public class Migration1 extends AlterTableMigration<User2Model> {
    public Migration1(Class<User2Model> table) {
        super(table);
    }

    @Override
    public void onPreMigrate() {//增加数据库字段
        super.onPreMigrate();
        addColumn(SQLiteType.INTEGER,User2Model_Table.timeStamp1.getNameAlias().name());
    }
}
