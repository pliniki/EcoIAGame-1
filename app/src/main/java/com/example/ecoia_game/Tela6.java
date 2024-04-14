package com.example.ecoia_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Tela6 extends AppCompatActivity {

    private View white;
    View imageView3;
    View imageView4;
    View imageView5;
    View imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela6);

        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);

       findViewById(R.id.shadow).setOnLongClickListener(new MyOnLongClickListener());

        findViewById(R.id.topleft).setOnDragListener(new MyOnDragListener(1));
        findViewById(R.id.topright).setOnDragListener(new MyOnDragListener(2));
        findViewById(R.id.bottomleft).setOnDragListener(new MyOnDragListener(3));
        findViewById(R.id.bottomright).setOnDragListener(new MyOnDragListener(4));

        white = findViewById(R.id.bottomright);


    }

    class MyOnLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("simple_text", "text");
            View.DragShadowBuilder sb = new View.DragShadowBuilder(findViewById(R.id.shadow));
            v.startDrag(data, sb, v, 0);
            v.setVisibility(View.INVISIBLE);
            return (true);
        }
    }

    class MyOnDragListener implements View.OnDragListener {
        private int num;

        public MyOnDragListener(int num){
            super();
            this.num = num;
        }

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch(action){
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.i("Script", num+" - ACTION_DRAG_STARTED");
                    if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                        return(true);
                    }
                    return(false);
                case DragEvent.ACTION_DRAG_ENTERED:

                    Log.i("Script", num + " - ACTION_DRAG_ENTERED");
                    v.setBackgroundColor(Color.rgb(20,42,73));

                    // Verifique se o item arrastado é um ImageView
                    View draggedView = (View) event.getLocalState();
                    if (draggedView instanceof ImageView) {
                        ImageView imageView = (ImageView) draggedView;

                        // Verifique se o ImageView tem uma imagem definida
                        if (imageView.getDrawable() != null) {
                            // Verifique em qual LinearLayout o ImageView está sendo arrastado
                            if (v.getId() == R.id.topleft) {
                                Intent intent = new Intent(Tela6.this, Tela6D.class);
                                startActivity(intent);
                            } else if (v.getId() == R.id.topright) {
                                Intent intent = new Intent(Tela6.this, Tela6D.class);
                                startActivity(intent);
                            } else if (v.getId() == R.id.bottomleft) {
                                Intent intent = new Intent(Tela6.this, Tela6D.class);
                                startActivity(intent);
                            } else if (v.getId() == R.id.bottomright) {
                                Intent intent = new Intent(Tela6.this, Tela7.class);
                                startActivity(intent);
                            }
                        }
                    }
                    break;
                case DragEvent.ACTION_DRAG_LOCATION:
                    Log.i("Script", 2+" - ACTION_DRAG_LOCATION");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Script", num+" - ACTION_DRAG_EXITED");
                    v.setBackgroundColor(Color.rgb(255, 255, 255));
                    break;
                case DragEvent.ACTION_DROP:
                    Log.i("Script", num+" - ACTION_DROP");
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("Script", num+" - ACTION_DRAG_ENDED");
                    v.setBackgroundColor(Color.rgb(255,255,255));

                    break;

            }

            /*switch(action){
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.i("Script", num+" - ACTION_DRAG_STARTED");
                    if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                        return(true);
                    }
                    return(false);
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Script", num+" - ACTION_DRAG_ENTERED");
                    v.setBackgroundColor(Color.YELLOW);
                    break;
                case DragEvent.ACTION_DRAG_LOCATION:
                    Log.i("Script", num+" - ACTION_DRAG_LOCATION");
                    Intent in = new Intent(Tela6.this, Tela2.class);
                    startActivity(in);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Script", num+" - ACTION_DRAG_EXITED");
                    v.setBackgroundColor(Color.BLUE);
                    break;
                case DragEvent.ACTION_DROP:
                    Log.i("Script", num+" - ACTION_DROP");
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("Script", num+" - ACTION_DRAG_ENDED");
                    v.setBackgroundColor(Color.rgb(255,255,255));

                    break;
            }*/

            return true;
        }
    }





}