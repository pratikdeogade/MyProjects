package demo.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_coor);
        System.out.println("ghcghfc");
        lv= (ListView) findViewById(R.id.lv);
        ArrayList<String> arrayList=new ArrayList();
        for (int i = 0; i < 100; i++) {
            arrayList.add("abc");

        }

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);
    }



}
