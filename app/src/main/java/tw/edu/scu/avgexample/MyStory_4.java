package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWLog;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import tw.edu.scu.avgexample.R;
import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.sample.SampleEndScene_1_Activity;
import tw.edu.scu.avgexample.sample.SampleScene_2_Utils;

public class MyStory_4 extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story_4);
    }

    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_4_Utils.scene_1_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        if ( "不藏槍".equals(eventIdentifier)) {
            MyStory_4_Utils.scene_1_4(this, this.eventManager);
        }
        else if( "藏槍".equals(eventIdentifier)) {
            MyStory_4_Utils.scene_1_5(this, this.eventManager);
        }
        else if( "不藏槍的討論".equals(eventIdentifier)) {
            MyStory_4_Utils.scene_1_6(this, this.eventManager);
        }
        else if( "藏槍的討論".equals(eventIdentifier)) {
            MyStory_4_Utils.scene_1_7(this, this.eventManager);
        }
        else if( "警察到來_不藏槍".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_base_room_nogun.class);
        }
        else if( "警察到來_藏槍".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_baseroom.class);
        }


    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);

        if ("打開保險箱選項".equals(identifier)) {

            switch (index) {
                case 0:
                    MyStory_4_Utils.scene_1_2(this, this.eventManager);
                    break;
                case 1:
                    MyStory_4_Utils.scene_1_3(this, this.eventManager);
                    break;
            }

        } else {
            KWLog.d("無法識別的選項代號");
        }
    }
}