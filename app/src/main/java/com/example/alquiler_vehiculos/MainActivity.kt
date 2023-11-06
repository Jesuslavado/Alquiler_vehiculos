package com.example.alquiler_vehiculos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.Adapter.AlertDialog
import com.example.alquiler_vehiculos.Adapter.VehiculosAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        val decoration=DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        setContentView(binding.root)

        binding.recicler.layoutManager=LinearLayoutManager(this)
        binding.recicler.adapter=VehiculosAdapter(VehiculosProvider.vehiculosList)

    }

}