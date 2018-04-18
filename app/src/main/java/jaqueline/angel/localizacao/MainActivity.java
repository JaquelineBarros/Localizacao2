package jaqueline.angel.localizacao;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgPessoa;
    ImageView imgLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = (ImageView) findViewById(R.id.img_pessoa);
        imgLocal = (ImageView) findViewById(R.id.img_local);
    }

    public void pessoaClickAct1(View v) {

        Intent i = new Intent(MainActivity.this, PessoaActivity.class);
        startActivity(i);
    }

    public void localClickAct1(View v) {
        Button btn;

        imgLocal= (ImageView) findViewById(R.id.img_local);

        imgLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo: -6.354715, -47.392611"));
                Intent chooser = Intent.createChooser(i, "Launch Maps");
                startActivity(chooser);
            }
        });
       }
    }

