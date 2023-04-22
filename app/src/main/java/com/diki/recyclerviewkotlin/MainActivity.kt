package com.diki.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),
            Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),Superhero(
                R.drawable.ant,
                "Ant-mant",
                "Ant-Man dan Tawon menemukan diri mereka menjelajahi Quantum Realm, berinteraksi dengan makhluk baru yang aneh dan memulai petualangan yang mendorong mereka melampaui batas dari apa yang mereka pikir mungkin."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}