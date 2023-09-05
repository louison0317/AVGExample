package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;

public class MyStory_Second_day extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story__second_day);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_Second_day_Utils.scene_2_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        if ( "發現屍體".equals(eventIdentifier)) {
            MyStory_Second_day_Utils.scene_2_2(this, this.eventManager);
        }
        else if( "停車場".equals(eventIdentifier)) {
            switchSceneActivity(MyStory_room.class);
        }
        else if( "大廳鬧劇".equals(eventIdentifier)) {
            //MyStory_Second_day_Utils.scene_2_4(this, this.eventManager);
        }

    }
}