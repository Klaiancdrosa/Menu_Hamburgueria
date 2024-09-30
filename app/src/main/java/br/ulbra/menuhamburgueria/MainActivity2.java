package br.ulbra.menuhamburgueria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    Button btnTrocaH;
    ImageView imageView;
    ImageButton imageButtonL, imageButtonR;
    int currentImageIndex = 0;

    int[] images = {R.drawable.refri2, R.drawable.refri1, R.drawable.refri3, R.drawable.refri4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imageView);
        imageButtonL = findViewById(R.id.imageButtonL);
        imageButtonR = findViewById(R.id.imageButtonR);
        btnTrocaH = findViewById(R.id.btnTrocaH);

        imageView.setImageResource(images[currentImageIndex]);

        imageButtonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex > 0) {
                    currentImageIndex--;
                } else {
                    currentImageIndex = images.length - 1;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });

        imageButtonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex < images.length - 1) {
                    currentImageIndex++;
                } else {
                    currentImageIndex = 0;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });

        btnTrocaH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
