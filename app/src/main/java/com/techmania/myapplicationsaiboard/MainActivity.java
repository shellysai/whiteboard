package com.techmania.myapplicationsaiboard;

import me.panavtec.drawableview.DrawableView;
import me.panavtec.drawableview.DrawableViewConfig;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    DrawableView drawableView;
    Button up ,down,change, undo;
    DrawableViewConfig config;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawableView= (DrawableView) findViewById(R.id.paintview);
        up=(Button)findViewById(R.id.buttonUp);
        down=(Button)findViewById(R.id.butndown);
        change=(Button)findViewById(R.id.butnColor);
        undo=(Button)findViewById(R.id.butnundo);
        config=new DrawableViewConfig();
        int black = android.R.color.black;
        config.setStrokeColor(getResources().getColor(black));
                config.setShowCanvasBounds(true);
        config.setMinZoom(1.0f);
        config.setMaxZoom(3.0f);
        config.setCanvasHeight(1080);
        config.setCanvasWidth(1920);
        drawableView.setConfig(config);
        up.setOnClickListener(new View.OnClickListener()
    {
       public void onClick(View v)
        { config.setStrokeWidth(config.getCanvasWidth() + 10);



        }});



        down.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            { config.setStrokeWidth(config.getCanvasWidth() - 10);



            }});




        change.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Random random =new Random();
                config.setStrokeColor(Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt()));



            }});


        undo.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                drawableView.undo();



            }});



        
        
        
        
        
        





    }
}