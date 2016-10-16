package business_corp.zwen;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Höling on 16.10.2016.
 */

public class MainActivityFragment extends Fragment {

    public MainActivityFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.frame_layout,container, false);

    }
}
