package com.alyndroid.architecturepatternstutorialshomework.ui;

import com.alyndroid.architecturepatternstutorialshomework.Model.DataBase;

public class Presenter {
MovieView view;

    public Presenter(MovieView view) {
        this.view = view;
    }
    DataBase dataBase=new DataBase();
    public void getDivNumbers(){
        double num1=dataBase.getNumbers().getFirstNum();
        double num2=dataBase.getNumbers().getSecondNum();
        double div=num1/num2;
     view.onGetSumNumbers(div);
    }
}
