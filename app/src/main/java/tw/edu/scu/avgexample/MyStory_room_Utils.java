package tw.edu.scu.avgexample;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import tw.edu.scu.avgexample.R;
import tw.edu.scu.avgexample.framework.KWEventManager;
import tw.edu.scu.avgexample.framework.model.KWCharacterModel;
import tw.edu.scu.avgexample.framework.model.KWEventModel;
import tw.edu.scu.avgexample.framework.model.KWFirstPersonEventModel;
import tw.edu.scu.avgexample.framework.model.KWOptionEventModel;
import tw.edu.scu.avgexample.framework.model.KWPictureEventModel;
import tw.edu.scu.avgexample.framework.model.KWThirdPersonEventModel;
import tw.edu.scu.avgexample.framework.utility.KWResourceUtils;
import tw.edu.scu.avgexample.sample.SampleGlobalData;
import android.os.Bundle;

public class MyStory_room_Utils  {

    public static void scene_1_1(Context context, KWEventManager eventManager) {
        eventManager.stop();

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("(進入房間)").setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("電腦是亮著的\n" +
                        "旁邊似乎有張紙\n" +
                        "桌子底下好像有個櫃子…\n");


        eventManager.addEvent(event1);
        eventManager.addEvent(event2);


        eventManager.play("進入老闆房間");
    }
    public static void scene_1_2(Context context, KWEventManager eventManager) {
        eventManager.stop();
        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("電腦雖然亮著\n" +
                        "但是鎖起來了!\n" +
                        "根本不能用...").setBackgroundMusicResouceId(R.raw.bgm_main);
        eventManager.addEvent(event1);

        eventManager.play("電腦");
    }
    public static void scene_1_3(Context context, KWEventManager eventManager) {
        eventManager.stop();
        Drawable paper = KWResourceUtils.getDrawableByResourceId(context, R.drawable.paper);
        KWPictureEventModel event1 =
                new KWPictureEventModel(paper,"這封信..." +
                        "是有人要來找旅館主人嗎?").setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("旅館主人是BR\n" +
                        "訪客是H\n" +
                        "這兩個名子我記住了!");
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        KWPictureEventModel event3 =
                new KWPictureEventModel(paper,"旅館主人是BR\n" +
                        "訪客是H\n" +
                        "這兩個名子我記住了!");


        eventManager.play("信");
    }
    public static void scene_1_4(Context context, KWEventManager eventManager) {
        eventManager.stop();
        Drawable insure = KWResourceUtils.getDrawableByResourceId(context, R.drawable.insure);
        KWPictureEventModel event1 =
                new KWPictureEventModel(insure,"上面有密碼鎖" +
                        "又有張密碼紙").setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("根據上面的內容還有密碼鎖\n" +
                        "應該是用兩個英文字轉換成四位數密碼");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);

        eventManager.play("保險箱");
    }

}