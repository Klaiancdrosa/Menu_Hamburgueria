package br.ulbra.menuhamburgueria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnTrocaB;
    ImageView imageView;
    ImageButton imageButtonL, imageButtonR;
    int currentImageIndex = 0;

    int[] images = {R.drawable.hamburguer, R.drawable.hamburguer2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageButtonL = findViewById(R.id.imageButtonL);
        imageButtonR = findViewById(R.id.imageButtonR);
        btnTrocaB = findViewById(R.id.btnTrocaB);

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

        btnTrocaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
