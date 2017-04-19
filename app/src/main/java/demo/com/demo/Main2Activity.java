package demo.com.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity  {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_coor);
        System.out.println("ghcghfcv");
        lv= (ListView) findViewById(R.id.lv);
        ArrayList<String> arrayList=new ArrayList();
        for (int i = 0; i < 100; i++) {
            arrayList.add("abc");
        }

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);
        setListViewHeightBasedOnChildren(lv);


    }

    public static void setListViewHeightBasedOnChildren(final ListView listView) {
        listView.post(new Runnable() {
            @Override
            public void run() {
                ListAdapter listAdapter = listView.getAdapter();
                if (listAdapter == null) {
                    return;
                }
                int totalHeight = listView.getPaddingTop() + listView.getPaddingBottom();
                int listWidth = listView.getMeasuredWidth();
                for (int i = 0; i < listAdapter.getCount(); i++) {
                    View listItem = listAdapter.getView(i, null, listView);
                    listItem.measure(
                            View.MeasureSpec.makeMeasureSpec(listWidth, View.MeasureSpec.EXACTLY),
                            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));


                    totalHeight += listItem.getMeasuredHeight();
                    Log.d("listItemHeight" + listItem.getMeasuredHeight(), "___________");
                }
                ViewGroup.LayoutParams params = listView.getLayoutParams();
                params.height = (int) ((totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1))));
                listView.setLayoutParams(params);
                listView.requestLayout();

            }
        });
    }







}
