package de.ahmadiyya.waqf_e_nau;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class CategoryActivity extends Activity{

    Button hadith, prayer, namaz, nazm, quran;
    private ViewFlipper viewFlipper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        hadith = (Button) findViewById(R.id.hadithBtn);
        prayer = (Button) findViewById(R.id.prayerBtn);
        namaz = (Button) findViewById(R.id.namazBtn);
        nazm = (Button) findViewById(R.id.nazmBtn);
        quran = (Button) findViewById(R.id.quranBtn);

        hadith.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.age7);
                viewFlipper = findViewById(R.id.view_flipper);
            }
        });

        prayer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.age8);
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
