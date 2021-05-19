package com.alyndroid.architecturepatternstutorialshomework.Model;

import com.alyndroid.architecturepatternstutorialshomework.Model.NumberModel;

public class DataBase {
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
