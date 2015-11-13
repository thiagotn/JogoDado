package cc.thiago.jogodado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class JogoDadoActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgComputador;
    private ImageView imgJogador;
    private Button btnComputador;
    private Button btnJogador;
    private int [] imagens = new int[]{
            R.mipmap.dado1,
            R.mipmap.dado2,
            R.mipmap.dado3,
            R.mipmap.dado4,
            R.mipmap.dado5,
            R.mipmap.dado6};

    private int dadoComputador = -1;
    private int dadoJogador = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_dado);

        imgComputador = (ImageView) findViewById(R.id.imgComputador);
        imgJogador = (ImageView) findViewById(R.id.imgJogador);
        btnComputador = (Button) findViewById(R.id.btnComputador);
        btnComputador.setOnClickListener(this);
        btnJogador = (Button) findViewById(R.id.btnJogador);
        btnJogador.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnComputador) {
            int indice = imagens[new Random().nextInt(6)];
            dadoComputador = indice;
            imgComputador.setImageResource(indice);
        }

        if (v.getId() == R.id.btnJogador) {
            int indice = imagens[new Random().nextInt(6)];
            dadoJogador = indice;
            imgJogador.setImageResource(indice);
        }
        
        verificaVencedor();
    }

    private void verificaVencedor() {
        if (dadoComputador > dadoJogador) {
            Toast.makeText(this, "Computador Ganhou!", Toast.LENGTH_LONG).show();
        } else if (dadoComputador < dadoJogador) {
            Toast.makeText(this, "Jogador Ganhou!", Toast.LENGTH_LONG).show();
        } else if (dadoComputador == dadoComputador) {
            Toast.makeText(this, "Empate!", Toast.LENGTH_LONG).show();
        }
    }
}
