package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleMenuMainActivity;

public class End_nosave extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_nosave);
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
                "砰!砰!砰!...崩!\n" +
                "一個不協調的音符突兀的打亂原本的樂曲\n" +
                "沉浸在狩獵的約瑟沒有想到\n" +
                "逃到最後的那隻鹿\n" +
                "居然擁有致命的鋒利鹿角\n" +
                "手上的槍讓你擁有了反擊能力\n" +
                "現在開始\n" +
                "獵人與獵物的身份不停轉換\n" +
                "隨著兩種槍聲不停的起落\n" +
                "你獲得最後的勝利\n" +
                "但是大腿上的彈孔讓你留下了終身的殘疾\n" +
                "你不禁後悔如果你能早點發現約瑟的異常…\n").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.bgm_mystery);

        eventManager.addEvent(event);

        eventManager.play("身障結局");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        Intent intent = new Intent();
        intent.setClass(End_nosave.this, SampleMenuMainActivity.class);
        startActivity(intent);

    }
}