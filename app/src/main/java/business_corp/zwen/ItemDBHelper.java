package business_corp.zwen;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Höling on 18.10.2016.
 */

public class ItemDBHelper {

    private SQLiteDatabase db;

    public ItemDBHelper(){

        db = SQLiteDatabase.openOrCreateDatabase("Zwen", null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Media(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Name VARCHAR NOT NULL, Subtitle VARCHAR, Typ INTEGER, Beschreibung TEXT);");
        //db.execSQL("DROP TABLE IF EXISTS LeBe.UserProfile");
        db.execSQL("INSERT INTO Media VALUES ('TestFilm','subTestTitel',,'TestBeschreibung');");
    }

}
