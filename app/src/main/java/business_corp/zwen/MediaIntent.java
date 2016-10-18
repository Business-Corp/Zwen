package business_corp.zwen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Höling on 17.10.2016.
 */

public class MediaIntent extends AppCompatActivity{

    private Media actualMedia;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_intent);


        Object object = getIntent().getSerializableExtra(MainActivity.EXTRA_MESSAGE);
        Media media = new Media("test","test",2);


        if(object.getClass()==Media.class){

           media=(Media)getIntent().getSerializableExtra(MainActivity.EXTRA_MESSAGE);
            actualMedia = media;
        }

        TextView nameTextView = (TextView)findViewById(R.id.mediaIntent_editName);
        nameTextView.setText(media.getName());

        TextView subtitleText = (TextView)findViewById(R.id.mediaIntent_subtitelEdit);
        subtitleText.setText(media.getSubtitle());

        ImageView typImage = (ImageView)findViewById(R.id.mediaIntent_imageView2);

        if(media.getType()==1){
            typImage.setImageResource(R.drawable.movie);
        }else if(media.getType()==2){
            typImage.setImageResource(R.drawable.series);
        }


        TextView beschreibungEdit = (TextView)findViewById(R.id.mediaIntent_beschreibungEdit);
        //media.setBescheibung("blah blah beschreibung");
        //media.setId(13);
        beschreibungEdit.setText(media.getBescheibung()+" und ID: "+media.getId());
        beschreibungEdit.setSingleLine(false);

       Integer mediaID = media.getId();


    }
    public void saveData(View view){
        /*
        TextView beschreibungEdit = (TextView)findViewById(R.id.mediaIntent_beschreibungEdit);
        actualMedia.setBescheibung(beschreibungEdit.getText().toString());
        */

    }

}
