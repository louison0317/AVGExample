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

public class MyStory_room_insure_Utils{

    public static void scene_1_1(Context context, KWEventManager eventManager) {
        eventManager.stop();

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("看起來剛剛看到的名字\n" +
                        "對應著四位數密碼!")
                       .setBackgroundMusicResouceId(R.raw.bgm_main);
        KWFirstPersonEventModel event2 =
                new KWFirstPersonEventModel("應該要用密碼紙轉換\n" +
                        "然後用按鍵輸入");
        KWFirstPersonEventModel event3 =
                new KWFirstPersonEventModel("之後按E(enter)來確認密碼\n" +
                        "輸入錯了也能按C(clear)來刪除密碼");
        KWFirstPersonEventModel event4 =
                new KWFirstPersonEventModel("會是BR還是H呢?");

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);
        eventManager.addEvent(event4);

        eventManager.play("密碼提示");
    }
    public static void scene_1_2(Context context, KWEventManager eventManager) {
        eventManager.stop();

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("解開了!\n" +
                        "讓我看看裡面有什麼吧!")
                        .setBackgroundMusicResouceId(R.raw.bgm_main);


        eventManager.addEvent(event1);


        eventManager.play("答對");
    }
    public static void scene_1_3(Context context, KWEventManager eventManager) {
        eventManager.stop();

        KWFirstPersonEventModel event1 =
                new KWFirstPersonEventModel("看起來答錯了呢...\n" +
                        "換個名子試試好了\n" +
                        "應該是BR或著H其中一個!")
                        .setBackgroundMusicResouceId(R.raw.bgm_main);

        eventManager.addEvent(event1);


        eventManager.play("答錯");
    }
}