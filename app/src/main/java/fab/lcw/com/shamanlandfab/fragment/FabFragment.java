package fab.lcw.com.shamanlandfab.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fab.lcw.com.shamanlandfab.R;

/**
 * Created by laetitia on 1/28/15.
 */
public class FabFragment extends Fragment {

    public final static String TAG = "FabFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fab_fragment_main, container, false);
        return rootView;
    }

}
