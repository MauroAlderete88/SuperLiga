package com.example.superliga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



/*
*
* el orden que se tiene que seguir para que entiendas el flujo es :
*  1- Primero la data class club .
*  2- Despues el activity, en la linea 65 vas a tener que instanciar un adapter que no creaste aun.
*     En ese momento creas el adapter.
*  3 - Por ultimo terminas haciendo la clase adapter.
*
* Si seguis estos 3 pasos se te va a hacer sencillo seguir el codigo y la documentacion que explica
* el paso a paso.
* */

class MainActivity : AppCompatActivity() {

    //Se crea el listado de los items. Esto se hace en una lista de objetos club (dataclass)

    var clubes = listOf<club>(
        club("Talleres", "https://ssl.gstatic.com/onebox/media/sports/logos/MW12yOtJtAqfvt7JKt4iUg_48x48.png"),
        club("Lanus", "https://ssl.gstatic.com/onebox/media/sports/logos/FiqktuVwEcYAOZNp32H-OQ_48x48.png"),
        club("Independiente", "https://ssl.gstatic.com/onebox/media/sports/logos/YkuS0LD4UowC0MDzpKqZXw_48x48.png"),
        club("River Plate", "https://ssl.gstatic.com/onebox/media/sports/logos/700Mj6lUNkbBdvOVEbjC3g_48x48.png"),
       club("Racing", "https://ssl.gstatic.com/onebox/media/sports/logos/wi-J-3U7th2bpIB_Uy9Euw_48x48.png"),
        club("Estudiantes", "https://ssl.gstatic.com/onebox/media/sports/logos/nDfL4YLZSNWXZniXushVag_48x48.png"),
        club("Atletico Tucuman", "https://ssl.gstatic.com/onebox/media/sports/logos/3arLHe5K6lOpRpQhi2_WDQ_48x48.png"),
        club("Colon", "https://ssl.gstatic.com/onebox/media/sports/logos/YGkWVpsFb9FS1WRxl8ZdWg_48x48.png"),
        club("Boca Juniors", "https://ssl.gstatic.com/onebox/media/sports/logos/YO1impuFJT2hex6wvCd9Pw_48x48.png"),
        club("Velez", "https://ssl.gstatic.com/onebox/media/sports/logos/EG7pVKQAW2mvbnKsMoMbYA_48x48.png"),
        club("Defensa y Justicia", "https://ssl.gstatic.com/onebox/media/sports/logos/u9y68E7VuYQeNAVLB-8HBw_48x48.png"),
        club("Argentinos Junior", "https://ssl.gstatic.com/onebox/media/sports/logos/_Vs9SZ4f9XZbgLC2ee_GTA_48x48.png"),
        club("Godoy Cruz", "https://ssl.gstatic.com/onebox/media/sports/logos/8amyvPwO0h6V9D_U2NdG_g_48x48.png"),
        club("Patronato", "https://ssl.gstatic.com/onebox/media/sports/logos/uomxa4z3oGOtwEcHoAJdFQ_48x48.png"),
        club("Aldosivi", "https://ssl.gstatic.com/onebox/media/sports/logos/XRBWSDuC8J2bANaRlbvyHA_48x48.png"),
        club("Huracan", "https://ssl.gstatic.com/onebox/media/sports/logos/BXhsD_6yvgePrhCIeziDcA_48x48.png"),
        club("Newells", "https://ssl.gstatic.com/onebox/media/sports/logos/Lss4UJ_IL6ekpEzz1hYKug_48x48.png"),
        club("Union", "https://ssl.gstatic.com/onebox/media/sports/logos/2QDTzVrXBo6JHyEdqWj5Hw_48x48.png"),
        club("Sarmiento", "https://ssl.gstatic.com/onebox/media/sports/logos/tDd7ZfndQ-Z5PI3sOiBkNQ_48x48.png"),
        club("Rosario Central", "https://ssl.gstatic.com/onebox/media/sports/logos/z-n52o4GCyVOhf7N_VRMBw_48x48.png"),
        club("Platense", "https://ssl.gstatic.com/onebox/media/sports/logos/M5i5Qs9SCl8wGOmvMI7Giw_48x48.png"),
        club("Gimnasia", "https://ssl.gstatic.com/onebox/media/sports/logos/RjY9F3KQksU2z_ce3iE7dQ_48x48.png"),
        club("Banfield", "https://ssl.gstatic.com/onebox/media/sports/logos/lRUvM7_5xXHy2h9wohKZ9A_48x48.png"),
        club("Central Cordoba", "https://dimg-pa.googleapis.com/lg/CgYwMDAwMDA.png?sig=AI8nk_dGt7qwEVp9ek4ARNvpY1gz&key=AIzaSyCUqbG5Kw_8jb3cy2ZBKvV2kAi8z0qmQO0&sk=r7Evjfpq7nk&w=48&h=48"),
        club("Arsenal", "https://ssl.gstatic.com/onebox/media/sports/logos/7Q4qedU_pq59ZYez21HyMA_48x48.png"),
        club("San Lorenzo","https://ssl.gstatic.com/onebox/media/sports/logos/3guH9PUqsLcUw9o8VBhAlw_48x48.png")
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewClub = findViewById<RecyclerView>(R.id.recycler) //se instancia el recyclerView
        recyclerViewClub.layoutManager = LinearLayoutManager(this)
        val adapter = adapter(clubes) //Se instancia la clase adaptadora que tiene como parametro la variable lista de clubes creada arriba.
        recyclerViewClub.adapter = adapter


    }
}
