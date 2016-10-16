package business_corp.zwen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mediathek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediathek = (ListView) findViewById(R.id.listview_mediathek);

    }
}
