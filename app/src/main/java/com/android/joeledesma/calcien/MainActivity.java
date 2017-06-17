package com.android.joeledesma.calcien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Declaracion de variables
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean divi = false;
    boolean multip = false;
    boolean expon = false;
    boolean sen = false;
    boolean cos = false;
    boolean tan = false;
    boolean rai = false;
    boolean cub = false;
    boolean pi = false;
    boolean loga = false;
    boolean porcien = false;
    boolean cuad = false;
    boolean igua = false;
    Double pii = Math.PI;
    Double[] numero = new Double[20];
    Double resultado;
    double[] histo = new double[5];
    String signo;
    ArrayList resultados = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos los botones
        Button linearLayoutVerticalButton = (Button) findViewById(R.id.bnthistorial);
        linearLayoutVerticalButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, historial.class);
                intent.putExtra("prueba", resultados);
                startActivity(intent);
                }
            }
        );
        Button expone = (Button)findViewById(R.id.bntexponente);
        expone.setOnClickListener(this);

        Button raiz = (Button)findViewById(R.id.bntraiz);
        raiz.setOnClickListener(this);
        Button cub = (Button)findViewById(R.id.bntcubo);
        cub.setOnClickListener(this);
        Button cuadra = (Button)findViewById(R.id.bntcuadrado);
        cuadra.setOnClickListener(this);

        Button seno = (Button)findViewById(R.id.bntseno);
        seno.setOnClickListener(this);
        Button cos = (Button)findViewById(R.id.bntcoseno);
        cos.setOnClickListener(this);
        Button tan = (Button)findViewById(R.id.bnttangente);
        tan.setOnClickListener(this);

        Button limp = (Button)findViewById(R.id.bntlimpiar);
        limp.setOnClickListener(this);
        Button borra = (Button)findViewById(R.id.bntborrar);
        borra.setOnClickListener(this);
        Button porcien = (Button)findViewById(R.id.bntporciento);
        porcien.setOnClickListener(this);
        Button div = (Button)findViewById(R.id.bntdivision);
        div.setOnClickListener(this);

        Button num0 = (Button)findViewById(R.id.bntcero);
        num0.setOnClickListener(this);
        Button num1 = (Button)findViewById(R.id.bntuno);
        num1.setOnClickListener(this);
        Button num2 = (Button)findViewById(R.id.bntdos);
        num2.setOnClickListener(this);
        Button num3 = (Button)findViewById(R.id.bnttres);
        num3.setOnClickListener(this);
        Button num4 = (Button)findViewById(R.id.bntcuatro);
        num4.setOnClickListener(this);
        Button num5 = (Button)findViewById(R.id.bntcinco);
        num5.setOnClickListener(this);
        Button num6 = (Button)findViewById(R.id.bntseis);
        num6.setOnClickListener(this);
        Button num7 = (Button)findViewById(R.id.bntsiete);
        num7.setOnClickListener(this);
        Button num8 = (Button)findViewById(R.id.bntocho);
        num8.setOnClickListener(this);
        Button num9 = (Button)findViewById(R.id.bntnueve);
        num9.setOnClickListener(this);

        Button multi = (Button)findViewById(R.id.bntmultiplicar);
        multi.setOnClickListener(this);
        Button sum = (Button)findViewById(R.id.bntsuma);
        sum.setOnClickListener(this);
        Button rest = (Button)findViewById(R.id.bntresta);
        rest.setOnClickListener(this);

        Button equal = (Button)findViewById(R.id.bntigual);
        equal.setOnClickListener(this);

        Button pi = (Button)findViewById(R.id.bntpi);
        pi.setOnClickListener(this);

        Button point = (Button)findViewById(R.id.bntpunto);
        point.setOnClickListener(this);

        Button logar = (Button)findViewById(R.id.bntlogaritmo);
        logar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //Utilizamos un try-catch con un switch dentro para asignar los numeros y operadores a cada boton
        TextView pantalla = (TextView)findViewById(R.id.res);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();

        try
        {
            switch (seleccion) {
                case R.id.bntcero:
                    pantalla.setText(a + "0");
                    break;
                case R.id.bntuno:
                    pantalla.setText(a + "1");
                    break;
                case R.id.bntdos:
                    pantalla.setText(a + "2");
                    break;
                case R.id.bnttres:
                    pantalla.setText(a + "3");
                    break;
                case R.id.bntcuatro:
                    pantalla.setText(a + "4");
                    break;
                case R.id.bntcinco:
                    pantalla.setText(a + "5");
                    break;
                case R.id.bntseis:
                    pantalla.setText(a + "6");
                    break;
                case R.id.bntsiete:
                    pantalla.setText(a + "7");
                    break;
                case R.id.bntocho:
                    pantalla.setText(a + "8");
                    break;
                case R.id.bntnueve:
                    pantalla.setText(a + "9");
                    break;
                case R.id.bntpunto:
                    if (decimal == false) {
                        pantalla.setText(a + ".");

                        decimal = true;
                    } else {
                        return;
                    }
                    break;
                case R.id.bntsuma:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    signo = " + ";
                    decimal = false;
                    break;
                case R.id.bntresta:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    signo = " - ";
                    decimal = false;
                    break;
                case R.id.bntdivision:
                    divi = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    signo = " / ";
                    decimal = false;
                    break;
                case R.id.bntmultiplicar:
                    multip = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    signo = " * ";
                    decimal = false;
                    break;
                case R.id.bntexponente:
                    decimal = false;
                    expon = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.bntseno:
                    sen = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.append("");
                    resultado = Math.sin(numero[0] * Math.PI / 180);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bntcoseno:
                    cos = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.append("");
                    resultado = Math.cos(numero[0] * Math.PI / 180);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bnttangente:
                    tan = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.tan(numero[0] * Math.PI / 180);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bntraiz:
                    rai = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.sqrt(Double.parseDouble(numero[0].toString()));
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bntcubo:
                    cub = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.pow(numero[0], 3);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bntpi:
                    pi = true;
                    pantalla.setText(a + pii);
                    decimal = false;
                    break;
                case R.id.bntporciento:
                    porcien = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    if (porcien == true) {
                    porcien = true;
                    decimal = true;
                    numero[0] = Double.parseDouble(a);
                    resultado = (numero[0] * numero[1]) / 100;
                    pantalla.setText(String.valueOf(resultado));
                }
                    decimal = false;
                    break;
                case R.id.bntlogaritmo:
                    loga = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.log(numero[0]);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.bntcuadrado:
                    cuad = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    resultado = Math.pow(numero[0], 2);
                    pantalla.setText(String.valueOf(resultado));
                    decimal = false;
                case R.id.bntigual:                 //Iteramos cuando se pulse uno de los operadores matematicos
                    numero[1] = Double.parseDouble(a);
                    igua = true;
                    if (suma == true) {
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (resta == true) {
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (multip == true) {
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (divi == true) {
                        resultado = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    } else if (pi == true) {
                        pi = true;
                        decimal = true;
                        if (numero[0].equals(Math.PI)) {
                            numero[0] = pii;
                        } else if (numero[1].equals(Math.PI)) {
                            numero[1] = pii;
                        }
                        pantalla.setText(String.valueOf(pii));

                    } else if (expon == true) {
                        expon = true;
                        resultado = Math.pow(numero[0], numero[1]);
                        pantalla.setText(String.valueOf(resultado));
                    }
                    pantalla.setText(String.valueOf(resultado));

                    if(numero[0].longValue() > 0 && numero[0].longValue() > 0 && signo != null)
                    {
                        resultados.add(numero[0] + signo + numero[1] + " = " + resultado);
                    }

//                    Se apagan todas las variables booleanas
                    sen = false;
                    cos = false;
                    tan = false;
                    decimal = false;
                    suma = false;
                    multip = false;
                    divi = false;
                    resta = false;
                    expon = false;
                    rai = false;
                    pi = false;
                    cuad = false;
                    cub = false;
                    porcien = false;
                    loga = false;
                    igua = false;
                    break;
                case R.id.bntborrar:            //Aqui borramos una por una los numeros ingresados
                    decimal = false;
                    if (pantalla.getText().toString().equals(""));
                {
                    pantalla.setText(pantalla.getText().subSequence(0, Integer.parseInt(pantalla.getText().length() - 1 + "")));
                }
                    break;
                case R.id.bntlimpiar:           //Limpiamos la pantalla
                    decimal = false;
                    pantalla.setText("");
                    numero.equals("");
                    break;
            }
            }
            catch(Exception e)
            {
                pantalla.setText(R.string.error);
            }
    }
    //Declaramos los view de los botones
    public void limpiar(View view) {
    }
    public void borrar(View view) {
    }
    public void porciento(View view) {
    }
    public void division(View view) {
    }
    public void siete(View view) {
    }
    public void ocho(View view) {
    }
    public void nueve(View view) {
    }
    public void multiplicar(View view) {
    }
    public void cuatro(View view) {
    }
    public void cinco(View view) {
    }
    public void seis(View view) {
    }
    public void suma(View view) {
    }
    public void uno(View view) {
    }
    public void dos(View view) {
    }
    public void tres(View view) {
    }
    public void resta(View view) {
    }
    public void cero(View view) {
    }
    public void punto(View view) {
    }
    public void pi(View view) {
    }
    public void igual(View view) {
    }
    public void tangente(View view) {
    }
    public void coseno(View view) {
    }
    public void seno(View view) {
    }
    public void exponente (View view) {
    }
    public void cubo (View view) {
    }
    public void raiz (View view) {
    }
}

