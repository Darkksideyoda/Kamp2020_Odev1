package com.example.odev_app;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

public class ogrenci implements Parcelable {
    String ogrNo;
    String ogrTc;
    //public static final String controlNumber = "1234";



    public ogrenci(String ogrNo, String ogrTc) {
        this.ogrNo = ogrNo;
        this.ogrTc = ogrTc;
    }

    protected ogrenci(Parcel in) {
        ogrNo = in.readString();
        ogrTc = in.readString();
    }

    public static final Creator<ogrenci> CREATOR = new Creator<ogrenci>() {
        @Override
        public ogrenci createFromParcel(Parcel in) {
            return new ogrenci(in);
        }

        @Override
        public ogrenci[] newArray(int size) {
            return new ogrenci[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ogrNo);
        dest.writeString(ogrTc);
    }
}
