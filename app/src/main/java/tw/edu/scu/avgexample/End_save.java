package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleMenuMainActivity;

public class End_save extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_save);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable love_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.love_memory);
        Drawable old_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.sad_memory);
        Drawable fire_house = KWResourceUtils.getDrawableByResourceId(this, R.drawable.fire_house);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(this, R.drawable.hotel);
        KWFullScreenEventModel event = new KWFullScreenEventModel("慢慢在約瑟警官的談話中感到不對勁的你\n" +
                "緩緩將手伸向腰後的手槍\n" +
                "你回想起在旅館主人房間內看到的那封信…\n" +
                "跟約瑟警官的筆錄字跡一模一樣!\n" +
                "在他失去耐心撕開偽裝\n" +
                "露出獠牙攻擊你時\n" +
                "你迅速向後拉開距離\n" +
                "並連開數槍\n" +
                "他眼神透露出對於還有另一把槍的錯愕\n" +
                "約瑟倒在自己的血泊中肆意的大笑\n" +
                "直到死去都很滿意你給他的驚喜\n" +
                "讓他感受全新的體驗...\n" +
                "被狩獵…\n").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.bgm_mystery);

        eventManager.addEvent(event);

        eventManager.play("驚悚結局");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        Intent intent = new Intent();
        intent.setClass(End_save.this, SampleMenuMainActivity.class);
        startActivity(intent);

    }
}