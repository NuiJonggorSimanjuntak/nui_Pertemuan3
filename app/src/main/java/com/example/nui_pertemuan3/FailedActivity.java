package com.example.nui_pertemuan3;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class FailedActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failed);
        TextView namaUserTV = (TextView) findViewById(R.id.textView2);
        String userName = getIntent().getExtras().getString("namaUser");
        namaUserTV.setText(userName);
        findViewById(R.id.kembaliButton).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_failed, menu);
        return true;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.kembaliButton:
                finish();
        }
    }
}
