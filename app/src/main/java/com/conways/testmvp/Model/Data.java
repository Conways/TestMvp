package com.conways.testmvp.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by John on 2016/10/12.
 */
public class Data implements Parcelable {

    private Long id;
    private int age;
    private int sex;
    private String name;


    public Data() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeInt(this.age);
        dest.writeInt(this.sex);
        dest.writeString(this.name);
    }

    protected Data(Parcel in) {
            this.id = (Long) in.readValue(Long.class.getClassLoader());
            this.age = in.readInt();
            this.sex = in.readInt();
            this.name = in.readString();
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel source) {
            return new Data(source);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };
}
