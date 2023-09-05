package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleMenuMainActivity;

public class End_save_nogun extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_save_nogun);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable love_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.love_memory);
        Drawable old_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.sad_memory);
        Drawable fire_house = KWResourceUtils.getDrawableByResourceId(this, R.drawable.fire_house);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(this, R.drawable.hotel);
        KWFullScreenEventModel event = new KWFullScreenEventModel("慢慢在約瑟警官的談話中感到不對勁的你\n" +
                "緩緩將眼神看向門邊\n" +
                "你回想起在旅館主人房間內看到的那封信…\n" +
                "跟約瑟警官的筆錄字跡一模一樣!\n" +
                "在他失去耐心撕開偽裝\n" +
                "露出獠牙攻擊你時\n" +
                "你迅速撞開他並逃出房間\n" +
                "但這是在他的主場\n" +
                "用熟悉的地道與無處不在的針孔開啟了狩獵\n" +
                "最後因為你救了他一次所以成為唯一的倖存者\n" +
                "你一直都沒有報警\n" +
                "因為你知道他還在 看 著 你\n").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.bgm_mystery);

        eventManager.addEvent(event);

        eventManager.play("屠殺結局");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);
        Intent intent = new Intent();
        intent.setClass(End_save_nogun.this, SampleMenuMainActivity.class);
        startActivity(intent);

    }
}