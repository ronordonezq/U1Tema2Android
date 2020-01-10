package com.example.u1tema2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu1, menu);
    return true; /** true -> el menú ya está visible */
  }
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();
    if (id == R.id.accion_compartir) {
      Intent paramView;
      paramView = new Intent("android.intent.action.SEND");
      paramView.setType("text/plain");
      paramView.putExtra("android.intent.extra.TEXT", "Descarga nuestra app de la PlayStore" +
              " \n" + "https://play.google.com/store/apps/details?id=app.product.demarktec.alo14_pasajero");
      startActivity(Intent.createChooser(paramView, "Comparte Nuestro aplicativo"));
      return true;
    }
    if (id == R.id.accion_salir) {
      finish();
      return true;
    }

    if (id == R.id.activity_intenciones) {
      startActivity(new Intent(this, Intenciones.class));
      return true;
    }

    if (id == R.id.activity_multimedia) {
      startActivity(new Intent(this, Multimedia.class));
      return true;
    }

    if (id == R.id.activity_permisos) {
      startActivity(new Intent(this, Permisos.class));
      return true;
    }

    if (id == R.id.activity_mi_recycler_view) {
      startActivity(new Intent(this, MiRecyclerView.class));
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

}
