package com.conways.testmvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.conways.testmvp.Model.Data;
import com.conways.testmvp.R;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        TextView textView=(TextView)this.findViewById(R.id.textView);
        Data data=getIntent().getExtras().getParcelable("data");
        if (data==null)
            return;
        textView.setText(data.toString());
    }
}
