package com.imie.madrental.adapter;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.imie.madrental.R;
import com.imie.madrental.Vehicule;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VehiculesAdapter extends RecyclerView.Adapter<VehiculeViewHolder>
{
    private List<Vehicule> listVehicules;

    // Constructor
    public VehiculesAdapter(List<Vehicule> listVehicules)
    {
        this.listVehicules = listVehicules;
        Log.d("tagTest", "VehiculesAdapter: " + listVehicules.size());
    }

    @Override
    public VehiculeViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View viewVehicule = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicule, parent, false);
        return new VehiculeViewHolder(viewVehicule);
    }

    @Override
    public void onBindViewHolder(VehiculeViewHolder holder, int position)
    {
        holder.vehiculeTxTView.setText(listVehicules.get(position).nom + "\n" +(int) listVehicules.get(position).prixjournalierbase +" €/Jour " + "\n" + "Catégorie CO2 : " +listVehicules.get(position).categorieco2);



       Log.d("imagecontrole",listVehicules.get(position).image);
        Picasso.with(holder.imagevehicule.getContext()).load("http://s519716619.onlinehome.fr/exchange/madrental/images/"+listVehicules.get(position).image).fit().centerCrop().into(holder.imagevehicule);

    }

    @Override
    public int getItemCount()
    {
        return listVehicules.size();
    }


}
