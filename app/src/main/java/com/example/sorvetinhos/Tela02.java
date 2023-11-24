package com.example.sorvetinhos;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;
public class Tela02 extends AppCompatActivity {
    String listpreco[]={"10.00", "11.00", "12.00", "14.00" };
    int listImages[]={R.drawable.sor_chiclete,
            R.drawable.sor_chocolate,
            R.drawable.sor_menta,
            R.drawable.sor_morango};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
        listView=(ListView) findViewById(R.id.listView1);
        AdapImg adap= new AdapImg(getApplicationContext(), listpreco,
                listImages);
        listView.setAdapter(adap);
    }
}