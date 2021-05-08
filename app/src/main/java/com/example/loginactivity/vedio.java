package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class vedio extends AppCompatActivity {
VideoView videoView;
MediaController mediaController;
//Shyad
    String url="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Shayad%20Love%20Aaj%20Kal%20Kartik%20Sara%20Arushi%20P-(You2Audio.Com).mp4?alt=media&token=0f59269f-46af-4ca0-b422-60b676b6fabc";
//Ektarfa
    String ektarfa = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Ek%20Tarfa%20-%20Darshan%20Raval%20Video%20Song_HD-(HDvideo9).mp4?alt=media&token=3355a030-40b8-4daf-b7a2-0341855ae4ae";
//MadeInIndia
String MadeInIndia = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/MADE%20IN%20INDIA-Guru%20Randhawa-480p%20(mobVD.com).mp4?alt=media&token=1140a19d-53b4-4d62-b2af-883b6036b951";
//ThodiJagha
    String ThodiJagha="https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/rHj7tRaMNoE-(You2Audio.Com).mp4?alt=media&token=235dfcf5-788e-44ca-8b2f-e8bb9e79c9a0";
//BheChala
    String BheChala = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Behe%20Chala%20-%20URI%20-%20TinyJuke.com.mp4?alt=media&token=46d3dacf-3874-45c2-8e39-746c71942c1b";
//LutGye
    String LutGye = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Lut%20Gaye%20-%20Jubin%20Nautiyal%20Full%20Hd.mp4?alt=media&token=b3d64088-aa4c-44e0-8f15-84f17b8f0ebb";
//IsQudar
    String IsQudar = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Is%20Qadar%20-%20Darshan%20Raval%20Tulsi%20Kumar_FHD-(HDvideo9).mp4?alt=media&token=4e336c80-5e8d-409b-a58e-c369aa315b13";
//Aage Chal
    String AageChal = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Aage%20Chal%20-%20Raftaar%20Video%20Song_HD-(HDvideo9).mp4?alt=media&token=66f90380-4512-4f2e-bcbc-dc97d453a477";
//Lahore
    String Lahore = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/Lagdi%20Lahore%20Di-Guru%20Randhawa%2C%20Tulsi%20Kumar-480p%20(mobVD.com)%20(1).mp4?alt=media&token=9715f603-ceaa-4ac4-a02e-1529a9612e45";
//HighRated
    String HighRated = "https://firebasestorage.googleapis.com/v0/b/loginactivity-da272.appspot.com/o/High%20Rated%20Gabru%20Guru%20Randhawa%20Video%20Song_HD-(HDvideo9).mp4?alt=media&token=9f1ef832-b447-4d3d-8397-f5eb6fd50416";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
        videoView = (VideoView)findViewById(R.id.video);
 //Shyad
        Uri uri = Uri.parse(url);
        videoView.setVideoURI(uri);
//Ektarfa

        Uri ekuri = Uri.parse(ektarfa);
        videoView.setVideoURI(ekuri);
//MadeInIndia
        Uri Indiauri = Uri.parse(MadeInIndia);
        videoView.setVideoURI(Indiauri);
//ThodiJagha
        Uri Thuri = Uri.parse(ektarfa);
        videoView.setVideoURI(Thuri);
//BheChala
        Uri Bhuri = Uri.parse(BheChala);
        videoView.setVideoURI(Bhuri);
//LutGye
     Uri Luuri = Uri.parse(LutGye);
        videoView.setVideoURI(Luuri);
//IsQudar
       Uri Isuri= Uri.parse(IsQudar);
        videoView.setVideoURI(Isuri);
//Aage Chal
        Uri Aguri= Uri.parse(AageChal);
        videoView.setVideoURI(Aguri);
//Lahore
        Uri Lauri= Uri.parse(Lahore);
        videoView.setVideoURI(Lauri);
//HighRated
        Uri Hiuri = Uri.parse(HighRated);
        videoView.setVideoURI(Hiuri);






        mediaController = new MediaController(this);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();
    }
}