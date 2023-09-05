package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import tw.edu.scu.avgexample.R;
import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleGlobalData;

public class MyStory_Second_day_Utils{

    public static void scene_2_1(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel nerd = new KWCharacterModel(context,"nerd","拿著奇怪機器的人");
        KWCharacterModel druger = new KWCharacterModel(context,"druger","穿著花襯衫的中年男子");
        KWCharacterModel suitman = new KWCharacterModel(context,"suitman","穿西裝的男子");
        KWCharacterModel gangster = new KWCharacterModel(context,"gangster","刺青的流氓");
        KWCharacterModel women = new KWCharacterModel(context,"women","身材火辣的女子");
        KWCharacterModel strongman = new KWCharacterModel(context,"strongman","滿滿肌肉的壯漢");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(尖叫聲)")
                        .setBackgroundDrawable(dark).setSouncEffectResouceId(R.raw.woman_scream_long);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("怎麼了?")
                        .setBackgroundDrawable(room).setSouncEffectResouceId(R.raw.switch_sound);
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("(打開房門探出頭)")
                        .setBackgroundDrawable(corridor).setBackgroundMusicResouceId(R.raw.bgm_tension);
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (women,
                "(跌坐在地上)");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (druger,
                "(房門微微開啟只露出一隻眼睛)");
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event6 = new KWThirdPersonEventModel (suitman,
                "(看熱鬧的臉)");
        event6.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (strongman,
                "(整個人站在門外)");
        event7.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (gangster,
                "一大早這麼吵幹嘛? 還讓不讓人睡覺阿?\n" +
                        "(走到美女旁邊)");
        event8.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event9 = new KWThirdPersonEventModel (gangster,
                "(往美女視線看去)");
        KWThirdPersonEventModel  event10 = new KWThirdPersonEventModel (gangster,
                "阿!\n" +
                        "(跌坐在地上)");
        KWThirdPersonEventModel  event11 = new KWThirdPersonEventModel (gangster,
                "死人了!\n" +
                        "有..有..有人死了!");
        KWThirdPersonEventModel  event12 = new KWThirdPersonEventModel (gangster,
                "昨天那個怪人死了!!!");


        KWThirdPersonEventModel  event13 = new KWThirdPersonEventModel (strongman,
                "(瞳孔收縮)");

        event13.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event14 = new KWThirdPersonEventModel (druger,
                "(迅速把門關上)");

        event14.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event15 = new KWThirdPersonEventModel (suitman,
                "哇靠!這不干我的事喔!\n" +
                        "(拿著行李跑走)");

        event15.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event16 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (women,
                "(躲回自己房間)");
        KWThirdPersonEventModel event18 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event19 =
                new KWFirstPersonEventModel("這…這個事情大條了\n" +
                        "趕緊走吧");
        KWFirstPersonEventModel event20 =
                new KWFirstPersonEventModel("不然要被扯進這種麻煩的案件裡\n" +
                        "如果留下不良紀錄怎麼辦?");
        KWFirstPersonEventModel event21 =
                new KWFirstPersonEventModel("我還想重新開始呢!");
        KWFirstPersonEventModel event22 =
                new KWFirstPersonEventModel("(回房間拿起整理好的行李)").setBackgroundDrawable(room);
        KWFirstPersonEventModel event23 =
                new KWFirstPersonEventModel("(迅速衝向自己的車)").setBackgroundDrawable(hotel);




        //KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        //KWThirdPersonEventModel event26 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(true);
        //event26.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);




        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.addEvent(event9);
        eventManager.addEvent(event10);
        eventManager.addEvent(event11);
        eventManager.addEvent(event12);
        eventManager.addEvent(event13);
        eventManager.addEvent(event14);
        eventManager.addEvent(event15);
        eventManager.addEvent(event16);
        eventManager.addEvent(event17);
        eventManager.addEvent(event18);
        eventManager.addEvent(event19);
        eventManager.addEvent(event20);
        eventManager.addEvent(event21);
        eventManager.addEvent(event22);
        eventManager.addEvent(event23);

        eventManager.play("發現屍體");
    }

