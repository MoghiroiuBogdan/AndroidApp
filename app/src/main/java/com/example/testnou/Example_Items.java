package com.example.testnou;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Example_Items implements Parcelable {
    private int mImageResource;

    public Example_Items(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    protected Example_Items(Parcel in) {
        mImageResource = in.readInt();
    }

    public static final Creator<Example_Items> CREATOR = new Creator<Example_Items>() {
        @Override
        public Example_Items createFromParcel(Parcel in) {
            return new Example_Items(in);
        }

        @Override
        public Example_Items[] newArray(int size) {
            return new Example_Items[size];
        }
    };

    public int getmImageResource() {
        return mImageResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(mImageResource);
    }
}
