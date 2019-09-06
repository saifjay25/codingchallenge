package com.mycode.codingchallenge.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mycode.codingchallenge.R
import com.mycode.codingchallenge.entities.BasketballData
import com.mycode.codingchallenge.ui.Stats
import org.w3c.dom.Text

@Suppress("DEPRECATION")
class StatsAdapter(con: Context?, data: BasketballData): RecyclerView.Adapter<StatsAdapter.viewHolder>() {

    private var context = con
    private var stats = data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val v : View = LayoutInflater.from(context).inflate(R.layout.row_layout_stats,parent,false)
        return viewHolder(v)
    }

    override fun getItemCount(): Int {
        return stats.playerStats.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.nerd.text = stats.playerStats[position].nerd
        val teamNum = stats.players[position].teamID
        println(teamNum)
        holder.playerTeam.text = stats.players[position].name+" - "+stats.team.filter { it.id==teamNum }[0].abbrev
        holder.playerPoints.text = stats.playerStats[position].points+" Pts"+", "
        holder.playerStats.text = stats.playerStats[position].assists+" Ast"+", "+stats.playerStats[position].rebounds+" Reb"
    }

    inner class viewHolder(item: View) : RecyclerView.ViewHolder(item){
        var nerd: TextView
        var playerTeam : TextView
        var playerStats : TextView
        var playerPoints : TextView
        init{
            nerd = item.findViewById(R.id.nerd)
            playerTeam = item.findViewById(R.id.playerTeam)
            playerStats = item.findViewById(R.id.playerStats)
            playerPoints = item.findViewById(R.id.playerPoints)
        }
    }
}