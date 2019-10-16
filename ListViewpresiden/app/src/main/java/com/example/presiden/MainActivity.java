package com.example.presiden;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] presidenNames = {
            "Ir Soekarno",
            "Soeharto",
            "B.J Habibie",
            "Abdurrahman Wahid",
            "Megawati",
            "Susilo Bambang Yudhoyono",
            "Jokowi",
            };
    int[] presidenImages = {
            R.drawable.soekarno,
            R.drawable.soeharto,
            R.drawable.habibie,
            R.drawable.gusdur,
            R.drawable.megawati,
            R.drawable.presf,
            R.drawable.presg
            };
    String[] desc = {
                    "Nama   :   Ir Soekarno\n" +
                    "TTL    :   Surabaya 6 Juni 1901\n" +
                    "Asal   :   Blitar\n",

                    "Nama   :   Soeharto\n" +
                    "TTL    :   Yogyakarta 8 Juni 1921\n" +
                    "Asal   :   Yogyakarta\n",

                    "Nama   :   B.J Habibie\n" +
                    "TTL    :   Parepare 21 Juni 1936\n" +
                    "Asal   :   Parepare\n",

                    "Nama   :   Gus Dur\n" +
                    "TTL    :   Jombang 7 September 1940\n" +
                    "Asal   :   Jombang\n",

                    "Nama   :   Megawati Soekarno Putri\n" +
                    "TTL    :   Yogyakarta 23 Januari 1947\n" +
                    "Asal   :   Yogyakarta\n",

                    "Nama   :   Susilo Bambang Yudhoyono\n" +
                    "TTL    :   Pacitan 9 September 1949\n" +
                    "Asal   :   Pacitan\n",

                    "Nama   :   Joko Widodo\n" +
                    "TTL    :   Surakarta 21 Juni 1961\n" +
                    "Asal   :   Surakarta\n",

                    "Nama   :   Qorygore\n" +
                    "TTL    :   Tidak Diketahui\n" +
                    "Asal   :   Apalagi asal orang TTL aja GAJELAS\n" +
                            "Misi Utama : Memberantas FkBOY , Melestarikan Ani Ani"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), ListdataActivity.class);
                intent.putExtra("name", presidenNames[i]);
                intent.putExtra("image", presidenImages[i]);

                intent.putExtra("desc", desc[i]);
                startActivity(intent);

            }
        });

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return presidenImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
            @Override
            public View getView ( int i, View view, ViewGroup viewGroup){
                View view1 = getLayoutInflater().inflate(R.layout.row_data, null);
                //getting view in row_data
                TextView name = view1.findViewById(R.id.presiden);
                ImageView image = view1.findViewById(R.id.images);

                name.setText(presidenNames[i]);
                image.setImageResource(presidenImages[i]);
                return view1;

        }
    }
}