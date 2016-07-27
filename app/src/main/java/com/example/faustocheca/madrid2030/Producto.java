package com.example.faustocheca.madrid2030;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by faustocheca on 28/4/16.
 */
public class Producto implements Parcelable {

    String name;
    String description;
    String price;




    public Producto(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;

    }

    protected Producto(Parcel in) {
        name = in.readString();
        description = in.readString();
        price = in.readString();

    }

    public static final Creator<Producto> CREATOR = new Creator<Producto>() {
        @Override
        public Producto createFromParcel(Parcel in) {
            return new Producto(in);
        }

        @Override
        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    public String getPrice() {
        return price;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(price);

    }

    @Override

    // OJO no está foto1

    public String toString() {
        return getName()+" "+ getDescription()+" "+ getPrice();
    }
}
