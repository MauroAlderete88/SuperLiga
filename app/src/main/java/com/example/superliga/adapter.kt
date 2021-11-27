package com.example.superliga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

/*
* Esta clase llamada adapter recibe por constructor un objeto lista con los objetos que se van a mostrar
* en el recycler. Ademas extienden Adapter.
* */

class adapter (val clubes : List<club>) :RecyclerView.Adapter<adapter.clubHolder>() {

// La extension adapter obliga a implementar 3 funciones necesarias para el manejo del recycler.


    //Se le muestra al recycler en que layout debe mostrarse , en este caso en el layout Item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): clubHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return clubHolder(layoutInflater.inflate(R.layout.item, parent, false))

    }


    //Se le muestra donde tiene que ir para renderizarse. En este caso en la funcion render de la clase
    //clubHolder instanciada al final.
    override fun onBindViewHolder(holder: clubHolder, position: Int) {
        holder.render(clubes[position])
    }

    //Se le muestra al recycler la cantidad de items que tiene la lista.
    override fun getItemCount(): Int = clubes.size




    //Esta clase lo que hace es instanciar los componentes xml en el codigo y posteriormente mostrarlos

    class clubHolder(view : View) : RecyclerView.ViewHolder(view){
        val imagen = view.findViewById(R.id.imagen_club) as? ImageView
        val nombrex = view.findViewById(R.id.nombre_club) as? TextView

        //Se le asigna a cada componente visual la variable que debe mostrar
        fun render(clubes: club){
            nombrex?.text = clubes.nombre //String en un textView
            Picasso.get().load(clubes.imagen).into(imagen) //URL en un imageView con picasso
        }
    }

}