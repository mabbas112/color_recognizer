package com.example.color_recognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onPinkBtn(View view){
        colorSelected("PINK");
        setColor(255,20,147);
    }
    public void onBlueBtn(View view){
        colorSelected("BLUE");
        setColor(0,0,205);
    }
    public void onBrownBtn(View view){
        colorSelected("BROWN");
        setColor(58,0,29);
    }
    public void onBlackBtn(View view){
        colorSelected("BLACK");
        setColor(0,0,0);
    }
    public void onYellowBtn(View view){
        colorSelected("YELLOW");
        setColor(200,200,0);
    }
    public void onRedBtn(View view){
        colorSelected("RED");
        setColor(205,0,0);
    }
    public void onOrangeBtn(View view){
        colorSelected("ORANGE");
        setColor(255,165,0);
    }
    public void onGreenBtn(View view){
        colorSelected("GREEN");
        setColor(0,205,0);
    }
    public void onPurpleBtn(View view){
        colorSelected("PURPLE");
        setColor(128,0,128);
    }

    public void colorSelected(String color){
        TextView msg=findViewById(R.id.randomColorPicker);
        msg.setText("Yahoo! you selected the "+ color +" color");
    }
    public void setColor(int r, int g, int b){
        TextView msg=findViewById(R.id.randomColorPicker);
        msg.setTextColor(Color.rgb(r,g,b));
    }


}