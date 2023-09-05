package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleMenuMainActivity;

public class End_nosave_nogun extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_nosave_nogun);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable love_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.love_memory);
        Drawable old_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.sad_memory);
        Drawable fire_house = KWResourceUtils.getDrawableByResourceId(this, R.drawable.fire_house);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(this, R.drawable.hotel);
        KWFullScreenEventModel event = new KWFullScreenEventModel("約瑟警官\n" +
                "不….\n" +
                "應該是說殺人魔H終於玩膩了\n" +
                "他要結束這場已經讓他感到厭煩的遊戲\n" +
                "要用他熟悉的地道與無處不在的針孔來狩獵\n" +
                "砰!砰!砰!\n" +
                "隨著幾聲槍響\n" +
                "旅館內寂靜的只剩下約瑟興奮的心跳聲\n" +
                "他手上沾滿鮮血的雙手拿著一張相片\n" +
                "那張相片中\n" +
                "年幼的他與他的BR舅舅提著一隻鹿\n" +
                "臉上的笑容跟現在是多麼相似…\n" +
                "…\n").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.bgm_mystery);

        eventManager.addEvent(event);

        eventManager.play("屠殺結局");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        Intent intent = new Intent();
        intent.setClass(End_nosave_nogun.this, SampleMenuMainActivity.class);
        startActivity(intent);

    }
}