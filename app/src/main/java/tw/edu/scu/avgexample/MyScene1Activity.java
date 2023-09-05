package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

public class MyScene1Activity extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_scene1);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        eventManager.stop();
        Drawable background = KWResourceUtils.getDrawableByResourceId(this, R.drawable.kw_background_001);
        Drawable background2 = KWResourceUtils.getDrawableByResourceId(this, R.drawable.hotel);
        KWFirstPersonEventModel event = new KWFirstPersonEventModel("王大明", "我的第一支AVG遊戲對話框 ").setBackgroundDrawable(background);
        KWFirstPersonEventModel event1 = new KWFirstPersonEventModel("王大明", "e04 ");
        KWFirstPersonEventModel event2 = new KWFirstPersonEventModel("王大明", "33 ").setBackgroundDrawable(background2);
        KWFirstPersonEventModel event3 = new KWFirstPersonEventModel("王大明", "33334444 ");
        eventManager.addEvent(event);
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.play("我的第一個事件");
    }
}