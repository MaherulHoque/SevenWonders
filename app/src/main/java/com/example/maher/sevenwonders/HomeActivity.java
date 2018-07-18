package com.example.maher.sevenwonders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnPyramid,btnTemple,btnHangingGarden,btnLighthouse,btnStatue,btnMausoleum,btnColossus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnPyramid=findViewById(R.id.btn_pyramid);
        btnTemple=findViewById(R.id.btn_temple);
        btnHangingGarden=findViewById(R.id.btn_hanging_garden);
        btnLighthouse=findViewById(R.id.btn_lighthouse);
        btnStatue=findViewById(R.id.btn_statue);
        btnMausoleum=findViewById(R.id.btn_mausoleum);
        btnColossus=findViewById(R.id.btn_colossus);

        btnPyramid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name", "Great Pyramid of Giza");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Great Pyramid of Giza", Toast.LENGTH_SHORT).show();
            }
        });

        btnTemple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Temple of Artemis at Ephesus");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Temple of Artemis at Ephesus", Toast.LENGTH_SHORT).show();
            }
        });

        btnHangingGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Hanging Gardens of Babylon");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Hanging Gardens of Babylon", Toast.LENGTH_SHORT).show();
            }
        });

        btnLighthouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Lighthouse of Alexandria");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Lighthouse of Alexandria", Toast.LENGTH_SHORT).show();
            }
        });

        btnStatue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Statue of Zeus at Olympia");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Statue of Zeus at Olympia", Toast.LENGTH_SHORT).show();
            }
        });

        btnMausoleum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Mausoleum at Halicarnassus");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Mausoleum at Halicarnassus", Toast.LENGTH_SHORT).show();
            }
        });

        btnColossus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("name","Colossus of Rhodes");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Colossus of Rhodes", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
