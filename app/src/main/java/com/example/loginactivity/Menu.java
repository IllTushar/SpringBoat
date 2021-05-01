package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Chal gar chale
        String s1 = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/01%20-%20Chal%20Ghar%20Chalen%20-%20Malang%202020.mp3?alt=media&token=d2d470e2-ae77-4c4d-ab5b-760f2bce05ff";
        //Odhni
        String s2 = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/01%20-%20Odhani%20-%20Made%20in%20China%20(2019).mp3?alt=media&token=2fd56a44-645d-467a-b0fe-b52ac4889976";
        String s3 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/01%20-%20Shayad%20-%20Love%20Aaj%20Kal%20(2020).mp3?alt=media&token=2ae4d80f-80d8-4f75-88cd-6b0b56045b59";
        String s4 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/01%20-%20Tum%20Hi%20Ho%20-%20PagalSongs.com.mp3?alt=media&token=95e7af63-e28a-4e38-b864-299fe1b057e1";
        String s5 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/02%20-%20Samjhawan%20-%20HSKD(2014).mp3?alt=media&token=d7b888ca-46fc-43dd-87cb-30d2df0d0974";
        String s6 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/03%20-%20Dil%20Mein%20Ho%20Tum%20-%20WCI%20(2019).mp3?alt=media&token=c5de38ce-ef41-46d5-9a12-9158848d086d";
        String s7 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/03%20-%20Mehrama%20-%20Love%20Aaj%20Kal%20(2020).mp3?alt=media&token=43790ad2-cd9c-4b7e-a63d-f336aa66b74d";
        String s8 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/03%20-%20Qaafirana%20-%20Kedarnath%20(2018).mp3?alt=media&token=a5b0383f-727a-4abb-af18-ad78aeaf1630";
        String s9 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/03%20-%20Thodi%20Jagah%20-%20Marjaavaan%20(2019).mp3?alt=media&token=47457ba2-93d1-4e8c-b9ea-9577a6fc4286";
        String s10 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Tu%20Mileya%20-%20Darshan%20Raval.mp3?alt=media&token=6e8b7cd0-4c57-4224-9a20-470b7fa55900";
        String s11 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Teri%20Aankhon%20Mein%20-%20Darshan%20Raval.mp3?alt=media&token=d2832d9f-5932-490d-b298-2a78af969581";
        String s12 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Tere%20Naal%20-%20Tulsi%20Kumar.mp3?alt=media&token=955ba500-dfec-47fc-8a79-792d27271ac0";
        String s13 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Tera%20Zikr%20-%20Darshan%20Raval.mp3?alt=media&token=2c3ba5a0-4b5d-4996-892d-ee70360ba50c";
        String s14 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Sing%20Me%20To%20Sleep(PagalWorld).mp3?alt=media&token=ba361a78-5adc-4985-a5cd-35f059057982";
        String s15 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Saari%20Ki%20Saari%202.0%20-%20Darshan%20Raval.mp3?alt=media&token=2f90bd86-f566-4a2e-a0ae-fb372d6c4e81";
        String s16 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Mujhe%20Peene%20Do%20-%20Darshan%20Raval.mp3?alt=media&token=48c752c2-6c1c-4a88-a23d-c2df55440d97";
        String s17 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/MSDhoni%20-%20Jab%20Tak.mp3?alt=media&token=77b5b3db-f555-472c-bcb9-6fe0d7cef73c";
        String s18 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Hero%20-%20O%20Khuda.mp3?alt=media&token=1e1812e1-087a-4385-b0d9-5449f40021ec";
        String s19 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Hawa%20Banke%20-%20Darshan%20Raval.mp3?alt=media&token=a0e842e3-c80d-4df5-8b2e-bd8f21a369b2";
        String s20 ="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Ignite.mp3?alt=media&token=42586d53-3796-4c66-96fc-f1791f5c7442";
       /*
        String s21 ="";
        String s22 ="";
        String s23 ="";
        String s24 ="";
        String s25 ="";
        String s26 ="";
        String s27 ="";
        String s28 ="";
        String s29 ="";
        String s30 ="";
*/





        JcPlayerView jc =  findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Chal_Ghar_Chale",s1));
        jcAudios.add(JcAudio.createFromURL("Odhani",s2));
        jcAudios.add(JcAudio.createFromURL("Shayad",s3));
        jcAudios.add(JcAudio.createFromURL("Tum_Hi_Ho",s4));
        jcAudios.add(JcAudio.createFromURL("Samjhawan",s5));
        jcAudios.add(JcAudio.createFromURL("Dil_Mein_Ho_Tum",s6));
        jcAudios.add(JcAudio.createFromURL("Mehrama",s7));
        jcAudios.add(JcAudio.createFromURL("Qaafirana",s8));
        jcAudios.add(JcAudio.createFromURL("Thodi_Jagah",s9));
        jcAudios.add(JcAudio.createFromURL("Tum Mileya",s10));
        jcAudios.add(JcAudio.createFromURL("Teri_Aankhon_Mein",s11));
        jcAudios.add(JcAudio.createFromURL("Tere_Naal",s12));
        jcAudios.add(JcAudio.createFromURL("Tera_Zikr",s13));
        jcAudios.add(JcAudio.createFromURL("Singh_Me_To_Sleep",s14));
        jcAudios.add(JcAudio.createFromURL("Saari_Ki_Saari",s15));
        jcAudios.add(JcAudio.createFromURL("Mujhe_Peene_Do",s16));
        jcAudios.add(JcAudio.createFromURL("Jab_Tak",s17));
        jcAudios.add(JcAudio.createFromURL("O-Khuda",s18));
        jcAudios.add(JcAudio.createFromURL("Hawa Banke",s19));
        jcAudios.add(JcAudio.createFromURL("Ignite",s20));
        jc.initPlaylist(jcAudios, null);
        jc.createNotification();
    }
}