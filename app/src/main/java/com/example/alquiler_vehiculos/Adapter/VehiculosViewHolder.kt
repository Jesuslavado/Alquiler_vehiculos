package com.example.alquiler_vehiculos.Adapter
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class VehiculosViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding=ItemVehiculoBinding.bind(view)
    fun render(vehiculosmodel:Vehiculos)
    {
        binding.textView.text= vehiculosmodel.modelo
        binding.textView2.text=vehiculosmodel.num_plazas
        binding.textView3.text=vehiculosmodel.capacidad
        Glide.with(binding.bimagen.context).load(vehiculosmodel.photo).into(binding.bimagen)


    }
}