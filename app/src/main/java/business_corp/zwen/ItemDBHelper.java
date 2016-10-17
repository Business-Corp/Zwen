package business_corp.zwen;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

/**
 * Created by Höling on 18.10.2016.
 */

public class ItemDBHelper {

    private SQLiteDatabase db;

    public ItemDBHelper(){



        db = openOrCreateDatabase("Zwen", null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Media(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Name VARCHAR NOT NULL, Subtitle VARCHAR, Typ INTEGER, Beschreibung TEXT);");
        //db.execSQL("DROP TABLE IF EXISTS LeBe.UserProfile");

        //db.execSQL("INSERT INTO Media VALUES ('TestFilm','subTestTitel',,'TestBeschreibung');");

        //Cursor resultSet = db.rawQuery("SELECT * FROM Media", null);

        //resultSet.
    }

    public ArrayList getAllMedia(){

        ArrayList<Media> liste = new ArrayList<>();
        Cursor resultSet = db.rawQuery("SELECT * FROM Media", null);

        if(resultSet.moveToFirst()){
            liste.add(new Media(resultSet.getType(0),resultSet.getString(1),resultSet.getString(3),resultSet.getType(4),resultSet.getString(5)));
        }else{

            Integer integer = R.drawable.movie;
            db.execSQL("INSERT INTO Media VALUES ('TestFilm','subTestTitel','"+integer+"');");
        }

        return liste;
    }

}
