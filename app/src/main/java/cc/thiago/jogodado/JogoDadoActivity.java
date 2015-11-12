package cc.thiago.jogodado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class JogoDadoActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgComputador;
    private ImageView imgJogador;
    private Button btnComputador;
    private Button btnJogador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_dado);

        imgComputador = (ImageView) findViewById(R.id.imgComputador);
        imgJogador = (ImageView) findViewById(R.id.imgJogador);
        btnComputador = (Button) findViewById(R.id.btnComputador);
        btnComputador.setOnClickListener(this);
        btnJogador = (Button) findViewById(R.id.btnJogador);
        btnComputador.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnComputador) {
            Toast.makeText(this, "Computador Jogando!", Toast.LENGTH_LONG).show();
        } else if (v.getId() == R.id.btnJogador) {
            Toast.makeText(this, "Jogador Jogando!", Toast.LENGTH_LONG).show();
        }
    }
}
