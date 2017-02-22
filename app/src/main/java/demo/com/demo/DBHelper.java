package demo.com.demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pdeogade on 28-11-2016.
 */
public class DBHelper  extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MyDBName.db";




    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(
                "create table contacts " +
                        "(id integer primary key, name text,phone text,email text, street text,place text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
