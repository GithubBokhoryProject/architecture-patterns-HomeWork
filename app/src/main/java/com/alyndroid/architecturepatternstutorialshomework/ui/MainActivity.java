package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alyndroid.architecturepatternstutorialshomework.Model.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.Model.NumberModel;
import com.alyndroid.architecturepatternstutorialshomework.R;

public class MainActivity extends AppCompatActivity implements MovieView {
TextView txt_plus,txt_div,txt_mult;
DataBase dataBase;
Presenter presenter;
NumberViewModel numberViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_plus=findViewById(R.id.plus_result_textView);
        txt_div=findViewById(R.id.div_result_textView);
        txt_mult=findViewById(R.id.mul_result_textView);
        dataBase=new DataBase();
        presenter=new Presenter(this);
        numberViewModel= ViewModelProviders.of(this).get(NumberViewModel.class);
       numberViewModel.numberMutableLiveData.observe(this, new Observer<Integer>() {
           @Override
           public void onChanged(Integer integer) {
               txt_mult.setText(String.valueOf(integer));
           }
       });

    }
//plus from MVC
    public void btn_plus(View view) {
        double num1=dataBase.getNumbers().getFirstNum();
        double num2=dataBase.getNumbers().getSecondNum();
        double sum=num1+num2;
        txt_plus.setText(String.valueOf(sum));
    }
//dvi from MVP
    public void btn_div(View view) {
        presenter.getDivNumbers();
    }
    @Override
    public void onGetSumNumbers(double div){
       txt_div.setText(String.valueOf(div));
    }
//mult from MVVM
    public void btn_mult(View view) {
        numberViewModel.getMultNumbers();
    }
}
