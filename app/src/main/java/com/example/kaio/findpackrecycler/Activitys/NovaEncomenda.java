package com.example.kaio.findpackrecycler.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kaio.findpackrecycler.Helpers.Clicavel;
import com.example.kaio.findpackrecycler.R;

public class NovaEncomenda extends AppCompatActivity{

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_encomenda);

        button = (Button) findViewById(R.id.button);

        //Utilizar quando o botão for clicável
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent envia uma ação para o dispositivo
                startActivity(new Intent(NovaEncomenda.this, EnviadasActivity.class));

            }
        });
    }
}





