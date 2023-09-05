package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.utility.KWLog;

public class MyStory_baseroom extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story_baseroom);
        initializeBmiFeature();

    }
    //覆寫上層的事件初始化Method
    //建立這個場景預設的事件合集吧！
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        MyStory_base_room_Utils.scene_1_1(this, this.eventManager);
    }
    //當有任意事件合集完成之後，根據完成的事件合集識別碼來決定下一個事件合集要播放的是哪一個（或是其它要做的事情）
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        if ( "救".equals(eventIdentifier)) {
            MyStory_base_room_Utils.scene_1_5(this, this.eventManager);
        }
        else if ( "不救".equals(eventIdentifier)) {
            switchSceneActivity(End_nosave.class);
        }

    }
    private void initializeBmiFeature() {


        Button button_box = findViewById(R.id.button_box);



        button_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_box();
            }
        });

    }


    private void button_box() {
        MyStory_base_room_Utils.scene_1_2(this, this.eventManager);
    }
    @Override
    protected void onOptionSelected (String identifier, int index){
        super.onOptionSelected(identifier, index);

        if ("打開保險箱選項".equals(identifier)) {

            switch (index) {
                case 0:
                    MyStory_base_room_Utils.scene_1_4(this, this.eventManager);
                    break;
                case 1:
                    MyStory_base_room_Utils.scene_1_3(this, this.eventManager);
                    break;
            }

        } else {
            KWLog.d("無法識別的選項代號");
        }
        if ("精神病1選項".equals(identifier)) {

            switch (index) {
                case 0:
                    switchSceneActivity(End_mad.class);
                    break;
                case 1:
                    MyStory_base_room_Utils.scene_1_6(this, this.eventManager);
                    break;
            }

        } else {
            KWLog.d("無法識別的選項代號");
        }
        if ("精神病2選項".equals(identifier)) {

            switch (index) {
                case 0:
                    switchSceneActivity(End_mad.class);
                    break;
                case 1:
                    switchSceneActivity(End_save.class);
                    break;
            }

        } else {
            KWLog.d("無法識別的選項代號");
        }
    }
}