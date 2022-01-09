package com.kulesh.mygson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kulesh.mygson.model.User;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void GsonToObject(View view) {
        String jsonString="{\"id\":2 , \"name\":\"Kulesh\" , \"mobile\" : \"0723445567\"}";
        Gson gson=new Gson();
        User u=gson.fromJson(jsonString,User.class);
        TextView tv=findViewById(R.id.txt);
        tv.setText(u.getId()+" "+u.getName()+" "+u.getMobile());
    }

    public void GsontoStingArray(View view) {
        String jsonString="[\"A\",\"B\",\"C\"]";
        Gson gson=new Gson();
        String []a=gson.fromJson(jsonString,String[].class);
        TextView tv=findViewById(R.id.txt);
        tv.setText(a[0]+" "+a[1]+" "+a[2]);
    }

    public void GSONToArrayList(View view) {
        String jsonString = "[{\"id\":1,\"mobile\":\"0712344567\",\"name\":\"Kulesh\"},{\"id\":2,\"mobile\":\"0712344568\",\"name\":\"Alex\"},{\"id\":3,\"mobile\":\"0712344566\",\"name\":\"Jack\"}]";
Gson gson=new Gson();
        TypeToken<ArrayList<User>>t1=new TypeToken<ArrayList<User>>(){};
        ArrayList<User> a=gson.fromJson(jsonString,t1.getType());
        for(User uw:a){
            TextView tv=findViewById(R.id.txt);
            tv.setText(uw.getId()+" "+uw.getName()+" "+uw.getMobile());
        }

    }
}