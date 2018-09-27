package com.example.kaio.findpackrecycler.Activitys;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.kaio.findpackrecycler.Model.Cod;
import com.example.kaio.findpackrecycler.Model.ResponseCorreios;
import com.example.kaio.findpackrecycler.Network.Config;
import com.example.kaio.findpackrecycler.Network.Service;
import com.example.kaio.findpackrecycler.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NovaEncomenda extends AppCompatActivity {

    @BindView(R.id.inserirCod)
    EditText rastreio;

    @BindView(R.id.pbLoading)
    ProgressBar progress;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_encomenda);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void signupAction(View view) {
        progress.setVisibility(ProgressBar.VISIBLE);

        final Service service = Config.getRetrofitInstance().create(Service.class);
        Cod bodyRastreio = new Cod(rastreio.getText().toString());
        Call<ResponseCorreios> call = service.PegarResultado(bodyRastreio );
        call.enqueue(new Callback<ResponseCorreios>() {
            @Override
            public void onResponse(@NonNull  Call<ResponseCorreios> call, Response<ResponseCorreios> response) {
                Toast.makeText(getApplicationContext(),response.body().getStatus().getCidade(), Toast.LENGTH_SHORT).show();
                progress.setVisibility(ProgressBar.INVISIBLE);
            }

            @Override
            public void onFailure(@NonNull Call<ResponseCorreios> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(), Toast.LENGTH_SHORT).show();
                progress.setVisibility(ProgressBar.INVISIBLE);
            }
        });
    }
}








