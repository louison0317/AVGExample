package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleMenuMainActivity;

public class End_mad extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_mad);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable love_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.love_memory);
        Drawable old_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.sad_memory);
        Drawable fire_house = KWResourceUtils.getDrawableByResourceId(this, R.drawable.fire_house);
        Drawable mad = KWResourceUtils.getDrawableByResourceId(this, R.drawable.mad);
        KWFullScreenEventModel event = new KWFullScreenEventModel("暴風雨過後\n" +
                "你隨著約瑟警官到了警局\n" +
                "承認了所有的罪刑\n" +
                "在約瑟的極力爭取下\n" +
                "你免除死刑但終生只能在精神病院中度過\n" +
                "所有認識的人只剩下約瑟會來看你\n" +
                "這天他沒有如往常來看你\n" +
                "但寄了一封信給你\n" +
                "你不記得內容是什麼了…\n" +
                "你只是瞪大了眼睛死死的盯著結尾署名的H\n" +
                "你不停大喊著要見院長\n" +
                "四處的宣洩著怒火\n" +
                "但不論說什麼都不會有人相信你了…\n").setBackgroundDrawable(mad).setBackgroundMusicResouceId(R.raw.bgm_mystery);

        eventManager.addEvent(event);

        eventManager.play("精神病院結局");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        Intent intent = new Intent();
        intent.setClass(End_mad.this, SampleMenuMainActivity.class);
        startActivity(intent);

    }
}