package business_corp.zwen;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "MediaIntent";

    private ListView mediathek;
    private ArrayList<Media> datensaetze;
    private CustomMediaAdapter listAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datensaetze=new ArrayList<Media>();
        //datensaetze.add(new Media("TestName","Subtitel Test",1));
        //datensaetze.add(new Media("Seriee","2ter eintrag",2));
        //ItemDBHelper dbHelper = new ItemDBHelper();
        //datensaetze.addAll(dbHelper.getAllMedia());

        SQLiteDatabase db = openOrCreateDatabase("Zwen", MODE_PRIVATE, null);

        //db.execSQL("DROP TABLE IF EXISTS Zwen.Media");

        db.execSQL("CREATE TABLE IF NOT EXISTS Media(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Name VARCHAR NOT NULL, Subtitle VARCHAR, Typ INTEGER, Beschreibung TEXT);");
        Integer integer = R.drawable.movie;


        Cursor resultSet = db.rawQuery("SELECT * FROM Media", null);

        if (resultSet.moveToFirst()){

            datensaetze.add(new Media(resultSet.getType(0),resultSet.getString(1),resultSet.getString(2),resultSet.getType(3),resultSet.getString(4)));

        }else{

            db.execSQL("INSERT INTO Media (Name, Subtitle, Typ, Beschreibung) VALUES ('TestFilm','subTestTitel',"+integer+",'Testbeschreibung und so');");
            //db.execSQL("INSERT INTO Media (Name, Subtitle, Typ) VALUES ('TestFilm','subTestTitel',"+integer+");");
        }


        mediathek = (ListView) findViewById(R.id.listview_mediathek);

        listAdapter=new CustomMediaAdapter(datensaetze, this);

        mediathek.setAdapter(listAdapter);







        mediathek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(MainActivity.this, MediaIntent.class);
                Media media =(Media) mediathek.getItemAtPosition(position);

                intent.putExtra(MainActivity.EXTRA_MESSAGE, (Serializable) media);
                //Toast.makeText(getApplicationContext(), "blah", Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ALLE SIND DOFF", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

}
