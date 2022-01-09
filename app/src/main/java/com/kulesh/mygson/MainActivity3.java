package com.kulesh.mygson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kulesh.mygson.model.User;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void objectToJson(View view) {
        User user=new User(1,"Kulesh","0773562890");
        GsonBuilder gb=new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson=gb.create();
        String jsonString=gson.toJson(user);
        TextView tv=findViewById(R.id.txt);
        tv.setText(jsonString);
    }

    public void ArrayToGson(View view) {
        String s[]=new String[3];
        s[0]="Kulesh";
        s[1]="COCA COLA";
        s[2]="Burgers";
        Gson gson=new Gson();
        String jsonString=gson.toJson(s);
        TextView tv=findViewById(R.id.txt);
        tv.setText(jsonString);
    }

    public void stringtoGson(View view) {
        User user1=new User(1,"Kulesh","0773562890");
        User user2=new User(4,"Alex","0747862890");
        User user3=new User(7,"Paolini","067022890");
        User[]ulist=new User[3];
        ulist[0]=user1;
        ulist[1]=user2;
        ulist[2]=user3;
        Gson gson=new Gson();
        String jsonString=gson.toJson(ulist);
        TextView tv=findViewById(R.id.txt);
        tv.setText(jsonString);
    }

    public void Array2ToJson(View view) {
        User user1=new User(1,"Kulesh","0773562890");
        User user2=new User(4,"Alex","0747862890");
        User user3=new User(7,"Paolini","067022890");
        ArrayList<User>ulist=new ArrayList<User>();
        ulist.add(user1);
        ulist.add(user2);
        ulist.add(user3);
        Gson gson=new Gson();
        String jsonString=gson.toJson(ulist);
        TextView tv=findViewById(R.id.txt);
        tv.setText(jsonString);
    }
}