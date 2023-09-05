package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.utility.KWScreenUtils;
import tw.edu.scu.avgexample.sample.SampleGlobalData;
import tw.edu.scu.avgexample.sample.SampleScene_6_Activity;
import tw.edu.scu.avgexample.sample.SampleScene_6_Utils;
import tw.edu.scu.avgexample.sample.SampleScene_7_Activity;

public class MyStory_room_insure extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story_room_insure);
        initializeBmiFeature();
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_room_insure_Utils.scene_1_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);

        if ( "答對".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_4.class);
        }
    }


    private void initializeBmiFeature() {


        final Button button_0 = findViewById(R.id.button_0);
        final Button button_1 = findViewById(R.id.button_1);
        final Button button_2 = findViewById(R.id.button_2);
        final Button button_3 = findViewById(R.id.button_3);
        final Button button_4 = findViewById(R.id.button_4);
        final Button button_5 = findViewById(R.id.button_5);
        final Button button_6 = findViewById(R.id.button_6);
        final Button button_7 = findViewById(R.id.button_7);
        final Button button_8 = findViewById(R.id.button_8);
        final Button button_9 = findViewById(R.id.button_9);
        final Button button_clear = findViewById(R.id.button_clear);
        final Button button_enter = findViewById(R.id.button_enter);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"0");
            }

        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"1");
            }

        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"2");
            }

        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"3");
            }

        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"4");
            }

        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"5");
            }

        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"6");
            }

        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"7");
            }

        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"8");
            }

        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                show.setText(text+"9");
            }

        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                if(text.length()> 0){
                show.setText(text.substring(0, text.length()-1));}
            }

        });
        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView show = findViewById(R.id.show);
                String text =show.getText().toString();
                int a = Integer.parseInt(text);
                if (a == 4252){
                    correct();
                }
                else{
                    show.setText("");
                    wrong();
                }
            }

        });
    }



    private void correct() {

        MyStory_room_insure_Utils.scene_1_2(this, this.eventManager);
    }
    private void wrong() {

        MyStory_room_insure_Utils.scene_1_3(this, this.eventManager);
    }
}