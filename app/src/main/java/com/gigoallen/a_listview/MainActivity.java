package com.gigoallen.a_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lstLOL;
    static String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstLOL = findViewById(R.id.lstLOL);

        ArrayAdapter<CharSequence> adapterLOL = ArrayAdapter.createFromResource(this, R.array.arrayLol, android.R.layout.simple_list_item_1);

        lstLOL.setAdapter(adapterLOL);

        lstLOL.setOnItemClickListener(lstListener);

    }

    private ListView.OnItemClickListener lstListener =
            new ListView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    msg = adapterView.getItemAtPosition(i).toString();
                    msg += " , 我的LOL位置";
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            };
}
