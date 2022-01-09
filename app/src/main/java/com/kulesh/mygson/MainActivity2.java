package com.kulesh.mygson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kulesh.mygson.model.User;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void gtoO(View view) {
        String jsonString="{\"id\":2 , \"username\":\"Lakshani\" , \"mobile\" : \"0723445567\"}";
        Gson gson=new Gson();
        User u=gson.fromJson(jsonString,User.class);
        TextView tv=findViewById(R.id.txt);
        tv.setText(u.getId()+" "+u.getMobile()+" "+u.getName());
    }

    public void gsona(View view) {
        String jsonString="[\"A\",\"B\",\"C\"]";
        Gson gson=new Gson();
        String s[]=gson.fromJson(jsonString,String[].class);
        TextView tv=findViewById(R.id.txt);
        tv.setText(s[0]+s[1]+s[2]);
    }

    public void gotoArr(View view) {
        String jsonString = "[{\"id\":1,\"mobile\":\"0712344567\",\"username\":\"Thili\"},{\"id\":2,\"mobile\":\"0712344568\",\"username\":\"Tharu\"},{\"id\":3,\"mobile\":\"0712344566\",\"username\":\"Sachi\"}]";
     Gson gson=new Gson();
     User u[]=gson.fromJson(jsonString,User[].class);
        TypeToken<ArrayList<User>>t1=new TypeToken<ArrayList<User>>(){};
        ArrayList<User> ue=gson.fromJson(jsonString,t1.getType());
        for (User user:ue){
            TextView tv=findViewById(R.id.txt);
            tv.setText(user.getId()+" "+user.getName()+" "+user.getMobile());
        }

    }
    public void Clear(View view) {
        TextView tx=findViewById(R.id.txt);
        tx.setText("");
    }
}