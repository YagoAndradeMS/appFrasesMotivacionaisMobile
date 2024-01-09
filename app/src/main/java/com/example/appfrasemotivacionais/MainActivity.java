package com.example.appfrasemotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrase(View view) {
        TextView txtResultado;
        txtResultado = findViewById(R.id.txtResultado);
        String[] frases = {
                "Comece onde você está, use o que você tem e faça o que você pode.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.",
                "Não importa que você vá devagar, contanto que você não pare.",
                "A inspiração existe, porém temos que encontrá-la trabalhando.",
                "Coragem é saber o que não temer.",
                "O segredo para começar é dar o primeiro passo.",
                "Acredite em você mesmo e tudo será possível.",
                "Seja a mudança que você deseja ver no mundo.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Não tenha medo de desistir do bom para perseguir o ótimo.",
                "A persistência realiza o impossível.",
                "Você é mais forte do que pensa que é.",
                "A única limitação que você tem é aquela que você coloca em si mesmo.",
                "Cada novo dia é uma nova oportunidade de melhorar.",
                "A jornada de mil milhas começa com um único passo.",
                "Quanto maior o obstáculo, maior a glória em superá-lo.",
                "Acredite nos seus sonhos, pois eles são o mapa para o seu futuro.",
                "O sucesso nasce do querer, da determinação e da persistência em se chegar a um objetivo.",
                "Sua atitude determina sua direção.",
                "Não tenha medo de falhar, tenha medo de não tentar.",
                "Você é capaz de mais do que imagina.",
                "O otimismo é a fé em ação.",
                "Cada dia é uma nova chance de fazer diferente.",
                "O melhor momento para plantar uma árvore foi há 20 anos. O segundo melhor momento é agora.",
                "Grandes coisas nunca vêm de zonas de conforto.",
                "Quando você acredita, tudo é possível.",
                "A persistência é o caminho do êxito.",
                "O sucesso é construído sobre a pedra angular da determinação.",
                "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso.",
                "Seja a mudança que você deseja ver no mundo.",
                "Não deixe que o medo decida por você.",
                "Cada sonho que você deixa para trás é um pedaço do seu futuro que deixa de existir.",
                "Não importa o quão devagar você vá, desde que você não pare.",
                "O que quer que você pense que pode fazer, faça. A coragem contém genialidade, poder e magia.",
                "A vida é feita de escolhas. Escolha ser feliz."
        };

        int n = new Random().nextInt(frases.length);
        txtResultado.setText(frases[n]);
    }
}