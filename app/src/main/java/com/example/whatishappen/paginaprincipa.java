package com.example.whatishappen;


import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.android.material.tabs.TabLayout;

public class paginaprincipa extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar tool = findViewById(R.id.toolbar);






        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_paginaprincipa);
        TabLayout tl = findViewById(R.id.tablaout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        Inicio i = new Inicio();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,i).commit();
                        break;
                    case 1:
                        Buscar b = new Buscar();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,b).commit();
                        break;
                    case 2:
                        Biblioteca bi = new Biblioteca();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,bi).commit();
                        break;
                    case 3:
                        Nuevo n = new Nuevo();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,n).commit();
                        break;
                    case 4:
                        Perfil p = new Perfil();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }




}