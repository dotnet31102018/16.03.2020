package hello.itay.com.demo3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    public static final String MAIN_ACTIVITY2_KEY_QUERY_PARAM = "MAIN_ACTIVITY_KEY_QUERY_PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button openBtn = findViewById(R.id.openbtn);
        final EditText edit = findViewById(R.id.searchET);

        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getBaseContext(), MainActivity.class);
                //intent.putExtra(MAIN_ACTIVITY2_KEY_QUERY_PARAM, edit.getText().toString());

                //Intent intent = new Intent(getBaseContext(), MainActivity.class);
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:05055555"));
                startActivity(intent);
            }
        });
    }
}
