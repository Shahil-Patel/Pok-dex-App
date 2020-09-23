package com.example.shahi.pokemonlist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        a=new ArrayList<>();
        a.add("Abra");
        a.add("Magikarp");
        a.add("Eevee");
        a.add("Flareon");
        a.add("Jolteon");
        a.add("Dialga");
        a.add("Palkia");
        a.add("Mew");
        CustomAdapter adapter=new CustomAdapter(this,R.layout.custom_layout,a);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public class CustomAdapter extends ArrayAdapter<String>
    {
        Context context;
        int resource;
        List<String> list;
        public CustomAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
            super(context, resource, objects);
            this.context=context;
            this.resource=resource;
            this.list=objects;
        }
        @NonNull
        @Override
        public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflator=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            View adapterLayout=inflator.inflate(resource,null);
            TextView textView=adapterLayout.findViewById(R.id.textView);
            final TextView textView2=adapterLayout.findViewById(R.id.textView2);
            Button button=adapterLayout.findViewById(R.id.button);
            ImageView imageView=adapterLayout.findViewById(R.id.imageView);
                textView.setText(a.get(position));
                if(position==0){
                    imageView.setImageResource(R.drawable.abra);
                    textView2.setText("This pokemon is acutally useless as its only move is teleport");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Evolves into pretty dope pokemon");
                        }
                    });
                }
                if(position==1){
                    imageView.setImageResource(R.drawable.magikarp);
                    textView2.setText("Literaly is a steaming pile of crap that splashes water everywhere");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Evolves into a really good Pokemon");
                        }
                    });
                }
                if(position==2){
                    imageView.setImageResource(R.drawable.eevee);
                    textView2.setText("Best pokemon hands down");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Has like 10 different evolutions adding on to his coolness");
                        }
                    });
                }
                if(position==3){
                    imageView.setImageResource(R.drawable.flareon);
                    textView2.setText("Just a powerful fire version of Eevee");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Is attack oriented");
                        }
                    });
                }
                if(position==4){
                    imageView.setImageResource(R.drawable.jolteon);
                    textView2.setText("Like Eevee is he/she was Thor");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Is speed oriented");
                        }
                    });
                }
                if(position==5){
                    imageView.setImageResource(R.drawable.dialga);
                    textView2.setText("Bends time like am absolute madlad");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Is like a god in the Pokemon universe");
                        }
                    });
                }
                if(position==6){
                    imageView.setImageResource(R.drawable.palkia);
                    textView2.setText("Bends space like a fricken baller");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("Fights Dialga I think");
                        }
                    });
                }
                if(position==7){
                    imageView.setImageResource(R.drawable.mew);
                    textView2.setText("Honestly super overrated and is pretty grabage");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            textView2.setText("MewTwo has Mew's DNA");
                        }
                    });
                }
            return adapterLayout;
        }
    }
}
