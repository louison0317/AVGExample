package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWBaseSceneActivity;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWFullScreenEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleScene_2_Activity;
import tw.edu.scu.avgexample.sample.SampleScene_7_Activity;

public class MainActivity_beginning extends KWBaseSceneActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_beginning);
    }
    @Override
    protected void initializeEvent () {
        super.initializeEvent();
        Drawable love_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.love_memory);
        Drawable old_memory = KWResourceUtils.getDrawableByResourceId(this, R.drawable.sad_memory);
        Drawable fire_house = KWResourceUtils.getDrawableByResourceId(this, R.drawable.fire_house);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(this, R.drawable.hotel);
        KWFullScreenEventModel event = new KWFullScreenEventModel("曾經的你愛情事業兩得意\n"+"不僅娶到大學公認的女神，還找到令人稱羨的工作並得到老闆的重用\n" +
                "\n人生如此的美好，是大家口中的人生勝利組。").setBackgroundDrawable(love_memory).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFullScreenEventModel event2 = new KWFullScreenEventModel("但這一切很快就變了調…… \n"+
                "妻子的身體每況愈下，開始連生活都無法自理\n"+
                "到醫院檢查之後發現得了絕症，以後只能躺在床上度過下半生，每天還要支付龐大的醫藥費\n"+
                "妻子不想拖累你，想要一個人離去\n"+
                "但是深愛著她的你將她摟在懷中\n"+
                "說到：「還記得我在婚禮上說的嗎?無論生老病死我都不會拋棄你，笨蛋!」"+"\n"+"\n"+
                "為了支付那些鉅額的藥費，你開始變得不擇手段\n"+
                "運用各種方式毀掉競爭對手來快速的升遷\n" +
                "只要有錢就能對一些事情\n" +
                "睜一隻眼閉一隻眼...").setBackgroundDrawable(old_memory);
        KWFullScreenEventModel event3 = new KWFullScreenEventModel("直到有一天……上面做的非法交易被發現了\n" +
                "雖然沒有牽連到你，但是公司也因此倒閉\n" +
                "失去工作的你，面對著在床上無法回應的妻子與不停催繳的帳單\n" +
                "這些壓力讓你瀕臨崩潰\n" +
                "你開始到酒吧買醉，希望酒精可以麻痺自己\n" +
                "忘卻這些煩惱...");
        KWFullScreenEventModel event4 = new KWFullScreenEventModel("這天你如往常一樣\n" +
                "在酒吧喝到爛醉才不情願地踏上回家的路\n" +
                "你發現那些平時用同情眼神看著你的那些鄰居\n" +
                "全都跑出來了...\n" +
                "你心中滿是疑問\n"+
                "直到你看到那棟熟悉的房子\n" +
                "正被大火無情的吞噬...").setBackgroundDrawable(fire_house);
        KWFullScreenEventModel event5 = new KWFullScreenEventModel("你呆呆地望著這棟曾經充滿幸福回憶\n" +
                "但現在讓你痛苦不已的房子\n" +
                "不禁心中浮起了\n"+
                "一絲……輕鬆……");
        KWFullScreenEventModel event6 = new KWFullScreenEventModel("只想到另一個城市從新開始的你\n" +
                "決定踏上了旅途\n" +
                "一邊散心一邊尋找機遇\n" +
                "而今天是第五天\n" +
                "一場大雨逼的你只能停車在最近的公路旅館\n" +
                "短暫住上一天\n" +
                "希望明天天氣能夠好轉\n" +
                "讓你繼續踏上旅途……").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.storm_coming_l);

        eventManager.addEvent(event);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.play("背景介紹");


    }
    @Override
    protected void didFinishAllEvent (String eventIdentifier){
        super.didFinishAllEvent(eventIdentifier);

        switchSceneActivity(MyStory_Firstday.class);
    }
}