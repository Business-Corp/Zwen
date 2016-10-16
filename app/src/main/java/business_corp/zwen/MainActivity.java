package business_corp.zwen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mediathek;
    private ArrayList<Media> datensaetze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datensaetze=new ArrayList<Media>();
        datensaetze.add(new Media("TestName","Subtitel Test",R.drawable.movie));
        datensaetze.add(new Media("Seriee","2ter eintrag",R.drawable.series));


        mediathek = (ListView) findViewById(R.id.listview_mediathek);

    }
}
