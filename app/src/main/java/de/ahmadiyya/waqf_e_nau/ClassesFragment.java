package de.ahmadiyya.waqf_e_nau;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ClassesFragment extends Fragment{

    View myView;
    Button class1, class2, class3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.classes_layout, container, false);

        class1 = (Button) myView.findViewById(R.id.classBtn1);
        class2 = (Button) myView.findViewById(R.id.classBtn2);
        class3 = (Button) myView.findViewById(R.id.classBtn3);

        class1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Ci2CZarw-YA")));
            }
        });

        class2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jctB0jc8tHE")));
            }
        });

        class3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WkbEqaucEWg")));
            }
        });

        return myView;
    }
}
