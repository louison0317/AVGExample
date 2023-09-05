package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.framework.utility.KWScreenUtils;
import tw.edu.scu.avgexample.sample.SampleGlobalData;
import tw.edu.scu.avgexample.sample.SampleScene_6_Activity;
import tw.edu.scu.avgexample.sample.SampleScene_6_Utils;
import tw.edu.scu.avgexample.sample.SampleScene_7_Activity;

public class MyStory_room extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //設定好對應的Layout檔案
        setContentView(R.layout.activity_my_story_room);
        initializeBmiFeature();

    }

    //覆寫上層的事件初始化Method
    //建立這個場景預設的事件合集吧！
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_room_Utils.scene_1_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);

        if( "信".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_room_insure.class);
        }
    }


    private void initializeBmiFeature() {


        final Button button_computer = findViewById(R.id.button_computer);
        final Button button_paper = findViewById(R.id.button_paper);
        final Button button_insure = findViewById(R.id.button_insure);


        button_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_computer();
            }
        });
        button_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_paper();
            }
        });
        button_insure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_insure();
            }
        });
    }


    private void button_computer() {
        MyStory_room_Utils.scene_1_2(this, this.eventManager);
    }
    private void button_paper() {
        MyStory_room_Utils.scene_1_3(this, this.eventManager);
    }
    private void button_insure() {
        MyStory_room_Utils.scene_1_4(this, this.eventManager);
    }



}