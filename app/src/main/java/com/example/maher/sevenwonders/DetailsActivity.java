package com.example.maher.sevenwonders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgView;
    TextView textName,textDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgView=findViewById(R.id.image_view);
        textName=findViewById(R.id.text_name);
        textDesc=findViewById(R.id.text_desc);

        String string=getIntent().getExtras().getString("name");
        if (string.equals("Great Pyramid of Giza")){
            imgView.setImageResource(R.drawable.great_pyramid_of_giza);
            textName.setText(R.string.great_pyramid_name);
            textDesc.setText(R.string.great_pyramid_desc);
        }else if (string.equals("Temple of Artemis at Ephesus")){
            imgView.setImageResource(R.drawable.temple_of_artemis);
            textName.setText(R.string.temple_name);
            textDesc.setText(R.string.temple_desc);
        }else if (string.equals("Hanging Gardens of Babylon")){
            imgView.setImageResource(R.drawable.hanging_garden_of_babylon);
            textName.setText(R.string.hanging_garden_name);
            textDesc.setText(R.string.hanging_garden_desc);
        }else if (string.equals("Lighthouse of Alexandria")){
            imgView.setImageResource(R.drawable.lighthouse_of_alexandria);
            textName.setText(R.string.lighthouse_name);
            textDesc.setText(R.string.lighthouse_desc);
        }else if (string.equals("Statue of Zeus at Olympia")){
            imgView.setImageResource(R.drawable.statue_of_zeus);
            textName.setText(R.string.statue_name);
            textDesc.setText(R.string.statue_desc);
        }else if (string.equals("Mausoleum at Halicarnassus")){
            imgView.setImageResource(R.drawable.mausoleum_at_halicarnassus);
            textName.setText(R.string.mausoleum_name);
            textDesc.setText(R.string.mausoleum_desc);
        }else if (string.equals("Colossus of Rhodes")){
            imgView.setImageResource(R.drawable.colossus_of_rhodes);
            textName.setText(R.string.colossus_name);
            textDesc.setText(R.string.colossus_desc);
        }
    }
}
