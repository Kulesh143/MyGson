package com.kulesh.mygson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kulesh.mygson.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ObjectToArray(View view) {
        User u=new User(1,"Kulesh","0773562890");
        GsonBuilder gb=new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson=gb.create();
        String jsonString=gson.toJson(u);
        TextView tx=findViewById(R.id.txt);
        tx.setText(jsonString);
    }

    public void ArraytoGson(View view) {
        String s[]=new String[3];
        s[0]="Kulesh";
        s[1]="Coca Cola";
        s[2]="Pizza";
        Gson json=new Gson();
        String jsonString=json.toJson(s);
        TextView tx=findViewById(R.id.txt);
        tx.setText(jsonString);
    }

    public void ObjectToArrayTwo(View view) {
        User u=new User(1,"Kulesh","0773562890");
        User u1=new User(4,"ALex","077342890");
        User u2=new User(7,"Johnny","0756782890");
        User[]ulist=new User[3];
        ulist[0]=u;
        ulist[1]=u1;
        ulist[2]=u2;
        Gson gson=new Gson();
        String jsonString=gson.toJson(ulist);
        TextView tx=findViewById(R.id.txt);
        tx.setText(jsonString);
    }

    public void ArraylistToGson(View view) {
        User u=new User(1,"Kulesh","0773562890");
        User u1=new User(4,"ALex","077342890");
        User u2=new User(7,"Johnny","0756782890");
        ArrayList<User>ulist=new ArrayList<>();
        ulist.add(u);
        ulist.add(u1);
        ulist.add(u2);
        Gson g=new Gson();
        String jsonString=g.toJson(ulist);
        TextView tx=findViewById(R.id.txt);
        tx.setText(jsonString);
    }

    public void Clear(View view) {
        TextView tx=findViewById(R.id.txt);
        tx.setText("");
    }
}