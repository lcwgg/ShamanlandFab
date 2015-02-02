package fab.lcw.com.shamanlandfab.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shamanland.fab.ShowHideOnScroll;

import fab.lcw.com.shamanlandfab.R;
import fab.lcw.com.shamanlandfab.adapter.MyAdapter;

/**
 * Created by laetitia on 1/28/15.
 */
public class RecyclerViewAndFabFragment extends Fragment {

    public final static String TAG = "RecyclerViewAndFabFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view_and_fab_fragment_main, container, false);
        setData(rootView);
        return rootView;
    }

    public void setData(View v) {
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setOnTouchListener(new ShowHideOnScroll(v.findViewById(R.id.button1), R.anim.button_show, R.anim.button_hide));
    }
}
