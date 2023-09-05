package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;
import tw.edu.scu.avgexample.framework.model.KWPictureEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;import tw.edu.scu.avgexample.framework.KWEventManager;
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

public class MyStory_4_Utils {
    public static void scene_1_1(Context context, KWEventManager eventManager) {
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
                new KWFirstPersonEventModel("(裡面是一堆鈔票跟…)")
                        .setBackgroundDrawable(boss_room).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("(一支槍!)");
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("(打開彈匣，裡面是滿的)");
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel("(隔壁傳來電閘開啟聲)\n" +
                        "(電力回復)");
        KWThirdPersonEventModel event5 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(true);
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event6 = new KWThirdPersonEventModel (women,
                "我們打開了!\n" +
                        "大家在哪裡啊?" );
        event6.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel("(逐漸走近的腳步聲)").setSouncEffectResouceId(R.raw.running_in_a_house);
        KWFirstPersonEventModel event8 =
                new KWFirstPersonEventModel("怎麼辦?\n" +
                        "這些人都可能是殺人犯!\n" +
                        "警察又不知道多久才會來...");
        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel("我該把槍藏起來防身嗎?");
        ArrayList<String> optionArrayList = new ArrayList<>();
        optionArrayList.add("誠實以告，以免被懷疑是兇手");
        optionArrayList.add("隱瞞下來，把槍藏在身上防身");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.addEvent(event9);
        eventManager.addEvent(new KWOptionEventModel("打開保險箱選項", "該把槍藏在身上防身嗎？", optionArrayList));


        eventManager.play("打開保險箱");
    }
    public static void scene_1_2(Context context, KWEventManager eventManager) {
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
                new KWFirstPersonEventModel("還是不要隱瞞好了..." )
                        .setBackgroundDrawable(boss_room).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("不然被懷疑是兇手的話\n" +
                        "我的人生就真的完蛋了!" );
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("好不容易有重新開始的機會\n" +
                        "不能就因為這件事浪費了!");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (women,
                "欸~原來你就在隔壁喔!\n" +
                        "我們把電閘打開囉!" );
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (druger,
                "我們同時也發現了一些線索\n" +
                        "你有什麼發現嗎?" );
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("我也有發現一些線索跟這些東西\n" +
                        "(露出保險箱裡的錢與槍)" );
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (women,
                "哇!也太多錢了吧!" );

        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (druger,
                "居然還有槍嗎?\n" +
                        "都拿著，先回去大廳跟所有人會合!\n" );


        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);
        eventManager.play("不藏槍");
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
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("現在這麼危險情況..." )
                        .setBackgroundDrawable(boss_room).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("當然先確保自己的安全\n" +
                        "(把槍藏到腰後)" );
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("不然人死了就全都沒了…");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (women,
                "欸~原來你就在隔壁喔!\n" +
                        "我們把電閘打開囉!" );
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (druger,
                "我們同時也發現了一些線索\n" +
                        "你有什麼發現嗎?" );
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("我也有發現一些線索跟這些東西\n" +
                        "(露出保險箱裡的錢)" );
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (women,
                "哇!也太多錢了吧!" );

        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (druger,
                "都拿著，先回去大廳跟所有人會合!\n" );


        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);
        eventManager.addEvent(event5);
        eventManager.addEvent(event6);
        eventManager.addEvent(event7);
        eventManager.addEvent(event8);

        eventManager.play("藏槍");

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
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(回到大廳)").setBackgroundDrawable(lobby).setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("怎麼了?為什麼氣氛這麼凝重?");
        KWThirdPersonEventModel  event3 = new KWThirdPersonEventModel (suitman,
                "我…我…");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (suitman,
                "我看到又有一具屍體藏在房間裡!\n" +
                        "(神情緊張)");
        event3.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (strongman,
                "我看了他的錢包\n" +
                        "他的名字應該叫做BR");
        KWThirdPersonEventModel  event6 = new KWThirdPersonEventModel (strongman,
                "有人認識嗎?");
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (gangster,
                "老子沒聽過");
        event7.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (women,
                "我也不認識");
        event8.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event9 = new KWThirdPersonEventModel (druger,
                "(搖搖頭)");
        event9.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event10 = new KWFirstPersonEventModel (
                "我剛剛在一間房間裡面有看到這個名字\n" +
                        "他應該是這旅館的主人");
        KWFirstPersonEventModel  event11 = new KWFirstPersonEventModel (
                "所以門口的字條跟玻璃罐應該都是兇手留的!");
        KWThirdPersonEventModel  event12 = new KWThirdPersonEventModel (druger,
                "我們剛剛發現變電箱裡面的電線\n" +
                        "用一個定時機關綁著\n" +
                        "只要時間一到就會斷掉" );
        KWThirdPersonEventModel  event13 = new KWThirdPersonEventModel (druger,
                "所以剛剛的停電是人為的!");
        KWThirdPersonEventModel  event14 = new KWThirdPersonEventModel (gangster,
                "兇手的目的是什麼?" );
        event14.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event15 = new KWThirdPersonEventModel (gangster,
                "我們彼此都不認識");
        KWThirdPersonEventModel  event16 = new KWThirdPersonEventModel (gangster,
                "把我們的輪胎都扎破\n" +
                        "還在我們打電話的時候造成停電");
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (strongman,
                "看起來兇手不想讓我們走");
        event17.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (gangster,
                "等等…這樣的話…");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (gangster,
                "電話線!");
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (gangster,
                "幹林娘機掰，被剪斷了");
        KWThirdPersonEventModel  event21 = new KWThirdPersonEventModel (suitman,
                "怎麼辦!!!這樣我們怎麼求救?");
        event21.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event22 = new KWFirstPersonEventModel (
                        "不用擔心\n" +
                        "剛剛有接通");
        KWFirstPersonEventModel  event23 = new KWFirstPersonEventModel (
                "說已經派警員過來了!");
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (suitman,
                "太好了");
        KWFirstPersonEventModel  event25 = new KWFirstPersonEventModel (
                    "對了我還發現這些東西\n" +
                        "(拿出全部的錢)");
        KWFirstPersonEventModel  event26 = new KWFirstPersonEventModel (
                "這些都是在那個叫BR的房間找到的\n" +
                        "等等一起拿給警察吧!");
        KWThirdPersonEventModel  event27 = new KWThirdPersonEventModel (gangster,
                "你瘋了嗎?幹嘛給警察?");
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (gangster,
                "當然是分了阿");
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (gangster,
                "你不說我不說\n" +
                        "誰會知道這是誰的錢?");
        KWFirstPersonEventModel  event30 = new KWFirstPersonEventModel (
                "這樣不好吧…");
        KWThirdPersonEventModel  event31 = new KWThirdPersonEventModel (druger,
                "我覺得蠻有道理的\n" +
                        "幹嘛跟錢過不去");
        event31.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event32 = new KWThirdPersonEventModel (suitman,
                "等一下");
        KWThirdPersonEventModel  event33 = new KWThirdPersonEventModel (suitman,
                "要分也是平分吧\n" +
                        "不能…" );
        KWThirdPersonEventModel  event34 = new KWThirdPersonEventModel (suitman,
                "(看向流氓跟壯漢)");
        KWThirdPersonEventModel  event35 = new KWThirdPersonEventModel (suitman,
                "不能有人多拿吧!");
        KWThirdPersonEventModel  event36 = new KWThirdPersonEventModel (strongman,
                "(不發一語)");
        event36.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event37 = new KWThirdPersonEventModel (strongman,
                "(但是也沒有拒絕)");
        KWThirdPersonEventModel  event38 = new KWThirdPersonEventModel (women,
                "(眼神飄移)");
        event38.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event39 = new KWThirdPersonEventModel (gangster,
                "既然沒人反對就一致通過囉");
        event39.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event40 = new KWThirdPersonEventModel (gangster,
                "誰也別給老子跑去洩密\n" +
                        "不然我讓他吃不完兜著走!");
        KWThirdPersonEventModel  event41 = new KWThirdPersonEventModel (gangster,
                "(伸手拿走一部份的錢)");
        KWThirdPersonEventModel event42 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event43 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event44 = new KWFirstPersonEventModel (
                "(其他人也一個個跟著拿走自己那部分)" );
        KWFirstPersonEventModel  event45 = new KWFirstPersonEventModel (
                "算了!反正死人也用不到錢" );
        KWFirstPersonEventModel  event46 = new KWFirstPersonEventModel (
                "我也把錢花得差不多了\n" +
                        "這筆錢也能讓我更好的在新城市立足" );
        KWFirstPersonEventModel  event47 = new KWFirstPersonEventModel (
                "(把自己那部分收到口袋中)" );
        KWFirstPersonEventModel  event48 = new KWFirstPersonEventModel (
                "那個…" );
        KWFirstPersonEventModel  event49 = new KWFirstPersonEventModel (
                "還有一件事" );
        KWFirstPersonEventModel  event50 = new KWFirstPersonEventModel (
                "我還發現這個\n" +
                        "(拿出那把槍)" );
        KWThirdPersonEventModel  event51 = new KWThirdPersonEventModel (suitman,
                "這麼危險的東西還是我來保管好了\n" +
                        "(伸手拿槍)\n");
        event51.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event52 = new KWThirdPersonEventModel (gangster,
                "誰他媽准你拿的!\n" +
                        "(把手打掉)");
        event52.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event53 = new KWThirdPersonEventModel (gangster,
                "應該要放我這裡!");
        KWThirdPersonEventModel  event54 = new KWThirdPersonEventModel (strongman,
                "有人同意了嗎?\n" +
                        "(伸手阻攔)");
        event54.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event55 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event56 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event57 = new KWFirstPersonEventModel (
                "(氣氛逐漸緊張)" );
        KWFirstPersonEventModel  event58 = new KWFirstPersonEventModel (
                "別吵了!" );
        KWFirstPersonEventModel  event59 = new KWFirstPersonEventModel (
                "等等警察就會來\n" +
                        "這個還是大家暫時一起保管" );
        KWFirstPersonEventModel  event60 = new KWFirstPersonEventModel (
                "等警察到了\n" +
                        "就交給警察處理!" );
        KWThirdPersonEventModel  event61 = new KWThirdPersonEventModel (druger,
                "我同意");
        event61.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event62 = new KWThirdPersonEventModel (women,
                "我也是");
        event62.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event63 = new KWThirdPersonEventModel (strongman,
                "…");
        event63.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event64 = new KWThirdPersonEventModel (gangster,
                "…");
        event64.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event65 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event66 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event67 = new KWFirstPersonEventModel (
                "(最後經過一番爭執之後)");
        KWFirstPersonEventModel  event68 = new KWFirstPersonEventModel (
                "(在大家一致同意下，把槍拆成好幾個部分)\n" +
                        "(由眾人分別保管)" );
        KWThirdPersonEventModel  event69 = new KWThirdPersonEventModel (druger,
                "沒事的話我就回去房間了\n" +
                        "(急匆匆的跑走)");
        event69.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event70 = new KWThirdPersonEventModel (gangster,
                "我也是");
        event70.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event71 = new KWThirdPersonEventModel (women,
                "你們不待在一起嗎?\n" +
                        "我們都還不知道兇手是誰?");
        event71.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event72 = new KWThirdPersonEventModel (suitman,
                "對阿大家應該要聚在一起\n" +
                        "你們跟我們一起留在大廳吧!");
        event72.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel  event73 = new KWFirstPersonEventModel (
                "他們應該是急著去把房間裡的違法物品處理乾淨吧...");
        KWThirdPersonEventModel  event74 = new KWThirdPersonEventModel (strongman,
                "(默默找椅子坐了下來)");
        event74.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event75 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event76 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event77 = new KWFirstPersonEventModel (
                "(就這樣我們四個留在大廳彼此互相聊天)");
        KWFirstPersonEventModel  event78 = new KWFirstPersonEventModel (
                "(而其他兩人也在一段時間過後回到了大廳加入我們)");
        KWFirstPersonEventModel  event79 = new KWFirstPersonEventModel (
                "(互相知道了對方的名字、職業、興趣)\n" +
                        "(但在聊天的過程中我卻不禁在想…)");
        KWFirstPersonEventModel  event80 = new KWFirstPersonEventModel (
                "(如果少一個人的話...)");
        KWFirstPersonEventModel  event81 = new KWFirstPersonEventModel (
                "(是不是能分到更多的錢?)");

        //KWThirdPersonEventModel event15 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
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
        eventManager.addEvent(event77);
        eventManager.addEvent(event78);
        eventManager.addEvent(event79);
        eventManager.addEvent(event80);
        eventManager.addEvent(event81);
        eventManager.play("不藏槍的討論");
    }
    public static void scene_1_5(Context context, KWEventManager eventManager) {
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
                new KWFirstPersonEventModel("(回到大廳)").setBackgroundDrawable(lobby).setBackgroundMusicResouceId(R.raw.bgm_mystery);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("怎麼了?為什麼氣氛這麼凝重?");
        KWThirdPersonEventModel  event3 = new KWThirdPersonEventModel (suitman,
                "我…我…");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (suitman,
                "我看到又有一具屍體藏在房間裡!\n" +
                        "(神情緊張)");
        event3.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event5 = new KWThirdPersonEventModel (strongman,
                "我看了他的錢包\n" +
                        "他的名字應該叫做BR");
        KWThirdPersonEventModel  event6 = new KWThirdPersonEventModel (strongman,
                "有人認識嗎?");
        event5.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event7 = new KWThirdPersonEventModel (gangster,
                "老子沒聽過");
        event7.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (women,
                "我也不認識");
        event8.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event9 = new KWThirdPersonEventModel (druger,
                "(搖搖頭)");
        event9.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event10 = new KWFirstPersonEventModel (
                "我剛剛在一間房間裡面有看到這個名字\n" +
                        "他應該是這旅館的主人");
        KWFirstPersonEventModel  event11 = new KWFirstPersonEventModel (
                "所以門口的字條跟玻璃罐應該都是兇手留的!");
        KWThirdPersonEventModel  event12 = new KWThirdPersonEventModel (druger,
                "我們剛剛發現變電箱裡面的電線\n" +
                        "用一個定時機關綁著\n" +
                        "只要時間一到就會斷掉" );
        KWThirdPersonEventModel  event13 = new KWThirdPersonEventModel (druger,
                "所以剛剛的停電是人為的!");
        KWThirdPersonEventModel  event14 = new KWThirdPersonEventModel (gangster,
                "兇手的目的是什麼?" );
        event14.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event15 = new KWThirdPersonEventModel (gangster,
                "我們彼此都不認識");
        KWThirdPersonEventModel  event16 = new KWThirdPersonEventModel (gangster,
                "把我們的輪胎都扎破\n" +
                        "還在我們打電話的時候造成停電");
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (strongman,
                "看起來兇手不想讓我們走");
        event17.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (gangster,
                "等等…這樣的話…");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (gangster,
                "電話線!");
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (gangster,
                "幹林娘機掰，被剪斷了");
        KWThirdPersonEventModel  event21 = new KWThirdPersonEventModel (suitman,
                "怎麼辦!!!這樣我們怎麼求救?");
        event21.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event22 = new KWFirstPersonEventModel (
                "不用擔心\n" +
                        "剛剛有接通");
        KWFirstPersonEventModel  event23 = new KWFirstPersonEventModel (
                "說已經派警員過來了!");
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (suitman,
                "太好了");
        KWFirstPersonEventModel  event25 = new KWFirstPersonEventModel (
                "對了我還發現這些東西\n" +
                        "(拿出全部的錢)");
        KWFirstPersonEventModel  event26 = new KWFirstPersonEventModel (
                "這些都是在那個叫BR的房間找到的\n" +
                        "等等一起拿給警察吧!");
        KWThirdPersonEventModel  event27 = new KWThirdPersonEventModel (gangster,
                "你瘋了嗎?幹嘛給警察?");
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (gangster,
                "當然是分了阿");
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (gangster,
                "你不說我不說\n" +
                        "誰會知道這是誰的錢?");
        KWFirstPersonEventModel  event30 = new KWFirstPersonEventModel (
                "這樣不好吧…");
        KWThirdPersonEventModel  event31 = new KWThirdPersonEventModel (druger,
                "我覺得蠻有道理的\n" +
                        "幹嘛跟錢過不去");
        event31.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event32 = new KWThirdPersonEventModel (suitman,
                "等一下");
        KWThirdPersonEventModel  event33 = new KWThirdPersonEventModel (suitman,
                "要分也是平分吧\n" +
                        "不能…" );
        KWThirdPersonEventModel  event34 = new KWThirdPersonEventModel (suitman,
                "(看向流氓跟壯漢)");
        KWThirdPersonEventModel  event35 = new KWThirdPersonEventModel (suitman,
                "不能有人多拿吧!");
        KWThirdPersonEventModel  event36 = new KWThirdPersonEventModel (strongman,
                "(不發一語)");
        event36.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event37 = new KWThirdPersonEventModel (strongman,
                "(但是也沒有拒絕)");
        KWThirdPersonEventModel  event38 = new KWThirdPersonEventModel (women,
                "(眼神飄移)");
        event38.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event39 = new KWThirdPersonEventModel (gangster,
                "既然沒人反對就一致通過囉");
        event39.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event40 = new KWThirdPersonEventModel (gangster,
                "誰也別給老子跑去洩密\n" +
                        "不然我讓他吃不完兜著走!");
        KWThirdPersonEventModel  event41 = new KWThirdPersonEventModel (gangster,
                "(伸手拿走一部份的錢)");
        KWThirdPersonEventModel event42 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event43 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event44 = new KWFirstPersonEventModel (
                "(其他人也一個個跟著拿走自己那部分)" );
        KWFirstPersonEventModel  event45 = new KWFirstPersonEventModel (
                "算了!反正死人也用不錢" );
        KWFirstPersonEventModel  event46 = new KWFirstPersonEventModel (
                "我也把錢花得差不多了\n" +
                        "這筆錢也能讓我更好的在新城市立足" );
        KWFirstPersonEventModel  event47 = new KWFirstPersonEventModel (
                "(把自己那部分收到口袋中)" );
        KWThirdPersonEventModel  event69 = new KWThirdPersonEventModel (druger,
                "沒事的話我就回去房間了\n" +
                        "(急匆匆的跑走)");
        event69.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event70 = new KWThirdPersonEventModel (gangster,
                "我也是");
        event70.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event71 = new KWThirdPersonEventModel (women,
                "你們不待在一起嗎?\n" +
                        "我們都還不知道兇手是誰?");
        event71.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event72 = new KWThirdPersonEventModel (suitman,
                "對阿大家應該要聚在一起\n" +
                        "你們跟我們一起留在大廳吧!");
        event72.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel  event73 = new KWFirstPersonEventModel (
                "他們應該是急著去把房間裡的違法物品處理乾淨吧...");
        KWThirdPersonEventModel  event74 = new KWThirdPersonEventModel (strongman,
                "(默默找椅子坐了下來)");
        event74.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel event75 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event76 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event77 = new KWFirstPersonEventModel (
                "(就這樣我們四個留在大廳彼此互相聊天)");
        KWFirstPersonEventModel  event78 = new KWFirstPersonEventModel (
                "(而其他兩人也在一段時間過後回到了大廳加入我們)");
        KWFirstPersonEventModel  event79 = new KWFirstPersonEventModel (
                "(互相知道了對方的名字、職業、興趣)\n" +
                        "(但在聊天的過程中我卻不禁在想…)");
        KWFirstPersonEventModel  event80 = new KWFirstPersonEventModel (
                "(如果少一個人的話...)");
        KWFirstPersonEventModel  event81 = new KWFirstPersonEventModel (
                "(是不是能分到更多的錢?)");


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
        eventManager.addEvent(event69);
        eventManager.addEvent(event70);
        eventManager.addEvent(event71);
        eventManager.addEvent(event72);
        eventManager.addEvent(event73);
        eventManager.addEvent(event74);
        eventManager.addEvent(event75);
        eventManager.addEvent(event76);
        eventManager.addEvent(event77);
        eventManager.addEvent(event78);
        eventManager.addEvent(event79);
        eventManager.addEvent(event80);
        eventManager.addEvent(event81);
        eventManager.play("藏槍的討論");
    }
    public static void scene_1_6(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context,"police","約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context,"druger","哈利");
        KWCharacterModel suitman = new KWCharacterModel(context,"suitman","提姆");
        KWCharacterModel gangster = new KWCharacterModel(context,"gangster","萊特");
        KWCharacterModel women = new KWCharacterModel(context,"women","珍");
        KWCharacterModel strongman = new KWCharacterModel(context,"strongman","霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);
        Drawable paper_2 = KWResourceUtils.getDrawableByResourceId(context, R.drawable.paper_2);
        KWThirdPersonEventModel  event1 = new KWThirdPersonEventModel (women,
                "原來你有個女兒在醫院阿").setBackgroundDrawable(lobby).setBackgroundMusicResouceId(R.raw.bgm_mystery);;
        event1.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event2 = new KWThirdPersonEventModel (strongman,
                "對");
        event2.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event3 = new KWThirdPersonEventModel (strongman,
                "我願意為她做任何事!");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (suitman,
                "真看不出來\n" +
                        "原來你有個女兒\n");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel("我能體會\n" +
                        "我也有相同的經歷...");
        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("不過我的妻子");
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel("已經…過世了…");
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (strongman,
                "請節哀");
        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel("沒事!我已經走出來了\n" +
                        "要邁向新的生活了");
        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event11 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event12 =
                new KWFirstPersonEventModel("(這時門突然打開)");
        KWThirdPersonEventModel  event13 = new KWThirdPersonEventModel (police,
                "...");
        event13.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel event14 =
                new KWFirstPersonEventModel("真快!半小時就來了!");
        KWFirstPersonEventModel event15 =
                new KWFirstPersonEventModel("怎麼是他?!");
        KWFirstPersonEventModel event16 =
                new KWFirstPersonEventModel("他不是我原來城市的警官嗎?\n" +
                        "他怎麼會在這?");
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (suitman,
                "你是警察吧!?");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (suitman,
                "我們等了好久");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (police,
                "對!對!對!\n" +
                        "我就是來調查凶殺案的");
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (police,
                "每個人把證件拿出來\n" +
                        "兩具屍體在哪裡?");

        KWThirdPersonEventModel  event22 = new KWThirdPersonEventModel (suitman,
                "警官你趕快調查完\n" +
                        "然後帶我們離開!");
        KWThirdPersonEventModel  event23 = new KWThirdPersonEventModel (suitman,
                "我後面還有事情要忙");
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (police,
                "我也想帶你們離開");
        KWThirdPersonEventModel  event25 = new KWThirdPersonEventModel (police,
                "但是外面風雨太大了\n" +
                        "根本不能開車!");
        KWThirdPersonEventModel  event26 = new KWThirdPersonEventModel (police,
                "而且這場雨可能要持續一兩天...");
        KWThirdPersonEventModel  event27 = new KWThirdPersonEventModel (suitman,
                "沒有其他警察來嗎?");
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (police,
                "那個…局裡人手吃緊");
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (police,
                "就只有我一個過來");
        KWThirdPersonEventModel  event30 = new KWThirdPersonEventModel (police,
                "別問這麼多\n" +
                        "乖乖配合調查");

        KWThirdPersonEventModel event31 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event32 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event33 =
                new KWFirstPersonEventModel("(就這樣警察去看過案發現場)\n" +
                        "(我們也把槍交給警察)");
        KWFirstPersonEventModel event34 =
                new KWFirstPersonEventModel("(我們各自被叫到房間分開問話)\n" +
                        "(時間就到了晚上)");
        KWFirstPersonEventModel event35 =
                new KWFirstPersonEventModel("(回到自己房間)").setBackgroundDrawable(room);
        KWFirstPersonEventModel event36 =
                new KWFirstPersonEventModel("他居然也認出我了");
        KWFirstPersonEventModel event37 =
                new KWFirstPersonEventModel("還用那種懷疑的眼神看著我!");
        KWFirstPersonEventModel event38 =
                new KWFirstPersonEventModel("不會又跟那次一樣對我百般刁難吧");
        KWFirstPersonEventModel event39 =
                new KWFirstPersonEventModel("哀...\n" +
                        "希望能趕快查出兇手");
        KWFirstPersonEventModel event40 =
                new KWFirstPersonEventModel("然後離開這鬼地方");
        KWFirstPersonEventModel event41 =
                new KWFirstPersonEventModel("(關燈睡覺)").setBackgroundDrawable(dark);
        KWFirstPersonEventModel event42 =
                new KWFirstPersonEventModel("(過了許久)");
        KWFirstPersonEventModel event43 =
                new KWFirstPersonEventModel("(砰!!!)").setSouncEffectResouceId(R.raw.explosion2);
        KWFirstPersonEventModel event44 =
                new KWFirstPersonEventModel("(又怎麼了)");
        KWFirstPersonEventModel event45 =
                new KWFirstPersonEventModel("(跑出門外)").setBackgroundDrawable(hotel);
        KWFirstPersonEventModel event46 =
                new KWFirstPersonEventModel("(車棚下霍普的車正燃起熊熊大火)");
        KWFirstPersonEventModel event47 =
                new KWFirstPersonEventModel("(所有人陸陸續續跑出來)");
        KWThirdPersonEventModel  event48 = new KWThirdPersonEventModel (police,
                "這兇手也太囂張了吧\n" +
                        "這是在挑釁我嗎?");
        event48.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event49 = new KWThirdPersonEventModel (suitman,
                "等等那是什麼?\n" +
                        "車裡好像有人?!\n");
        event49.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event50 = new KWThirdPersonEventModel (druger,
                "好像是萊特!!!");
        event50.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event51 = new KWThirdPersonEventModel (gangster,
                "(在大火中劇烈掙扎)");
        event51.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event52 = new KWThirdPersonEventModel (women,
                "趕快把雨棚拆下來!!!");
        event52.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event53 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event54 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event55 =
                new KWFirstPersonEventModel("(大家趕緊把雨棚拆下來用暴雨澆熄大火)");
        KWFirstPersonEventModel event56 =
                new KWFirstPersonEventModel("(在一陣慌亂之下火終於熄滅了)");
        KWFirstPersonEventModel event57 =
                new KWFirstPersonEventModel("(但是一切都太遲了)");
        KWFirstPersonEventModel event58 =
                new KWFirstPersonEventModel("(萊特還是活活被燒死了…)");
        KWFirstPersonEventModel event59 =
                new KWFirstPersonEventModel("【大家這時才看到旁邊的汽車上面刻著greedy(貪婪)】");
        KWThirdPersonEventModel  event60 = new KWThirdPersonEventModel (druger,
                "難道?\n" +
                        "(跑回旅館)\n");
        event60.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event61 = new KWThirdPersonEventModel (suitman,
                "不會是…因為那筆錢吧?(小聲)");
        event61.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event62 = new KWThirdPersonEventModel (police,
                "什麼錢?");
        event62.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event63 = new KWFirstPersonEventModel ("(大家最後只好把分錢的事情說出來)");
        KWFirstPersonEventModel  event64 = new KWFirstPersonEventModel ("(回到大廳)").setBackgroundDrawable(lobby);
        KWThirdPersonEventModel  event65 = new KWThirdPersonEventModel (druger,
                "萊特的那些錢不見了");
        event65.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event66 = new KWThirdPersonEventModel (police,
                "你們居然沒有告訴我這件事?\n" +
                        "(意味深長地看向大家)");
        KWThirdPersonEventModel  event67 = new KWThirdPersonEventModel (druger,
                "(把視線飄走)");
        KWThirdPersonEventModel  event68 = new KWThirdPersonEventModel (police,
                "那我們就檢查一下所有人的房間吧");
        KWThirdPersonEventModel event69 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event70 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event71 = new KWFirstPersonEventModel ("(經過一番搜索)");
        KWFirstPersonEventModel  event72 = new KWFirstPersonEventModel ("(在霍普的房間找到那筆錢)");
        KWThirdPersonEventModel  event73 = new KWThirdPersonEventModel (suitman,
                "我就知道是你!");
        event73.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event74 = new KWThirdPersonEventModel (suitman,
                "你一定是為了用這筆錢支付女兒的醫藥費\n" +
                        "才殺了萊特\n");
        KWThirdPersonEventModel  event75 = new KWThirdPersonEventModel (suitman,
                "也是因為保險箱裡的錢，\n" +
                        "旅館主人才被你殺了對吧!" );
        KWThirdPersonEventModel  event76 = new KWThirdPersonEventModel (suitman,
                 "警官趕快把他綁起來!\n");
        KWThirdPersonEventModel  event77 = new KWThirdPersonEventModel (strongman,
                "不是這樣的");
        event77.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event78 = new KWThirdPersonEventModel (strongman,
                "真的不是我幹的\n" +
                        "我只拿我的那部份而已\n");
        KWThirdPersonEventModel  event79 = new KWThirdPersonEventModel (strongman,
                "是有人故意放到我房間栽贓我的!");
        KWThirdPersonEventModel  event80 = new KWThirdPersonEventModel (suitman,
                "怎麼可能那麼剛好!\n");
        KWThirdPersonEventModel  event81 = new KWThirdPersonEventModel (suitman,
                "而且這裡只有你能把一個大男人扛到停車場\n" +
                        "怎麼可能不是你!\n");
        KWThirdPersonEventModel  event82 = new KWThirdPersonEventModel (strongman,
                "真的不是我!\n" +
                        "誰會燒自己的車阿!\n" +
                        "還這麼明顯的把錢藏到自己房間!\n");
        KWThirdPersonEventModel  event83 = new KWThirdPersonEventModel (suitman,
                "你一定是為了取信大家才故意這麼做\n" +
                        "讓大家覺得太明顯\n" +
                        "才不會懷疑你\n");
        KWThirdPersonEventModel event84 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event85 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event86 = new KWFirstPersonEventModel ("(所有人又被警察單獨詢問晚上的行蹤)");
        KWFirstPersonEventModel  event87 = new KWFirstPersonEventModel ("(因為沒有任何發現)");
        KWFirstPersonEventModel  event88 = new KWFirstPersonEventModel ("(所以大家只好回到房間)").setBackgroundDrawable(room);
        KWFirstPersonEventModel  event89 = new KWFirstPersonEventModel ("怎麼可能睡得著…");
        KWFirstPersonEventModel  event90 = new KWFirstPersonEventModel ("接二連三發生凶殺案");
        KWFirstPersonEventModel  event91 = new KWFirstPersonEventModel ("現在又沒辦法離開");
        KWFirstPersonEventModel  event92 = new KWFirstPersonEventModel ("我會不會死在這…");
        KWFirstPersonEventModel  event93 = new KWFirstPersonEventModel ("(就這樣胡思亂想到了半夜)");
        KWFirstPersonEventModel event94 =
                new KWFirstPersonEventModel("(敲門聲)").setSouncEffectResouceId(R.raw.knocking_a_wooden_door2)
                        .setBackgroundDrawable(dark).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWThirdPersonEventModel  event95 = new KWThirdPersonEventModel (police,
                "嘿安迪，\n" +
                        "我發現了新的線索" ).setBackgroundDrawable(corridor);
        KWThirdPersonEventModel  event96 = new KWThirdPersonEventModel (police,
                "不介意的話\n" +
                        "跟我一起去看看吧\n" );

        KWThirdPersonEventModel event97 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event98 =
                new KWFirstPersonEventModel("(到了旅館三樓的一處房間)");
        KWThirdPersonEventModel  event99 = new KWThirdPersonEventModel (police,
                "你看看\n" +
                        "你們提到的路線都不會經過這裡\n");
        KWPictureEventModel eventa =
                new KWPictureEventModel(paper_2,"這就是所有人的筆錄嗎?\n" +
                        "全部都是約瑟警官手寫的\n" +
                        "真的都沒有人說的行蹤有經過這裡");
        KWThirdPersonEventModel  event100 = new KWThirdPersonEventModel (police,
                "但是這邊的門卻有開過的痕跡\n" );
        KWThirdPersonEventModel  event101 = new KWThirdPersonEventModel (police,
                "所以一定有人說謊\n" +
                        "(一邊說一邊觀察我的表情)\n" );
        KWFirstPersonEventModel event102 =
                new KWFirstPersonEventModel("你什麼意思?");
        KWThirdPersonEventModel  event103 = new KWThirdPersonEventModel (police,
                "沒事，進去看看吧\n" +
                        "你先請\n" );




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
        eventManager.addEvent(event77);
        eventManager.addEvent(event78);
        eventManager.addEvent(event79);
        eventManager.addEvent(event80);
        eventManager.addEvent(event81);
        eventManager.addEvent(event82);
        eventManager.addEvent(event83);
        eventManager.addEvent(event84);
        eventManager.addEvent(event85);
        eventManager.addEvent(event86);
        eventManager.addEvent(event87);
        eventManager.addEvent(event88);
        eventManager.addEvent(event89);
        eventManager.addEvent(event90);
        eventManager.addEvent(event91);
        eventManager.addEvent(event92);
        eventManager.addEvent(event93);
        eventManager.addEvent(event94);
        eventManager.addEvent(event95);
        eventManager.addEvent(event96);
        eventManager.addEvent(event97);
        eventManager.addEvent(event98);
        eventManager.addEvent(event99);
        eventManager.addEvent(eventa);
        eventManager.addEvent(event100);
        eventManager.addEvent(event101);
        eventManager.addEvent(event102);
        eventManager.addEvent(event103);
        eventManager.play("警察到來_不藏槍");
    }
    public static void scene_1_7(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWCharacterModel police = new KWCharacterModel(context,"police","約瑟警官");
        KWCharacterModel druger = new KWCharacterModel(context,"druger","哈利");
        KWCharacterModel suitman = new KWCharacterModel(context,"suitman","提姆");
        KWCharacterModel gangster = new KWCharacterModel(context,"gangster","萊特");
        KWCharacterModel women = new KWCharacterModel(context,"women","珍");
        KWCharacterModel strongman = new KWCharacterModel(context,"strongman","霍普");
        Drawable dark = KWResourceUtils.getDrawableByResourceId(context, R.drawable.dark);
        Drawable lobby = KWResourceUtils.getDrawableByResourceId(context, R.drawable.lobby);
        Drawable hotel = KWResourceUtils.getDrawableByResourceId(context, R.drawable.hotel);
        Drawable room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.room);
        Drawable corridor = KWResourceUtils.getDrawableByResourceId(context, R.drawable.corridor);
        Drawable boss_room = KWResourceUtils.getDrawableByResourceId(context, R.drawable.boss_room);
        Drawable paper_2 = KWResourceUtils.getDrawableByResourceId(context, R.drawable.paper_2);
        KWThirdPersonEventModel  event1 = new KWThirdPersonEventModel (women,
                "原來你有個女兒在醫院阿").setBackgroundDrawable(lobby).setBackgroundMusicResouceId(R.raw.bgm_mystery);;
        event1.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event2 = new KWThirdPersonEventModel (strongman,
                "對");
        event2.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event3 = new KWThirdPersonEventModel (strongman,
                "我願意為她做任何事!");
        KWThirdPersonEventModel  event4 = new KWThirdPersonEventModel (suitman,
                "真看不出來\n" +
                        "原來你有個女兒\n");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel event5 =
                new KWFirstPersonEventModel("我能體會\n" +
                        "我也有相同的經歷...");
        KWFirstPersonEventModel event6 =
                new KWFirstPersonEventModel("不過我的妻子");
        KWFirstPersonEventModel event7 =
                new KWFirstPersonEventModel("已經…過世了…");
        KWThirdPersonEventModel  event8 = new KWThirdPersonEventModel (strongman,
                "請節哀");
        KWFirstPersonEventModel event9 =
                new KWFirstPersonEventModel("沒事!我已經走出來了\n" +
                        "要邁向新的生活了");
        KWThirdPersonEventModel event10 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event11 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event12 =
                new KWFirstPersonEventModel("(這時門突然打開)");
        KWThirdPersonEventModel  event13 = new KWThirdPersonEventModel (police,
                "...");
        event13.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWFirstPersonEventModel event14 =
                new KWFirstPersonEventModel("真快!半小時就來了!");
        KWFirstPersonEventModel event15 =
                new KWFirstPersonEventModel("怎麼是他?!");
        KWFirstPersonEventModel event16 =
                new KWFirstPersonEventModel("他不是我原來城市的警官嗎?\n" +
                        "他怎麼會在這?");
        KWThirdPersonEventModel  event17 = new KWThirdPersonEventModel (suitman,
                "你是警察吧!?");
        event4.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event18 = new KWThirdPersonEventModel (suitman,
                "我們等了好久");
        KWThirdPersonEventModel  event19 = new KWThirdPersonEventModel (police,
                "對!對!對!\n" +
                        "我就是來調查凶殺案的");
        KWThirdPersonEventModel  event20 = new KWThirdPersonEventModel (police,
                "每個人把證件拿出來\n" +
                        "兩具屍體在哪裡?");

        KWThirdPersonEventModel  event22 = new KWThirdPersonEventModel (suitman,
                "警官你趕快調查完\n" +
                        "然後帶我們離開!");
        KWThirdPersonEventModel  event23 = new KWThirdPersonEventModel (suitman,
                "我後面還有事情要忙");
        KWThirdPersonEventModel  event24 = new KWThirdPersonEventModel (police,
                "我也想帶你們離開");
        KWThirdPersonEventModel  event25 = new KWThirdPersonEventModel (police,
                "但是外面風雨太大了\n" +
                        "根本不能開車!");
        KWThirdPersonEventModel  event26 = new KWThirdPersonEventModel (police,
                "而且這場雨可能要持續一兩天...");
        KWThirdPersonEventModel  event27 = new KWThirdPersonEventModel (suitman,
                "沒有其他警察來嗎?");
        KWThirdPersonEventModel  event28 = new KWThirdPersonEventModel (police,
                "那個…局裡人手吃緊");
        KWThirdPersonEventModel  event29 = new KWThirdPersonEventModel (police,
                "就只有我一個過來");
        KWThirdPersonEventModel  event30 = new KWThirdPersonEventModel (police,
                "別問這麼多\n" +
                        "乖乖配合調查");

        KWThirdPersonEventModel event31 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event32 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event33 =
                new KWFirstPersonEventModel("(就這樣警察去看過案發現場)\n" );
        KWFirstPersonEventModel event34 =
                new KWFirstPersonEventModel("(我們各自被叫到房間分開問話)\n" +
                        "(時間就到了晚上)");
        KWFirstPersonEventModel event35 =
                new KWFirstPersonEventModel("(回到自己房間)").setBackgroundDrawable(room);
        KWFirstPersonEventModel event36 =
                new KWFirstPersonEventModel("他居然也認出我了");
        KWFirstPersonEventModel event37 =
                new KWFirstPersonEventModel("還用那種懷疑的眼神看著我!");
        KWFirstPersonEventModel event38 =
                new KWFirstPersonEventModel("不會又跟那次一樣對我百般刁難吧");
        KWFirstPersonEventModel event39 =
                new KWFirstPersonEventModel("哀...\n" +
                        "希望能趕快查出兇手");
        KWFirstPersonEventModel event40 =
                new KWFirstPersonEventModel("然後離開這鬼地方");
        KWFirstPersonEventModel event41 =
                new KWFirstPersonEventModel("(關燈睡覺)").setBackgroundDrawable(dark);
        KWFirstPersonEventModel event42 =
                new KWFirstPersonEventModel("(過了許久)");
        KWFirstPersonEventModel event43 =
                new KWFirstPersonEventModel("(砰!!!)").setSouncEffectResouceId(R.raw.explosion2);
        KWFirstPersonEventModel event44 =
                new KWFirstPersonEventModel("(又怎麼了)");
        KWFirstPersonEventModel event45 =
                new KWFirstPersonEventModel("(跑出門外)").setBackgroundDrawable(hotel);
        KWFirstPersonEventModel event46 =
                new KWFirstPersonEventModel("(車棚下霍普的車正燃起熊熊大火)");
        KWFirstPersonEventModel event47 =
                new KWFirstPersonEventModel("(所有人陸陸續續跑出來)");
        KWThirdPersonEventModel  event48 = new KWThirdPersonEventModel (police,
                "這兇手也太囂張了吧\n" +
                        "這是在挑釁我嗎?");
        event48.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event49 = new KWThirdPersonEventModel (suitman,
                "等等那是什麼?\n" +
                        "車裡好像有人?!\n");
        event49.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event50 = new KWThirdPersonEventModel (druger,
                "好像是萊特!!!");
        event50.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event51 = new KWThirdPersonEventModel (gangster,
                "(在大火中劇烈掙扎)");
        event51.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event52 = new KWThirdPersonEventModel (women,
                "趕快把雨棚拆下來!!!");
        event52.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel event53 = new KWThirdPersonEventModel(gangster).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event54 = new KWThirdPersonEventModel(women).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event55 =
                new KWFirstPersonEventModel("(大家趕緊把雨棚拆下來用暴雨澆熄大火)");
        KWFirstPersonEventModel event56 =
                new KWFirstPersonEventModel("(在一陣慌亂之下火終於熄滅了)");
        KWFirstPersonEventModel event57 =
                new KWFirstPersonEventModel("(但是一切都太遲了)");
        KWFirstPersonEventModel event58 =
                new KWFirstPersonEventModel("(萊特還是活活被燒死了…)");
        KWFirstPersonEventModel event59 =
                new KWFirstPersonEventModel("【大家這時才看到旁邊的汽車上面\n" +
                        "刻著greedy(貪婪)】");
        KWThirdPersonEventModel  event60 = new KWThirdPersonEventModel (druger,
                "難道?\n" +
                        "(跑回旅館)\n");
        event60.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event61 = new KWThirdPersonEventModel (suitman,
                "不會是…因為那筆錢吧?(小聲)");
        event61.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event62 = new KWThirdPersonEventModel (police,
                "什麼錢?");
        event62.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWFirstPersonEventModel  event63 = new KWFirstPersonEventModel ("(大家最後只好把分錢的事情說出來)");
        KWFirstPersonEventModel  event64 = new KWFirstPersonEventModel ("(回到大廳)").setBackgroundDrawable(lobby);
        KWThirdPersonEventModel  event65 = new KWThirdPersonEventModel (druger,
                "萊特的那些錢不見了");
        event65.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event66 = new KWThirdPersonEventModel (police,
                "你們居然沒有告訴我這件事?\n" +
                        "(意味深長地看向大家)");
        KWThirdPersonEventModel  event67 = new KWThirdPersonEventModel (druger,
                "(把視線飄走)");
        KWThirdPersonEventModel  event68 = new KWThirdPersonEventModel (police,
                "那我們就檢查一下所有人的房間吧");
        KWThirdPersonEventModel event69 = new KWThirdPersonEventModel(druger).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event70 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event71 = new KWFirstPersonEventModel ("(經過一番搜索)");
        KWFirstPersonEventModel  event72 = new KWFirstPersonEventModel ("(在霍普的房間找到那筆錢)");
        KWThirdPersonEventModel  event73 = new KWThirdPersonEventModel (suitman,
                "我就知道是你!");
        event73.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_RIGHT);
        KWThirdPersonEventModel  event74 = new KWThirdPersonEventModel (suitman,
                "你一定是為了用這筆錢支付女兒的醫藥費\n" +
                        "才殺了萊特\n");
        KWThirdPersonEventModel  event75 = new KWThirdPersonEventModel (suitman,
                "也是因為保險箱裡的錢，\n" +
                        "旅館主人才被你殺了對吧!" );
        KWThirdPersonEventModel  event76 = new KWThirdPersonEventModel (suitman,
                "警官趕快把他綁起來!\n");
        KWThirdPersonEventModel  event77 = new KWThirdPersonEventModel (strongman,
                "不是這樣的");
        event77.setCharacterPosition(KWEventModel.KW_EVENT_CHARACTER_POSITION_LEFT);
        KWThirdPersonEventModel  event78 = new KWThirdPersonEventModel (strongman,
                "真的不是我幹的\n" +
                        "我只拿我的那部份而已\n");
        KWThirdPersonEventModel  event79 = new KWThirdPersonEventModel (strongman,
                "是有人故意放到我房間栽贓我的!");
        KWThirdPersonEventModel  event80 = new KWThirdPersonEventModel (suitman,
                "怎麼可能那麼剛好!\n");
        KWThirdPersonEventModel  event81 = new KWThirdPersonEventModel (suitman,
                "而且這裡只有你能把一個大男人扛到停車場\n" +
                        "怎麼可能不是你!\n");
        KWThirdPersonEventModel  event82 = new KWThirdPersonEventModel (strongman,
                "真的不是我!\n" +
                        "誰會燒自己的車阿!\n" +
                        "還這麼明顯的把錢藏到自己房間!\n");
        KWThirdPersonEventModel  event83 = new KWThirdPersonEventModel (suitman,
                "你一定是為了取信大家才故意這麼做\n" +
                        "讓大家覺得太明顯\n" +
                        "才不會懷疑你\n");
        KWThirdPersonEventModel event84 = new KWThirdPersonEventModel(strongman).setCharacterImageVisibility(false);
        KWThirdPersonEventModel event85 = new KWThirdPersonEventModel(suitman).setCharacterImageVisibility(false);
        KWFirstPersonEventModel  event86 = new KWFirstPersonEventModel ("(所有人又被警察單獨詢問晚上的行蹤)");
        KWFirstPersonEventModel  event87 = new KWFirstPersonEventModel ("(因為沒有任何發現)");
        KWFirstPersonEventModel  event88 = new KWFirstPersonEventModel ("(所以大家只好回到房間)").setBackgroundDrawable(room);
        KWFirstPersonEventModel  event89 = new KWFirstPersonEventModel ("怎麼可能睡得著…");
        KWFirstPersonEventModel  event90 = new KWFirstPersonEventModel ("接二連三發生凶殺案");
        KWFirstPersonEventModel  event91 = new KWFirstPersonEventModel ("現在又沒辦法離開");
        KWFirstPersonEventModel  event92 = new KWFirstPersonEventModel ("我會不會死在這…");
        KWFirstPersonEventModel  event93 = new KWFirstPersonEventModel ("(就這樣胡思亂想到了半夜)");
        KWFirstPersonEventModel event94 =
                new KWFirstPersonEventModel("(敲門聲)").setSouncEffectResouceId(R.raw.knocking_a_wooden_door2)
                        .setBackgroundDrawable(dark).setBackgroundMusicResouceId(R.raw.bgm_main);
        KWThirdPersonEventModel  event95 = new KWThirdPersonEventModel (police,
                "嘿安迪，\n" +
                        "我發現了新的線索" ).setBackgroundDrawable(corridor);
        KWThirdPersonEventModel  event96 = new KWThirdPersonEventModel (police,
                "不介意的話\n" +
                        "跟我一起去看看吧\n" );

        KWThirdPersonEventModel event97 = new KWThirdPersonEventModel(police).setCharacterImageVisibility(false);
        KWFirstPersonEventModel event98 =
                new KWFirstPersonEventModel("(到了旅館三樓的一處房間)");
        KWThirdPersonEventModel  event99 = new KWThirdPersonEventModel (police,
                "你看看\n" +
                        "你們提到的路線都不會經過這裡\n");
        KWPictureEventModel eventa =
                new KWPictureEventModel(paper_2,"這就是所有人的筆錄嗎?\n" +
                        "全部都是約瑟警官手寫的\n" +
                        "真的都沒有人說的行蹤有經過這裡");
        KWThirdPersonEventModel  event100 = new KWThirdPersonEventModel (police,
                "但是這邊的門卻有開過的痕跡\n" );
        KWThirdPersonEventModel  event101 = new KWThirdPersonEventModel (police,
                "所以一定有人說謊\n" +
                        "(一邊說一邊觀察我的表情)\n" );
        KWFirstPersonEventModel event102 =
                new KWFirstPersonEventModel("你什麼意思?");
        KWThirdPersonEventModel  event103 = new KWThirdPersonEventModel (police,
                "沒事，進去看看吧\n" +
                        "你先請\n" );



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
        eventManager.addEvent(event77);
        eventManager.addEvent(event78);
        eventManager.addEvent(event79);
        eventManager.addEvent(event80);
        eventManager.addEvent(event81);
        eventManager.addEvent(event82);
        eventManager.addEvent(event83);
        eventManager.addEvent(event84);
        eventManager.addEvent(event85);
        eventManager.addEvent(event86);
        eventManager.addEvent(event87);
        eventManager.addEvent(event88);
        eventManager.addEvent(event89);
        eventManager.addEvent(event90);
        eventManager.addEvent(event91);
        eventManager.addEvent(event92);
        eventManager.addEvent(event93);
        eventManager.addEvent(event94);
        eventManager.addEvent(event95);
        eventManager.addEvent(event96);
        eventManager.addEvent(event97);
        eventManager.addEvent(event98);
        eventManager.addEvent(event99);
        eventManager.addEvent(eventa);
        eventManager.addEvent(event100);
        eventManager.addEvent(event101);
        eventManager.addEvent(event102);
        eventManager.addEvent(event103);
        eventManager.play("警察到來_藏槍");
    }


}