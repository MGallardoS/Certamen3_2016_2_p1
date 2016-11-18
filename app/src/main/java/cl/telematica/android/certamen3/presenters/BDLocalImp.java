package cl.telematica.android.certamen3.presenters;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import cl.telematica.android.certamen3.models.AdminSQLite;
import cl.telematica.android.certamen3.models.Feed;
import cl.telematica.android.certamen3.presenters.contract.BDLocal;

/**
 * Created by mavin on 18/11/2016.
 */

public class BDLocalImp implements BDLocal {


    String title, link, author,publishedDate, content, image;
    boolean isFavorite;
    Context context;

    public BDLocalImp(Feed feed, Context context){

        title = feed.getTitle();
        link = feed.getLink();
        author = feed.getAuthor();
        publishedDate = feed.getContent();
        content = feed.getContent();
        image = feed.getImage();
        isFavorite = feed.isFavorite();
        this.context = context;
    }

    @Override
    public void SaveData() {

        AdminSQLite FeedBD = new AdminSQLite(context,"FeedBD", null, 1);
        SQLiteDatabase bd = FeedBD.getWritableDatabase();

        ContentValues registro = new ContentValues();

        registro.put("title", title);
        registro.put("link", link);
        registro.put("author", author);
        registro.put("publishedDate", publishedDate);
        registro.put("content", content);
        registro.put("image", image);
        registro.put("isFavorite", isFavorite);
        bd.insert("", null, registro);
        bd.close();

    }
}
