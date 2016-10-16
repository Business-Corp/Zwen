package business_corp.zwen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Höling on 16.10.2016.
 */

public class CustomMediaAdapter extends ArrayAdapter<Media> {

    private ArrayList<Media> datensatzMedia;
    Context mContext;


    public CustomMediaAdapter(ArrayList<Media> data,Context context){
        super(context, R.layout.list_item_mediathek, data);
        datensatzMedia=data;
        mContext=context;
    }

    public View getView(int position, View convertview, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowViev=inflater.inflate(R.layout.list_item_mediathek,parent,false);

        ImageView logo = (ImageView)rowViev.findViewById(R.id.logo);
        //logo.setImageResource(R.drawable.);
        TextView name = (TextView)rowViev.findViewById(R.id.nameTextView);
        TextView subtitle = (TextView)rowViev.findViewById(R.id.subtiteltextView);

        Media media = datensatzMedia.get(position);

        name.setText(media.getName());
        subtitle.setText(media.getSubtitle());

        logo.setImageResource(media.getId());

        return null;
    }

}
