package com.prototype.iasjem.bmicalculator;

import android.content.Context;

public class BMICategory {

    public String getCategory(Context m, double result) {
        String category;
        if (result < 15) {
            category = m.getString(R.string.m1);
        } else if (result >= 15 && result <= 16) {
            category = m.getString(R.string.m2);
        } else if (result > 16 && result <= 18.5) {
            category = m.getString(R.string.m3);
        } else if (result > 18.5 && result <= 25) {
            category = m.getString(R.string.m4);
        } else if (result > 25 && result <= 30) {
            category = m.getString(R.string.m5);
        } else if (result > 30 && result <= 35) {
            category = m.getString(R.string.m6);
        } else if (result > 35 && result <= 40) {
            category = m.getString(R.string.m7);
        } else {
            category = m.getString(R.string.m8);
        }
        return category;
    }

}
