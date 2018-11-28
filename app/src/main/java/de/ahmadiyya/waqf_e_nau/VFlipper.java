package de.ahmadiyya.waqf_e_nau;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class VFlipper extends Activity{

    Button hadith, prayer, namaz, nazm, quran;
    private android.widget.ViewFlipper viewFlipper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        hadith = (Button) findViewById(R.id.hadithBtn);
        prayer = (Button) findViewById(R.id.prayerBtn);
        namaz = (Button) findViewById(R.id.namazBtn);
        nazm = (Button) findViewById(R.id.nazmBtn);
        quran = (Button) findViewById(R.id.quranBtn);

        final String Item = getIntent().getStringExtra("button");

        Log.d("BUTTON NAME", Item);

        hadith.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(Item.equals("7")){
                    setContentView(R.layout.hadith7);
                }else if(Item.equals("8")){
                    setContentView(R.layout.hadith8);
                }else if(Item.equals("9")){
                    setContentView(R.layout.hadith9);
                }else if(Item.equals("10")){
                    setContentView(R.layout.hadith10);
                }else if(Item.equals("11")){
                    setContentView(R.layout.hadith11);
                }else if(Item.equals("12")){
                    setContentView(R.layout.hadith12);
                }else if(Item.equals("13")){
                    setContentView(R.layout.hadith13);
                }else if(Item.equals("14")){
                    setContentView(R.layout.hadith14);
                }else if(Item.equals("15")){
                    setContentView(R.layout.hadith15);
                }else{
                    setContentView(R.layout.hadith7);
                }
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

        prayer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(Item.equals("7")){
                    setContentView(R.layout.prayers7);
                }else if(Item.equals("8")){
                    setContentView(R.layout.prayers8);
                }else if(Item.equals("9")){
                    setContentView(R.layout.prayers9);
                }else if(Item.equals("10")){
                    setContentView(R.layout.prayers10);
                }else if(Item.equals("11")){
                    setContentView(R.layout.prayers11);
                }else if(Item.equals("12")){
                    setContentView(R.layout.prayers12);
                }else if(Item.equals("13")){
                    setContentView(R.layout.prayers13);
                }else if(Item.equals("14")){
                    setContentView(R.layout.prayers14);
                }else if(Item.equals("15")){
                    setContentView(R.layout.prayers15);
                }else{
                    setContentView(R.layout.prayers7);
                }
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

        namaz.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(Item.equals("7")){
                    setContentView(R.layout.namaz7);
                }else if(Item.equals("8")){
                    setContentView(R.layout.namaz8);
                }else if(Item.equals("9")){
                    setContentView(R.layout.namaz9);
                }else if(Item.equals("10")){
                    setContentView(R.layout.namaz10);
                }else if(Item.equals("11")){
                    setContentView(R.layout.namaz11);
                }else if(Item.equals("12")){
                    setContentView(R.layout.namaz12);
                }else if(Item.equals("13")){
                    setContentView(R.layout.namaz13);
                }else if(Item.equals("14")){
                    setContentView(R.layout.namaz14);
                }else if(Item.equals("15")){
                    setContentView(R.layout.namaz15);
                }else{
                    setContentView(R.layout.namaz7);
                }
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

        nazm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(Item.equals("7")){
                    setContentView(R.layout.nazm7);
                }else if(Item.equals("8")){
                    setContentView(R.layout.nazm8);
                }else if(Item.equals("9")){
                    setContentView(R.layout.nazm9);
                }else if(Item.equals("10")){
                    setContentView(R.layout.nazm10);
                }else if(Item.equals("11")){
                    setContentView(R.layout.nazm11);
                }else if(Item.equals("12")){
                    setContentView(R.layout.nazm12);
                }else if(Item.equals("13")){
                    setContentView(R.layout.nazm13);
                }else if(Item.equals("14")){
                    setContentView(R.layout.nazm14);
                }else if(Item.equals("15")){
                    setContentView(R.layout.nazm15);
                }else{
                    setContentView(R.layout.namaz7);
                }
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

        quran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(Item.equals("7")){
                    setContentView(R.layout.quran7);
                }else if(Item.equals("8")){
                    setContentView(R.layout.quran8);
                }else if(Item.equals("9")){
                    setContentView(R.layout.quran9);
                }else if(Item.equals("10")){
                    setContentView(R.layout.quran10);
                }else if(Item.equals("11")){
                    setContentView(R.layout.quran11);
                }else if(Item.equals("12")){
                    setContentView(R.layout.quran12);
                }else if(Item.equals("13")){
                    setContentView(R.layout.quran13);
                }else if(Item.equals("14")){
                    setContentView(R.layout.quran14);
                }else if(Item.equals("15")){
                    setContentView(R.layout.quran15);
                }else{
                    setContentView(R.layout.quran7);
                }
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

    }

    public void previousView(View v) {
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setOutAnimation(this, R.anim.slide_out_left);
        viewFlipper.showPrevious();
    }

    public void nextView(View v) {
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showNext();
    }

}
