package business_corp.zwen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mediathek;
    private ArrayList<Media> datensaetze;
    private CustomMediaAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datensaetze=new ArrayList<Media>();
        datensaetze.add(new Media("TestName","Subtitel Test",1));
        datensaetze.add(new Media("Seriee","2ter eintrag",2));


        mediathek = (ListView) findViewById(R.id.listview_mediathek);

        listAdapter=new CustomMediaAdapter(datensaetze, this);

        mediathek.setAdapter(listAdapter);

        mediathek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //String selectedValue = (String) ge
                Toast.makeText(getApplicationContext(), "blah", Toast.LENGTH_LONG).show();
                //Toast.makeText(getApplicationContext(),"blahblah", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
