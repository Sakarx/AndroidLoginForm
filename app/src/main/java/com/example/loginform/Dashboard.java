package com.example.loginform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button popUp = findViewById(R.id.btnPopUp);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId == R.id.menu1){
            Toast.makeText(this, "Menu1 has been clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menu2){
            Toast.makeText(this, "Menu2 has been clicked", Toast.LENGTH_SHORT).show();
        }
        if(itemId == R.id.menu3){
            Toast.makeText(this, "Menu1 has been clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if(itemId == R.id.share){
            Toast.makeText(this, "share has been clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(itemId == R.id.save){
            Toast.makeText(this, "save has been clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(itemId == R.id.New){
            Toast.makeText(this, "New has been clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(itemId == R.id.newFile){
            Toast.makeText(this, "newFile has been clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(itemId == R.id.newFolder){
            Toast.makeText(this, "newFolder has been clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}