package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;
import tw.edu.scu.avgexample.framework.model.KWPictureEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;

public class MyStory_baseroom_nogun_Utils {

    public static void scene_1_1(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(走進房間)\n" +
                        "這裡是?!\n").setBackgroundMusicResouceId(R.raw.bgm_mystery);

        KWThirdPersonEventModel event2 = new KWThirdPersonEventModel(police,
                "這邊的房間居然有地道?\n");
        KWThirdPersonEventModel event3 = new KWThirdPersonEventModel(police,
                "(四處查看)\n");
        KWThirdPersonEventModel event4 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel("(櫃子從上面數下來第二層最右邊的箱子)\n" +
                        "(似乎藏著什麼)");



        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);

        eventManager.play("地下室搜索");
    }
    public static void scene_1_2(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.pills);
        KWPictureEventModel event1 =
                new KWPictureEventModel(paper,"(是一個藥罐)").setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWPictureEventModel event2 =
                new KWPictureEventModel(paper,"(上面的名字是Andy)");
        KWPictureEventModel event3 =
                new KWPictureEventModel(paper,"(等等…)");
        KWPictureEventModel event4 =
                new KWPictureEventModel(paper,"(是我的名字?!)");
        KWPictureEventModel event5 =
                new KWPictureEventModel(paper,"(上面寫的藥效是精神類藥物)");
        KWPictureEventModel event6 =
                new KWPictureEventModel(paper,"(主要用於治療人格分裂?)");
        KWPictureEventModel event7 =
                new KWPictureEventModel(paper,"【若停用恐將造成腦部受損】");
        KWPictureEventModel event8 =
                new KWPictureEventModel(paper,"【可能影響記憶力】");


        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel("(難道我有第二個人格?!)");

        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(police,
                "(背後出現)");
        KWThirdPersonEventModel event11 = new KWThirdPersonEventModel(police,
                "你找到了什麼?\n");
        KWThirdPersonEventModel event12 = new KWThirdPersonEventModel(police,
                "!!!");
        KWThirdPersonEventModel event13 = new KWThirdPersonEventModel(police,
                "我就知道是你");
        KWThirdPersonEventModel event14 = new KWThirdPersonEventModel(police,
                "跟你當年的手法一樣\n" +
                        "用延遲的方式來獲得不在場證明\n");
        KWThirdPersonEventModel event15 = new KWThirdPersonEventModel(police,
                "難怪當初我們什麼都問不出來\n" +
                        "原來你那時候就已經開始發病了\n");
        KWFirstPersonEventModel event16 =
                new KWFirstPersonEventModel("不是的");
        KWFirstPersonEventModel event17 =
                new KWFirstPersonEventModel("這不是我的藥");
        KWFirstPersonEventModel event18 =
                new KWFirstPersonEventModel("聽我解釋\n" +
                        "(拉住警探的衣服)\n");
        KWThirdPersonEventModel event19 = new KWThirdPersonEventModel(police,
                "放開我");
        KWFirstPersonEventModel event20 =
                new KWFirstPersonEventModel("(互相拉扯)\n");
        KWFirstPersonEventModel event21 =
                new KWFirstPersonEventModel("(一時失手推了他一把)");
        KWFirstPersonEventModel event22 =
                new KWFirstPersonEventModel("(約瑟的頭撞到鋼梁暈了過去)\n");
        KWFirstPersonEventModel event23 =
                new KWFirstPersonEventModel("(他的腦後慢慢溢出鮮血)\n");

        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("救他");
        optionArrayList.add("不救他");
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

        eventManager.addEvent(new KWOptionEventModel("打開保險箱選項", "約瑟警官認定我是兇手，該救他嗎？", optionArrayList));




        eventManager.play("救不救");
    }
    public static void scene_1_3(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.pills);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(你慌亂的逃走)").setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("(過了約半個小時)");
        KWThirdPersonEventModel event3 = new KWThirdPersonEventModel(police,
                "幹!阿~");
        KWThirdPersonEventModel event4 = new KWThirdPersonEventModel(police,
                "這次真的玩大了");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(police,
                "早知道就不玩什麼精神病的遊戲了");
        KWThirdPersonEventModel event6 = new KWThirdPersonEventModel(police,
                "雖然真的很有趣");
        KWThirdPersonEventModel event7 = new KWThirdPersonEventModel(police,
                "難得能遇到認識的人");
        KWThirdPersonEventModel event8 = new KWThirdPersonEventModel(police,
                "想說剛好有個完美的替罪羔羊");
        KWThirdPersonEventModel event9 = new KWThirdPersonEventModel(police,
                "算了!玩夠了!");
        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(police,
                "哀...\n" +
                        "又要清理好久...\n");
        KWThirdPersonEventModel event11 = new KWThirdPersonEventModel(police,
                "(悠閒地走進地道)");

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

        eventManager.play("不救");
    }
    public static void scene_1_4(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.pills);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(你脫下身上的衣服幫他止血)").setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("(慌亂的將約瑟的頭包紮好)");
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("(忙完這一切的你就在旁邊靜靜守候著)");
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel("(過了約半個小時)");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(true);
        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("你醒啦");
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel("你怎麼站起來了");
        KWFirstPersonEventModel event8 =
                new KWFirstPersonEventModel("你已經沒事了嗎?");
        KWThirdPersonEventModel event9 = new KWThirdPersonEventModel(police,
                "我好多了");
        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(police,
                "謝謝你沒有拋下我");
        KWThirdPersonEventModel event11= new KWThirdPersonEventModel(police,
                "我很感激你");
        KWThirdPersonEventModel event12 = new KWThirdPersonEventModel(police,
                "但是身為警察\n" +
                        "我真的不能放你一馬\n");
        KWThirdPersonEventModel event13 = new KWThirdPersonEventModel(police,
                "暴風雨過後還是乖乖跟我回去警局認罪吧");


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

        eventManager.play("救");
    }
    public static void scene_1_5(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.pills);

        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(true);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("希望你不要誤解我，" +
                        "我不可能做出這種事").setBackgroundMusicResouceId(R.raw.bgm_tension);
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("這肯定是巧合而已");


        KWThirdPersonEventModel event4 = new KWThirdPersonEventModel(police,
                "你還不懂嗎?");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(police,
                "第一個死者寫著liar(說謊者)");
        KWThirdPersonEventModel event6= new KWThirdPersonEventModel(police,
                "你的妻子曾經出軌過一次\n" +
                        "雖然你最後原諒了她");
        KWThirdPersonEventModel event7 = new KWThirdPersonEventModel(police,
                "但自此之後你最討厭的事就是有人說謊");
        KWThirdPersonEventModel event8 = new KWThirdPersonEventModel(police,
                "你的第二人格發現他在說謊\n" +
                        "偷偷把影片備份到另一台手機裡\n");
        KWThirdPersonEventModel event9 = new KWThirdPersonEventModel(police,
                "所以就被你殺掉了");
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("相信他，不讓自己再錯下去了");
        optionArrayList.add("不相信他，堅決否認");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.addEvent(event9);
        eventManager.addEvent(new KWOptionEventModel("精神病1選項", "約瑟警官說的是事實嗎?我該相信他嗎？", optionArrayList));


        eventManager.play("精神病1");
    }
    public static void scene_1_6(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context, "police", "約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context, "druger", "哈利");
        KWCharacterModel suitman = new KWCharacterModel(context, "suitman", "提姆");
        KWCharacterModel gangster = new KWCharacterModel(context, "gangster", "萊特");
        KWCharacterModel women = new KWCharacterModel(context, "women", "珍");
        KWCharacterModel strongman = new KWCharacterModel(context, "strongman", "霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.pills);

        KWThirdPersonEventModel event1 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(true);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("我還是堅信我不可能做出這種事").setBackgroundMusicResouceId(R.raw.bgm_tension);



        KWThirdPersonEventModel event4 = new KWThirdPersonEventModel(police,
                "你不要再欺騙自己了");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(police,
                "第二個死者寫著greedy(貪婪)");
        KWThirdPersonEventModel event6= new KWThirdPersonEventModel(police,
                "你後來為了錢什麼都可以做\n" +
                        "所以最痛恨有人拿走你的財產\n");
        KWThirdPersonEventModel event7 = new KWThirdPersonEventModel(police,
                "雖然你把錢拿給大家看");
        KWThirdPersonEventModel event8 = new KWThirdPersonEventModel(police,
                "但是你的心裡已經把它視為自己的財產");
        KWThirdPersonEventModel event9 = new KWThirdPersonEventModel(police,
                "所以當他提出想要平分財產時\n" +
                        "就已經被你的第二人格盯上\n");
        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(police,
                "用你最熟悉的方式\n" +
                        "也是殺掉你妻子的方法\n\n");
        KWThirdPersonEventModel event11 = new KWThirdPersonEventModel(police,
                "縱火\n" +
                        "殺掉了...");

        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("相信他，不讓自己再錯下去了");
        optionArrayList.add("不相信他，堅決否認");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.addEvent(event9);
        eventManager.addEvent(event10);
        eventManager.addEvent(event11);
        eventManager.addEvent(new KWOptionEventModel("精神病2選項", "這麼多跡象，我該相信他嗎？", optionArrayList));


        eventManager.play("精神病2");
    }

}