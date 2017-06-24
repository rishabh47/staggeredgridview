package rishabh.staggeredview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3,1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
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
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this,"Rishabh selected",Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.action) {
            return true;
        }
        if(id==R.id.xyz) {
            finish();
        }


        return super.onOptionsItemSelected(item);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Alkane", R.drawable.abc,"description here"));
        listViewItems.add(new ItemObjects("Ethane", R.drawable.pqr,"description here" ));
        listViewItems.add(new ItemObjects("Alkyne", R.drawable.qwerty,"description here"));
        listViewItems.add(new ItemObjects("Benzene",R.drawable.one,"description here"));
        listViewItems.add(new ItemObjects("Amide", R.drawable.five,"description here"));
        listViewItems.add(new ItemObjects("Amino Acid", R.drawable.six,"description here"));
        listViewItems.add(new ItemObjects("Phenol", R.drawable.maserati,"description here"));
        listViewItems.add(new ItemObjects("Carbonxylic",R.drawable.pqr,"description here"));
        listViewItems.add(new ItemObjects("Nitril", R.drawable.abc,"description here"));
        listViewItems.add(new ItemObjects("Ether", R.drawable.qwerty,"description here"));
        listViewItems.add(new ItemObjects("Ester", R.drawable.maserati,"description here"));
        listViewItems.add(new ItemObjects("Alcohol",R.drawable.two,"description here"));

        return listViewItems;
    }
}