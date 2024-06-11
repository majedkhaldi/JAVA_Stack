import java.util.HashMap;
import java.util.Set;


public class Map {

    public static void main(String[] args) {
        HashMap <String,String> trackList = new HashMap <String,String>();
        trackList.put("Echoes of Tomorrow","In the still of the night, I hear echoes of tomorrow, Whispers of dreams yet to come, casting away my sorrow. Stars align in the sky, guiding me through the dark, With every step I take, I'm leaving a mark");
        trackList.put("Unbreakable Spirit","Through the storms and the rain, I rise above the pain, With an unbreakable spirit, I shatter every chain. No mountain too high, no valley too deep, With courage in my heart, my promises I keep");
        trackList.put("Dancing in the Moonlight","Beneath the silver moon, we sway in perfect time, Lost in the rhythm, your hand in mine. Stars whisper secrets, as we dance through the night, In this moment of magic, everything feels right");
        trackList.put("Waves of Time","Like waves crashing on the shore, memories come and go, Each one tells a story, of a time long ago. We ride the waves of time, through joy and through pain, Every sunset a promise, every sunrise a gain");
        trackList.put("Eternal Flame","In the heart of the darkness, a flame burns bright, A beacon of hope, in the coldest of night. No wind can extinguish, this eternal fire, Fueled by love and dreams, lifting us higher");


        String lyrics = trackList.get("Waves of Time");

        System.out.println(lyrics);

        Set<String> keys = trackList.keySet();
        for (String i : keys){
            System.out.println(i + " : " + trackList.get(i));
        }
}
}
