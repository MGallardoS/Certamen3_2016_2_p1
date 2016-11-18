package cl.telematica.android.certamen3.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mavin on 18/11/2016.
 */

public class AdminSQLite extends SQLiteOpenHelper {


    public AdminSQLite(Context context, String nombre, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table feed(title text primary key, link text, author text, publishedDate text, content text, image text, isFavorite text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists feed");
        db.execSQL("create table feed(title text primary key, link text, author text, publishedDate text, content text, image text, isFavorite text)");
    }

    public void deleteFeed(String title, SQLiteDatabase db) {
        db.execSQL("DELETE FROM feed WHERE title='"+title+"'");

    }
}
