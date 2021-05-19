package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.Model.DataBase;

public class NumberViewModel extends ViewModel {
    MutableLiveData<Integer> numberMutableLiveData=new MutableLiveData<>();
    DataBase dataBase=new DataBase();
    public void getMultNumbers(){
     int num1=dataBase.getNumbers().getFirstNum();
     int num2=dataBase.getNumbers().getSecondNum();
     int result=num1 * num2;
     numberMutableLiveData.setValue(result);
    }

}
