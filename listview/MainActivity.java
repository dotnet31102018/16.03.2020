package hello.itay.com.demo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X",
            "Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lv = findViewById(R.id.mobileLV);
        //ArrayAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobileArray);
        ArrayAdapter myAdapter = new ArrayAdapter<String>(this, R.layout.listview_item,  R.id.tv1, mobileArray);

        lv.setAdapter(myAdapter);

        lv.setClickable(true);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv = view.findViewById(R.id.tv1);
                //Toast.makeText(getBaseContext(), tv.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), mobileArray[i], Toast.LENGTH_SHORT).show();
            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "long " + mobileArray[i], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
