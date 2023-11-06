package com.example.alquiler_vehiculos.Adapter

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class AlertDialog : DialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmacion"
            val content = "¿Quieres guardar los datos?"
            val builder: android.app.AlertDialog.Builder= android.app.AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->
                    //Callback para el ok
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    //Callback para el Cancel
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder
            return builder.create()} ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}