    public static void scene_2_2(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel nerd = new KWCharacterModel(context,"nerd","拿著奇怪機器的人");
        KWCharacterModel druger = new KWCharacterModel(context,"druger","穿著花襯衫的中年男子");
        KWCharacterModel suitman = new KWCharacterModel(context,"suitman","穿西裝的男子");
        KWCharacterModel gangster = new KWCharacterModel(context,"gangster","刺青的流氓");
        KWCharacterModel women = new KWCharacterModel(context,"women","身材火辣的女子");
        KWCharacterModel strongman = new KWCharacterModel(context,"strongman","滿滿肌肉的壯漢");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("欸!不對啊!\n" +
                        "(望向輪胎)").setBackgroundDrawable(hotel).setBackgroundMusicResouceId(R.raw.bgm_tension);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("我的輪胎全都被扎破了?!");
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("(抬頭望向四周)");

        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (suitman,
                "我的新車!阿~");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel("(他的也被扎破了)");
        KWThirdPersonEventModel  event6 = new KWThirdPersonEventModel (druger,
                "FUCK!!!");
        event6.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel("(不知何時出現的襯衫男)\n" +
                        "(他的也同樣又被扎破了)");
        KWFirstPersonEventModel event8 =
                new KWFirstPersonEventModel("你們也一樣對吧\n" +
                        "趕快檢查一下其他人的車子!\n");
        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel("(四處檢查)");
        KWThirdPersonEventModel  event10 = new KWThirdPersonEventModel (suitman,
                "我這邊的都扎破了!");
        KWThirdPersonEventModel  event11 = new KWThirdPersonEventModel (druger,
                "這邊也是!");
        KWFirstPersonEventModel event12 =
                new KWFirstPersonEventModel("我也是一樣!");
        KWFirstPersonEventModel event13 =
                new KWFirstPersonEventModel("(到底是誰要把大家的輪胎都扎破)\n" +
                        "(不想讓我們離開這裡)");
        KWFirstPersonEventModel event14 =
                new KWFirstPersonEventModel("我們先回去雨太大了!");

        KWThirdPersonEventModel event15 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event16 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event17 =
                new KWFirstPersonEventModel("(一起回到旅館)");
        KWFirstPersonEventModel event18 =
                new KWFirstPersonEventModel("【怪人被一堆數據線吊死在天花板上】\n" +
                        "【地上有著一台被砸壞的手機】\n" +
                        "【後面的牆上寫著liar(說謊者)】").setBackgroundDrawable(corridor).setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (gangster,
                "一定是你們不然為什麼一出事就想跑走?");
        event19.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (suitman,
                "你不要血口噴人喔!\n" +
                        "你才嫌疑很大吧!");
        event20.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event21 = new KWThirdPersonEventModel (suitman,
                "明明之前就是你一直打他…");
        KWThirdPersonEventModel  event22 = new KWThirdPersonEventModel (suitman,
                "對了…");
        KWThirdPersonEventModel  event23 = new KWThirdPersonEventModel (suitman,
                "之後還說什麼…\n" +
                        "要把他幹掉然後埋掉!" );
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (suitman,
                "對!對!對!" );
        KWThirdPersonEventModel  event25 = new KWThirdPersonEventModel (suitman,
                "一定就是你幹的!");
        KWThirdPersonEventModel event26 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event27 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (druger,
                "那個壯漢看起來這麼像黑社會分子\n" +
                        "說不定在房間裡做什麼事被發現");
        event29.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event30 = new KWThirdPersonEventModel (druger,
                "所以在大廳就一直惡狠狠地盯著他!\n" +
                        "說不定等大家都睡著就去把他滅口了!");
        KWThirdPersonEventModel  event31 = new KWThirdPersonEventModel (strongman,
                "...");

        event31.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event32 =
                new KWFirstPersonEventModel("你才是幹非法事情的人吧!\n" +
                        "不要以為我不知道");
        KWFirstPersonEventModel event33 =
                new KWFirstPersonEventModel("那個味道...");
        KWFirstPersonEventModel event34 =
                new KWFirstPersonEventModel("你抽的根本就不是菸!!!");
        KWThirdPersonEventModel  event35 = new KWThirdPersonEventModel (druger,
                "你這種平時裝無辜的人\n" +
                        "往往偽裝之下才是真的變態!");
        KWThirdPersonEventModel  event36 = new KWThirdPersonEventModel (druger,
                "說不定你也有些小祕密被他發現了\n" +
                        "才惱羞殺人的吧!");
        KWThirdPersonEventModel event37 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event38 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event39 = new KWThirdPersonEventModel (suitman,
                "妳也別想逃脫嫌疑!" );
        event39.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event40 = new KWThirdPersonEventModel (suitman,
                "那個猥瑣男在我來的時候\n" +
                        "就一直說有個女的身材超辣");
        KWThirdPersonEventModel  event41 = new KWThirdPersonEventModel (suitman,
                "一定是妳被他拍到裸照\n" +
                        "才憤而殺人的吧!");
        KWThirdPersonEventModel  event42 = new KWThirdPersonEventModel (women,
                "你這種人我看多了\n" +
                        "永遠都一副道貌盎然");
        event42.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event43 = new KWThirdPersonEventModel (women,
                "只要有人威脅到你利益\n" +
                        "就變的心狠手辣!" );
        KWThirdPersonEventModel event44 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event45 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event46 =
                new KWFirstPersonEventModel("好了都別吵了\n" +
                        "我們所有人的輪胎都被扎破了\n" +
                        "誰都走不了");
        KWFirstPersonEventModel event47 =
                new KWFirstPersonEventModel("你們誰的手機有訊號\n" +
                        "趕快報警吧!");
        KWThirdPersonEventModel  event48 = new KWThirdPersonEventModel (suitman,
                "我的沒有...");
        event48.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event49 = new KWThirdPersonEventModel (strongman,
                "我來的時候就沒訊號了");
        event49.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event50 = new KWThirdPersonEventModel (women,
                "我手機也是");
        event50.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event51 = new KWThirdPersonEventModel (druger,
                "我手機壞了");
        event51.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event52 = new KWThirdPersonEventModel (gangster,
                "看我幹嘛?我也沒訊號啦");
        event52.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event53 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event54 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event55 =
                new KWFirstPersonEventModel("(所有人都沒有訊號)");
        KWThirdPersonEventModel  event56 = new KWThirdPersonEventModel (women,
                "我好像記得有看到櫃檯有一支電話…");
        event56.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event57 = new KWThirdPersonEventModel (suitman,
                "對!我也有看到!");
        event57.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel event58 =
                new KWFirstPersonEventModel("那我們趕快去吧");
        KWThirdPersonEventModel event59= new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event60 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event61 =
                new KWFirstPersonEventModel("(到大廳櫃台拿起電話撥打911)").setBackgroundDrawable(lobby);
        KWFirstPersonEventModel event62 =
                new KWFirstPersonEventModel( "(您好這裡是911)\n" +
                        "(請問有什麼事嗎?)\n" );
        KWFirstPersonEventModel event63 =
                new KWFirstPersonEventModel( "喂!喂!我們這邊發生命案\n" +
                        "地點在XX公路XX公里處的旅館\n");
        KWFirstPersonEventModel event64 =
                new KWFirstPersonEventModel( "我們這邊有六…\n" +
                        "(好的我們已經派遣員警過去!)\n" +
                        "(請留在現場不要移動)\n" +
                        "那我們…\n");
        KWFirstPersonEventModel event65 =
                new KWFirstPersonEventModel( "(斷電)\n" +
                        "(尖叫聲)").setBackgroundDrawable(dark).setSouncEffectResouceId(R.raw.woman_scream_long);
        KWFirstPersonEventModel event66 =
                new KWFirstPersonEventModel( "喂!喂!喂!");
        KWFirstPersonEventModel event67 =
                new KWFirstPersonEventModel( "電話斷了…");
        KWFirstPersonEventModel event68 =
                new KWFirstPersonEventModel( "怎麼會突然停電?");
        KWThirdPersonEventModel  event69 = new KWThirdPersonEventModel (druger,
                "是不是因為電線老舊啊?");
        event69.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event70 = new KWThirdPersonEventModel (gangster,
                "一定是!這到底是什麼破地方啊!");
        event70.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event71 = new KWThirdPersonEventModel (suitman,
                "你們誰去修一下吧?");
        event71.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event72 =
                new KWFirstPersonEventModel( "這邊這麼多房間\n" +
                        "誰會知道變電箱在哪裡?");
        KWThirdPersonEventModel  event73 = new KWThirdPersonEventModel (strongman,
                "所有人分頭找吧\n" +
                        "這樣比較快!");
        event73.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event74= new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event75 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event76 =
                new KWFirstPersonEventModel( "(於是所有人分頭找變電箱)").setBackgroundDrawable(corridor);
        KWFirstPersonEventModel event77 =
                new KWFirstPersonEventModel( "(四處摸索)");

        KWFirstPersonEventModel event78 =
                new KWFirstPersonEventModel( "這間看起來較特別\n" +
                        "蠻有可能的\n" +
                        "進去看看吧!");
        KWFirstPersonEventModel event79 =
                new KWFirstPersonEventModel( "(進入房間)").setBackgroundDrawable(boss_room);
        KWFirstPersonEventModel event80 =
                new KWFirstPersonEventModel( "(進入房間)");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.addEvent(event9);
        eventManager.addEvent(event10);
        eventManager.addEvent(event11);
        eventManager.addEvent(event12);
        eventManager.addEvent(event13);
        eventManager.addEvent(event14);
        eventManager.addEvent(event15);
        eventManager.addEvent(event16);
        eventManager.addEvent(event17);
        eventManager.addEvent(event18);
        eventManager.addEvent(event19);
        eventManager.addEvent(event20);
        eventManager.addEvent(event21);
        eventManager.addEvent(event22);
        eventManager.addEvent(event23);
        eventManager.addEvent(event24);
        eventManager.addEvent(event25);
        eventManager.addEvent(event26);
        eventManager.addEvent(event27);
        eventManager.addEvent(event29);
        eventManager.addEvent(event30);
        eventManager.addEvent(event31);
        eventManager.addEvent(event32);
        eventManager.addEvent(event33);
        eventManager.addEvent(event34);
        eventManager.addEvent(event35);
        eventManager.addEvent(event36);
        eventManager.addEvent(event37);
        eventManager.addEvent(event38);
        eventManager.addEvent(event39);
        eventManager.addEvent(event40);
        eventManager.addEvent(event41);
        eventManager.addEvent(event42);
        eventManager.addEvent(event43);
        eventManager.addEvent(event44);
        eventManager.addEvent(event45);
        eventManager.addEvent(event46);
        eventManager.addEvent(event47);
        eventManager.addEvent(event48);
        eventManager.addEvent(event49);
        eventManager.addEvent(event50);
        eventManager.addEvent(event51);
        eventManager.addEvent(event52);
        eventManager.addEvent(event53);
        eventManager.addEvent(event54);
        eventManager.addEvent(event55);
        eventManager.addEvent(event56);
        eventManager.addEvent(event57);
        eventManager.addEvent(event58);
        eventManager.addEvent(event59);
        eventManager.addEvent(event60);
        eventManager.addEvent(event61);
        eventManager.addEvent(event62);
        eventManager.addEvent(event63);
        eventManager.addEvent(event64);
        eventManager.addEvent(event65);
        eventManager.addEvent(event66);
        eventManager.addEvent(event67);
        eventManager.addEvent(event68);
        eventManager.addEvent(event69);
        eventManager.addEvent(event70);
        eventManager.addEvent(event71);
        eventManager.addEvent(event72);
        eventManager.addEvent(event73);
        eventManager.addEvent(event74);
        eventManager.addEvent(event75);
        eventManager.addEvent(event76);
        eventManager.play("停車場");

    }

}