package com.msarnowski.recyclerviewcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] titles = {
            "Czubajka kania",
            "Kożlarz czerwony",
            "Gąska zielonka",
            "Piaskowiec modrzak",
            "Podgrzybek brunatny",
            "Gołąbek jadalny",
            "Gąska niekształtna",
            "Maślak zwyczajny",
    };

    private String[] details = {
            "Wysyp: obficie rosną od sierpnia do października. \nSzukaj: najlepiej w lasach mieszanych z przewagą drzew liściastych. Natkniesz się na nie na porębach i na skraju lastu",
            "Wysyp: najwięcej koźlarzy czerwonych zbiera się od sierpnia do końca września. \nSzukaj: w zaroślach osikowych i lasach z domieszką osiki - w okolicach kęp tych drzew.",
            "Wysyp: zielonki pojawiają się póżno - najwięcej jest ich od września do końca października. \nSzukaj: w lasach sosnowych na terenach piaszczystych, zwłaszcza wydmowych",
            "Wysyp: najwięcej modrzaków pojawia się zwykle w sierpniu i do połowy września. \nSzukaj: głównie w lasach mieszanych, na terenach piaszczystych, także wydmowych.",
            "Wysyp: na obfite zbiory przy sprzyjającej pogodzie można liczyć od końca sierpnia do końca października. \nSzukaj: najlepiej w starych borach świerkowych lub sosnowych.",
            "Wysyp: najwicęcej gołąbków jadalnych można zebrać od końca lipca do września. \nSzukaj: w lasach mieszanych, które są ulubionym środowiskiem tego grzyba.",
            "Wysyp: najłatwiej spotkać gąski szare od połowy września do początku listopada. \nSzukaj: na terenach piaszczystych, w lasach mieszanych z udziałem sosen i dębow.",
            "Wysyp: można się na nie wybrać już w sierpniu, ale pełnia sezonu trwa aż do października. \nSzukaj: w sosnowych młodnikach - tam znajdziesz najwięcej i najładniejszych okazów.",
    };

    private int[] images = {
            R.drawable.czubajka_kania,
            R.drawable.kozlarz_czerwony,
            R.drawable.gaska_zielonka,
            R.drawable.piaskowiec_modrzak,
            R.drawable.podgrzybek_brunatny,
            R.drawable.golabek_jadalny,
            R.drawable.gaska_nieksztaltna,
            R.drawable.maslak_zwyczajny,
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemImage.setImageResource(images[position]);
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(details[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        // public int currentItem
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected: " + (position + 1),Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            });
        }
    }
}

