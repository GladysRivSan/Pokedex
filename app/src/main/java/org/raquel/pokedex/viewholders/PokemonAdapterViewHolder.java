package org.raquel.pokedex.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.raquel.pokedex.R;
import org.raquel.pokedex.adaptadores.PokemonAdapter;

public class PokemonAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView pokemonName;
    public ImageView pokemonImage;
    private PokemonAdapter.ItemClickListener mClickListener;

    public PokemonAdapterViewHolder(View itemView, PokemonAdapter.ItemClickListener listener) {
        super(itemView);
        mClickListener = listener;
        pokemonName = itemView.findViewById(R.id.pokemonName);
        pokemonImage = itemView.findViewById(R.id.pokemonImage);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
    }
}