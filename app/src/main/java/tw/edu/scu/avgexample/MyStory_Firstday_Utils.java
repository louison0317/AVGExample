package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

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

public class MyStory_Firstday_Utils {
    public static void scene_1_1(Context context, KWEventManager eventManager) {
        eventManager.stop();

        KWCharacterModel nerd = new KWCharacterModel(context,"nerd","拿著奇怪機器的人");
        Drawable background = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("你好，有人嗎?  請問這裡還有空房嗎?")
                        .setBackgroundDrawable(background).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("奇怪，沒有人嗎?");
        KWThirdPersonEventModel event3 = new KWThirdPersonEventModel(nerd,"(突然出現)");
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel("阿! 嚇我一跳!");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(nerd,
                "這邊的老闆好像不在\n" +
                        "不知道為什麼，只在櫃檯留下紙條說:\n");
        KWThirdPersonEventModel event6 = new KWThirdPersonEventModel(nerd,
                "「老闆有事外出，所有空房間都能入住，\n" +
                        "一天500塊，自己放進玻璃罐中，感謝配合!」\n" );
        KWThirdPersonEventModel event7 = new KWThirdPersonEventModel(nerd,
                "所以不用找了\n" +
                        "自己放錢進罐子裡拿房間鑰匙吧!\n" +
                        " 你是今天第7個人了" );
        KWThirdPersonEventModel event8 = new KWThirdPersonEventModel(nerd,
                "真是熱鬧阿!\n" +
                        "尤其是那個女的...");
        KWThirdPersonEventModel event9 = new KWThirdPersonEventModel(nerd,
                "身材真是火辣，嘻嘻嘻……");

        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(nerd).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event11 =
                new KWFirstPersonEventModel("(慢慢遠去)");
        KWFirstPersonEventModel event12 =
                new KWFirstPersonEventModel("真是一個怪人\n" +
                        "這荒郊野嶺的，老闆能去哪裡?" );

        KWFirstPersonEventModel event13 =
                new KWFirstPersonEventModel("最近的城鎮都要好幾個小時的車程\n" +
                        "這麼放心不會被偷東西嗎? ");
        KWFirstPersonEventModel event14 =
                new KWFirstPersonEventModel(
                        "算了，又不關我的事\n" + "乖乖放錢，不要惹麻煩好了!" );
        KWFirstPersonEventModel event15 =
                new KWFirstPersonEventModel(
                        "(放錢進玻璃罐，拿起房間鑰匙)");

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

        eventManager.play("進入旅館");
    }
    public static void scene_1_2(Context context, KWEventManager eventManager) {
        eventManager.stop();

        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(打開房間)")
                        .setBackgroundDrawable(room).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("其實打掃的蠻乾淨的嘛");
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("一天500塊也不算貴...");
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel("剛剛那個人說我是第7個\n"+
                        "所以除了他...\n"+
                        "還有其他5個人?");
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel("不知道其他人是不是也是怪人"  );

        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("算了\n" +
                        "別管了\n" +
                        "還是待房間看電視好了!");
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel(
                        "(打開電視)" );
        KWFirstPersonEventModel event8 =
                new KWFirstPersonEventModel(
                        " 沙沙沙…") .setSouncEffectResouceId(R.raw.tv_sound);
        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel(
                        " 幹!\n" + "果然鳥不生蛋\n" +
                                "連訊號都沒有…");
        KWFirstPersonEventModel event10 =
                new KWFirstPersonEventModel(
                        "哀!\n" +
                                "還是睡覺好了!");
        KWFirstPersonEventModel event11 =
                new KWFirstPersonEventModel(
                        "我今天是不是忘記什麼了?\n" +
                                "還是睡覺好了!");
        KWFirstPersonEventModel event12 =
                new KWFirstPersonEventModel(
                        "最近越來越健忘了!");
        KWFirstPersonEventModel event13 =
                new KWFirstPersonEventModel(
                        "(閉眼)" ).setBackgroundDrawable(dark).setSouncEffectResouceId(R.raw.switch_sound);
        KWFirstPersonEventModel event14 =
                new KWFirstPersonEventModel(
                        "(過了許久)" );

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


        eventManager.play("進入房間");
    }
    public static void scene_1_3(Context context, KWEventManager eventManager) {
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
        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel(
                        "(吵鬧聲)" ).setBackgroundDrawable(dark).setSouncEffectResouceId(R.raw.arguing);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel(
                        "(吵鬧聲)" );
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel(
                        "(開燈)\n" +
                                "什麼事情這麼吵?" ).setBackgroundDrawable(room).setSouncEffectResouceId(R.raw.switch_sound);
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel(
                        "(打開房門)\n" +
                                "聲音好像在大廳?" ).setBackgroundDrawable(corridor).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel(
                        "(走到大廳)").setBackgroundDrawable(lobby);
        KWThirdPersonEventModel event6 = new KWThirdPersonEventModel(gangster,
                "幹!居然敢在林北的房間裝針孔\n" +
                        "活得不耐煩了是不是?" );
        event6.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event7 = new KWThirdPersonEventModel(gangster,
                        "林北今天不打死你\n " +
                                "老子跟你姓!\n" +
                                " 媽的");
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (gangster,
                        "(瘋狂踹向怪人)");
        KWThirdPersonEventModel  event9 = new KWThirdPersonEventModel (nerd,
                "對不起!\n " +
                        "阿~ " );
        event9.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event10 = new KWThirdPersonEventModel (nerd,
                "不要再打了!我以後不敢了\n" +
                        "饒了我吧!");
        KWFirstPersonEventModel event11 =
                new KWFirstPersonEventModel(
                        "怎麼了? 發生什麼事情?\n" +
                                "都快把他打死了!");
        KWThirdPersonEventModel event12 = new KWThirdPersonEventModel(nerd).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event13 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event14 = new KWThirdPersonEventModel (suitman,
                "小兄弟，我跟你說\n" +
                        "那個拿著奇怪機器的人外表老實\n" +
                        "其實內心十分猥瑣");
        KWThirdPersonEventModel  event15 = new KWThirdPersonEventModel (suitman,
                 "我早就看出來了!" );
        KWThirdPersonEventModel  event16 = new KWThirdPersonEventModel (suitman,
                 "他居然在我們大家的房間裡裝針孔攝影機\n" +
                         "窺探我們的隱私!\n" +
                         "你要不要回去檢查一下，八成也有針孔!");
        event14.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event17 =
                new KWFirstPersonEventModel(
                        "哇靠!\n" +
                        "居然在房間裡面裝針孔偷窺，真是噁心!\n" +
                                "果然是個怪人…");
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (druger,
                "欸~影片在哪裡，趕快拿出來刪掉\n" +
                        "不然…不然…");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (druger,
                "就讓他打死你喔!\n" +
                        "(緊張樣)");
        event18.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (suitman,
                "(站得遠遠的不停發表對這件事的看法)");
        KWThirdPersonEventModel event21 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event22 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event23 = new KWThirdPersonEventModel (gangster,
                "(不停地踢著怪人的背)");
        event23.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (women,
                "(雙手環抱抓著自己)\n" +
                        "(試圖遮掩裸露出來的肌膚)");
        event24.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event25 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event26 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event27 = new KWThirdPersonEventModel (strongman,
                "(死死盯著倒在地上被打的怪人)");
        event27.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (nerd,
                "(不停地認錯求饒)\n" +
                        "…");
        event28.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event29 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event30 = new KWThirdPersonEventModel(nerd).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event31 =
                new KWFirstPersonEventModel(
                        "(最後所有人的見證下)\n" +
                                "(那個怪人把所有影片都刪除)" );
        KWFirstPersonEventModel event32 =
                new KWFirstPersonEventModel(
                                "(而那些設備包含房間內的針孔)\n" +
                                        "(都被我們砸壞當做懲罰)" );
        KWFirstPersonEventModel event33 =
                new KWFirstPersonEventModel("(事情結束後怪人飛快躲回房間裡)");




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
        eventManager.addEvent(event28);
        eventManager.addEvent(event29);
        eventManager.addEvent(event30);
        eventManager.addEvent(event31);
        eventManager.addEvent(event32);
        eventManager.addEvent(event33);





        eventManager.play("大廳鬧劇");
    }
    public static void scene_1_4(Context context, KWEventManager eventManager) {
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

        KWThirdPersonEventModel  event1 = new KWThirdPersonEventModel (gangster,
                "哼!敢來惹我\n" +
                        "真是不要命了!" ).setBackgroundDrawable(lobby).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWThirdPersonEventModel  event2 = new KWThirdPersonEventModel (gangster,
                "要不是今天遇到美女心情好\n" +
                        "我就把他幹掉，找個地方埋了!");
        KWThirdPersonEventModel  event3 = new KWThirdPersonEventModel (gangster,
                "(吹口哨)").setSouncEffectResouceId(R.raw.whistling);
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (gangster,
                "呦~美女\n" +
                        "等等來我房間幫哥哥我消消火阿~\n" +
                        "(挑眉)");
        event1.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (women,
                "(慌亂的向後退)");
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event6 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (suitman,
                "那個…");
        event7.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (gangster,
                "怎樣? ");
        KWThirdPersonEventModel  event9 = new KWThirdPersonEventModel (gangster,
                "你有意見是不是?\n" +
                        "(上下打量)");
        KWThirdPersonEventModel  event10 = new KWThirdPersonEventModel (suitman,
                "沒有!沒有!\n" +
                        "沒有意見!");
        KWThirdPersonEventModel  event11 = new KWThirdPersonEventModel (suitman,
                "不甘我的事\n" +
                        "我什麼都沒看到!");
        KWThirdPersonEventModel  event12 = new KWThirdPersonEventModel (suitman,
                "(逃回自己房間)");
        KWThirdPersonEventModel event13 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel  event14 = new KWThirdPersonEventModel (gangster,
                "算你識相!");
        KWThirdPersonEventModel  event15 = new KWThirdPersonEventModel (gangster,
                "(慢慢往辣妹走去)");
        KWThirdPersonEventModel  event16 = new KWThirdPersonEventModel (druger,
                "(默默不語的走去旅館外面)");
        event16.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (strongman,
                "哼!");
        event17.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (strongman,
                "(惡狠狠地瞪著流氓)");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (gangster,
                "當然!當然!" );
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (gangster,
                "肯定也是大哥您先來嘛~" +
                        "(諂媚的臉)");
        KWThirdPersonEventModel  event21 = new KWThirdPersonEventModel (strongman,
                "你最好不要煩她!");
        KWThirdPersonEventModel  event22 = new KWThirdPersonEventModel (gangster,
                "(眼神飄移)");
        KWThirdPersonEventModel  event23 = new KWThirdPersonEventModel (gangster,
                "大哥!沒事!我就開開玩笑而已…\n" +
                        "別生氣!別生氣!");
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (gangster,
                "(悻悻然地走回自己房間)");
        KWThirdPersonEventModel event25 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event26 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(true);
        event26.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event27 =
                new KWFirstPersonEventModel("你還好吧?\n" +
                        "(真希望我也有勇氣出面阻止)");
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (women,
                "沒事!我沒事!");
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (women,
                "謝謝你們的幫忙!");
        KWThirdPersonEventModel event30 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event31 =
                new KWFirstPersonEventModel("(回到自己房間)");
        KWFirstPersonEventModel event32 =
                new KWFirstPersonEventModel("(鎖門聲)").setSouncEffectResouceId(R.raw.door_lock);
        KWThirdPersonEventModel  event33 = new KWThirdPersonEventModel (strongman,
                "(狠狠的盯著流氓的房間)").setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWThirdPersonEventModel  event34 = new KWThirdPersonEventModel (strongman,
                "(又把眼神盯向怪人的房間)");
        KWThirdPersonEventModel  event35 = new KWThirdPersonEventModel (strongman,
                "(停留了許久)");
        KWThirdPersonEventModel  event36 = new KWThirdPersonEventModel (strongman,
                "(一語不發的回到自己房間)");
        KWThirdPersonEventModel event37 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event38 =
                new KWFirstPersonEventModel("呼!真是令人畏懼的人\n" +
                        "那一身肌肉怕是一拳我就倒了吧!?");
        KWFirstPersonEventModel event39 =
                new KWFirstPersonEventModel("抽根菸散散心好了!");
        KWFirstPersonEventModel event40 =
                new KWFirstPersonEventModel("(走到旅館外)").setBackgroundDrawable(hotel);
        KWFirstPersonEventModel event41 =
                new KWFirstPersonEventModel("(摸摸口袋發現打火機不見了)");
        KWFirstPersonEventModel event42 =
                new KWFirstPersonEventModel("(看到花襯衫的中年男子在不遠處抽菸)");
        KWFirstPersonEventModel event43 =
                new KWFirstPersonEventModel("嘿!能借給個火嗎?\n" +
                        "(走向花襯衫的中年男子)");
        KWThirdPersonEventModel  event44 = new KWThirdPersonEventModel (druger,
                "(迅速丟掉菸)\n" +
                        "(踩熄)");
        KWThirdPersonEventModel event45 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event46 =
                new KWFirstPersonEventModel("(轉身離去)");
        KWFirstPersonEventModel event47 =
                new KWFirstPersonEventModel("怎麼這麼沒禮貌?");
        KWFirstPersonEventModel event48 =
                new KWFirstPersonEventModel("(走回房間)").setBackgroundDrawable(room);
        KWFirstPersonEventModel event49 =
                new KWFirstPersonEventModel("(躺到床上)");
        KWFirstPersonEventModel event50 =
                new KWFirstPersonEventModel("哀!這些都是什麼人啊?\n" +
                        "還是好好睡一覺明天就離開吧!");
        KWFirstPersonEventModel event51 =
                new KWFirstPersonEventModel("(呼吸逐漸平穩)").setBackgroundDrawable(dark).setSouncEffectResouceId(R.raw.switch_sound);
        KWFirstPersonEventModel event52 =
                new KWFirstPersonEventModel("幹!\n" +
                        "雖然已經把針孔拔掉了\n" +
                        "但還是有種被人窺探的感覺...");
        KWFirstPersonEventModel event53 =
                new KWFirstPersonEventModel("真是令人煩躁\n" +
                        "這種噁心的人真是該死!");
        KWFirstPersonEventModel event54 =
                new KWFirstPersonEventModel("(把枕頭蓋住臉)");
        KWFirstPersonEventModel event55 =
                new KWFirstPersonEventModel("(逐漸熟睡)");


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
        eventManager.addEvent(event28);
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

        eventManager.play("矛盾種子");
    }
}