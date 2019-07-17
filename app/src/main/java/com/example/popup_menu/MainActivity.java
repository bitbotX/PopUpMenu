package com.example.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MenuItem.OnMenuItemClickListener{
    private ImageButton bShowPopUpMenu =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bShowPopUpMenu=(ImageButton) findViewById(R.id.b_popup);
    }

    public void showPopUpMenu(View view) {
        PopupMenu mPop=new PopupMenu(this,view);
        MenuInflater mInflate=mPop.getMenuInflater();
        mInflate.inflate(R.menu.popup_menu,mPop.getMenu());
        mPop.show();
    }

    public void showPopUpChoice(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this,"Sharing current view",Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit:
                Toast.makeText(this,"Editing current view",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this,"Deleting current view",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cancel:
                Toast.makeText(this,"Cancelling current operation",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

        switch(menuItem.getItemId()){
            case R.id.share:
                showPopUpChoice(menuItem);
                return true;
            case R.id.edit:
                showPopUpChoice(menuItem);
                return true;
            case R.id.delete:
                showPopUpChoice(menuItem);
                return true;
            case R.id.cancel:
                showPopUpChoice(menuItem);
                return true;
        }
        return false;
    }
}
