package moffa.nick.mygifts.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomListAdapter extends ArrayAdapter<String>{

    public CustomListAdapter(Context context, int resource, String[] objects){
        super(context, resource, objects);
    }
}
