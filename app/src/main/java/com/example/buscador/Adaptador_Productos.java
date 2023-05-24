package com.example.buscador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador_Productos extends RecyclerView.Adapter<Adaptador_Productos.ViewHolder> {
    List<ProductosPlanilla> Product;
    LayoutInflater MiInflate;
    Context Datos;

    public Adaptador_Productos(List<ProductosPlanilla> product, Context datos) {
        Product = product;
        MiInflate = LayoutInflater.from(datos);
        Datos = datos;
    }

    @NonNull
    @Override
    public Adaptador_Productos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Observar = MiInflate.inflate(R.layout.planilla_productos,null);
        return new Adaptador_Productos.ViewHolder(Observar);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador_Productos.ViewHolder holder, int position) {
        holder.binData(Product.get(position));

    }

    @Override
    public int getItemCount() {
        return Product.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView FotoP;
        TextView NombreP, Pre_Pro, Canti_Pr, Valo_Prd, Desc_Prd;
        ViewHolder(View Info ){
            super(Info);
            FotoP = Info.findViewById(R.id.Imag_P);
            NombreP = Info.findViewById(R.id.Nom_P);
            Pre_Pro = Info.findViewById(R.id.Precio_P);
            Canti_Pr = Info.findViewById(R.id.Cant_Pro);
            Valo_Prd = Info.findViewById(R.id.Valorac_P);
            Desc_Prd = Info.findViewById(R.id.Descrip_P);
        }
        public void binData(final ProductosPlanilla Obtener){
            FotoP.setImageResource(Obtener.getVerFoto());
            NombreP.setText(Obtener.getNom());
            Pre_Pro.setText(Obtener.getPrec());
            Canti_Pr.setText(Obtener.getCant());
            Valo_Prd.setText(Obtener.getVal());
            Desc_Prd.setText(Obtener.getDes());
        }
    }
}
