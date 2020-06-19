package com.imie.madrental.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.imie.madrental.DetailVehiculeActivity;
import com.imie.madrental.R;

public class VehiculeViewHolder extends RecyclerView.ViewHolder
{
    public TextView vehiculeTxTView;
    public ImageView imagevehicule;
    public VehiculeViewHolder(@NonNull View itemView)
    {


        super(itemView);
        vehiculeTxTView = itemView.findViewById(R.id.vehiculeTxTView);
         imagevehicule = itemView.findViewById(R.id.imagevehicule);

        // listener :
        itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // récupération du context depuis une vue :
                Context context = view.getContext();

                // affichage du toast :
                Toast.makeText(context, "Début de l'activité", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(view.getContext(), DetailVehiculeActivity.class);
                context.startActivity(intent);



            }
        });
    }


}
