package br.com.cursoandroid.allinedelara.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button)findViewById(R.id.botaoJogarID);
        textoResultado = (TextView)findViewById(R.id.resultadoID);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gera um número aleatório até 10
                Random random = new Random();
                int numAleatorio = random.nextInt(10);

                //Seta no campo texto da tela
                textoResultado.setText("Número escolhido: "+ numAleatorio);
            }
        });
    }
}
