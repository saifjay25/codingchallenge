package com.mycode.codingchallenge.ui

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.mycode.codingchallenge.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), Games.OnFragmentInteractionListener, Stats.OnFragmentInteractionListener {

    private lateinit var tr : FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        segmentedButtonGroup.setPosition(0,0)
        val game = Games()
        tr = supportFragmentManager.beginTransaction()
        tr.replace(R.id.games, game)
        tr.commit()

        segmentedButtonGroup.setOnClickedButtonListener {
            tr = supportFragmentManager.beginTransaction()
            if(it == 0){
                tr.hide(supportFragmentManager.findFragmentById(R.id.stats)!!)
                tr.show(supportFragmentManager.findFragmentById(R.id.games)!!)
                tr.commit()
            }else{
                val stats= Stats()
                tr = supportFragmentManager.beginTransaction()
                tr.replace(R.id.stats, stats)
                tr.hide(supportFragmentManager.findFragmentById(R.id.games)!!)
                tr.commit()
            }
        }
    }
    override fun onFragmentInteraction(uri: Uri) {}
}