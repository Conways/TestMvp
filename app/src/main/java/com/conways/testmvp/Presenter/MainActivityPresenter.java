package com.conways.testmvp.Presenter;

import android.content.Intent;

import com.conways.testmvp.Model.Data;
import com.conways.testmvp.View.MainView;
import com.conways.testmvp.activity.MainActivity;
import com.conways.testmvp.activity.TargetActivity;

/**
 * Created by Conways on 2016/10/12.
 */
public class MainActivityPresenter {


    private MainView mainView;


    public MainActivityPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void toTargetActivity(MainActivity context) {
        Data data = new Data();
        data.setId(mainView.getId());
        data.setName(mainView.getName());
        data.setSex(mainView.getSex().equals("男") ? 0 : 1);
        data.setAge(mainView.getAge());
        Intent intent=new Intent();
        intent.setClass(context, TargetActivity.class);
        intent.putExtra("data",data);
        context.startActivity(intent);
    }


}
