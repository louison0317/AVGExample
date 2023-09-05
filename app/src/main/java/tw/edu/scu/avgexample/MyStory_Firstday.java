package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleScene_1_Utils;
import tw.edu.scu.avgexample.sample.SampleScene_2_Activity;
import tw.edu.scu.avgexample.sample.SampleScene_7_Utils;

public class MyStory_Firstday extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story__firstday);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_Firstday_Utils.scene_1_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        if ( "進入旅館".equals(eventIdentifier)) {
            MyStory_Firstday_Utils.scene_1_2(this, this.eventManager);
        }
        else if( "進入房間".equals(eventIdentifier)) {
            MyStory_Firstday_Utils.scene_1_3(this, this.eventManager);
        }
        else if( "大廳鬧劇".equals(eventIdentifier)) {
            MyStory_Firstday_Utils.scene_1_4(this, this.eventManager);
        }
        else if( "矛盾種子".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_Second_day.class);
        }


    }
}