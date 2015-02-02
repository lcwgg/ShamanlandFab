package fab.lcw.com.shamanlandfab;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import fab.lcw.com.shamanlandfab.fragment.FabFragment;
import fab.lcw.com.shamanlandfab.fragment.RecyclerViewAndFabFragment;


public class MainActivity extends Activity {

    private Fragment mCurrentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            mCurrentFragment = new FabFragment();
            getFragmentManager().beginTransaction()
                    .add(R.id.container, mCurrentFragment, FabFragment.TAG)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        final int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.listview && !(mCurrentFragment instanceof RecyclerViewAndFabFragment)) {
                mCurrentFragment = getFragmentManager().findFragmentByTag(RecyclerViewAndFabFragment.TAG);
                if (mCurrentFragment == null) {
                    mCurrentFragment = new RecyclerViewAndFabFragment();
                }

        } else if (id == R.id.simple_fab && !(mCurrentFragment instanceof FabFragment)) {
            mCurrentFragment = getFragmentManager().findFragmentByTag(FabFragment.TAG);
            if (mCurrentFragment == null) {
                mCurrentFragment = new FabFragment();
            }
        }
        getFragmentManager().beginTransaction()
                .replace(R.id.container, mCurrentFragment)
                .commit();

        return super.onOptionsItemSelected(item);
    }

}
