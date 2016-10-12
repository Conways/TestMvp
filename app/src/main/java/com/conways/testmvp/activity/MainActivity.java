package com.conways.testmvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.conways.testmvp.Presenter.MainActivityPresenter;
import com.conways.testmvp.R;
import com.conways.testmvp.View.MainView;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {
    private EditText etId;
    private EditText etName;
    private EditText etSex;
    private EditText etAge;
    private Button btGo;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        etId = (EditText) this.findViewById(R.id.infor_id);
        etName = (EditText) this.findViewById(R.id.infor_name);
        etSex = (EditText) this.findViewById(R.id.infor_sex);
        etAge = (EditText) this.findViewById(R.id.infor_age);
        btGo = (Button) this.findViewById(R.id.infor_commit);
        btGo.setOnClickListener(this);
        presenter = new MainActivityPresenter(this);
    }

    @Override
    public Long getId() {
        return Long.valueOf(etId.getText().toString());
    }

    @Override
    public String getName() {
        return etName.getText().toString();
    }

    @Override
    public String getSex() {
        return etSex.getText().toString();
    }

    @Override
    public int getAge() {
        return Integer.valueOf(etAge.getText().toString());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.infor_commit:
                presenter.toTargetActivity(this);
                break;
            default:
                break;
        }
    }
}
