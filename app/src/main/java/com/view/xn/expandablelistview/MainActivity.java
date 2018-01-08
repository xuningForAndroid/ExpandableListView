package com.view.xn.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestForData();
    }

    private void requestForData() {
        ArrayList<HashMap<String, String>> datas = new ArrayList<HashMap<String,String>>();
        for(int i = 1; i <= 10; i++){
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("phoneType", "HW-Mate" + i + "");
            item.put("discount", "8");
            item.put("price", (3000 + i) + "");
            item.put("time", "20171101" + i);
            item.put("num", (3000 - i) + "");
            datas.add(item);
        }

        ListView lvProduct =  findViewById(R.id.lv_products);
        ExpandListAdapter adapter = new ExpandListAdapter(this, datas);
        lvProduct.setAdapter(adapter);
    }
}
