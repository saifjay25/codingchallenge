package com.mycode.codingchallenge.ui

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mycode.codingchallenge.R
import com.mycode.codingchallenge.adapters.GamesAdapter
import com.mycode.codingchallenge.entities.BasketballData
import kotlinx.android.synthetic.main.fragment_games.*
import kotlinx.android.synthetic.main.row_layout_games.*


class Games : Fragment(){

    private lateinit var viewModel: MainViewModel
    private var listener: OnFragmentInteractionListener? = null
    private lateinit var adapter: GamesAdapter
    private lateinit var recycl: RecyclerView
    private lateinit var  allData : BasketballData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        allData = viewModel.getData()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_games, container, false)
        recycl = view.findViewById(R.id.recyclerViewGames)
        return view
    }

    override fun onStart() {
        super.onStart()
        recycl.setHasFixedSize(true)
        recycl.layoutManager = LinearLayoutManager(activity!!.applicationContext)
        adapter = GamesAdapter(activity!!.applicationContext, allData)
        recycl.adapter = adapter
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

}
