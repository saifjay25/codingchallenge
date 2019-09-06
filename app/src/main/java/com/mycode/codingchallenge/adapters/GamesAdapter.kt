package com.mycode.codingchallenge.adapters

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.RotateDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.mycode.codingchallenge.R
import com.mycode.codingchallenge.entities.BasketballData

class GamesAdapter(con: Context?, data: BasketballData): RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    private var context = con
    private var basketballData = data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v : View = LayoutInflater.from(context).inflate(R.layout.row_layout_games,parent,false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return basketballData.games.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        val teamNum = basketballData.games[position].awayID
        val awayTeam: String = basketballData.team.filter { it.id == teamNum }[0].name
        val teamNum2 = basketballData.games[position].homeID
        val homeTeam: String = basketballData.team.filter { it.id == teamNum2 }[0].name
        holder.awayTeam.text = awayTeam
        holder.homeTeam.text = homeTeam

        if (basketballData.gameStats[position].gameStatus == "SCHEDULED") {
            holder.awayScoreOrRecord.text = basketballData.team.filter { it.id ==teamNum }[0].record
            holder.awayScoreOrRecord.textSize = 14f
            holder.awayScoreOrRecord.setTextColor(context!!.resources.getColor(R.color.liteGray))
            holder.awayScoreOrRecord
            holder.homeScoreOrRecord.text = basketballData.team.filter { it.id ==teamNum2 }[0].record
            holder.homeScoreOrRecord.textSize = 14f
            holder.homeScoreOrRecord.setTextColor(context!!.resources.getColor(R.color.liteGray))
            holder.arrow1.isVisible = false
            holder.arrow2.isVisible = false
            holder.square.setBackgroundColor(context!!.resources.getColor(R.color.liteGray))
            holder.minuteOfFinal.text = basketballData.gameStats[position].gameStart
            holder.broadcast.text = basketballData.gameStats[position].broadcast
            holder.minuteOfFinal.setTextColor(context!!.resources.getColor(R.color.black))
            holder.broadcast.setTextColor(context!!.resources.getColor(R.color.black))
        }else{
            val awayScore = basketballData.gameStats.filter { it.gameID == basketballData.games[position].id }[0].awayScore
            holder.awayScoreOrRecord.text = awayScore
            val homeScore = basketballData.gameStats.filter { it.gameID == basketballData.games[position].id }[0].homeScore
            holder.homeScoreOrRecord.text = homeScore
            when {
                awayScore.toInt()>homeScore.toInt() -> {
                    val color= basketballData.team.filter { it.id==teamNum }[0].color
                    holder.square.setBackgroundColor(Color.parseColor(color))
                    val layers = holder.arrow1.background as LayerDrawable
                    val rotate = layers.findDrawableByLayerId(R.id.shape) as RotateDrawable
                    val gradient = rotate.drawable as GradientDrawable
                    gradient.setColor(Color.parseColor(color))
                    holder.arrow2.isVisible = false
                }
                homeScore.toInt()>awayScore.toInt() -> {
                    val color = basketballData.team.filter { it.id==teamNum2}[0].color
                    holder.square.setBackgroundColor(Color.parseColor(color))
                    val layers = holder.arrow2.background as LayerDrawable
                    val rotate = layers.findDrawableByLayerId(R.id.shape) as RotateDrawable
                    val gradient = rotate.drawable as GradientDrawable
                    gradient.setColor(Color.parseColor(color))
                    holder.arrow1.isVisible = false
                }
                else -> {
                    holder.arrow2.isVisible = false
                    holder.arrow1.isVisible = false
                    holder.square.setBackgroundColor(context!!.resources.getColor(R.color.liteGray))
                    holder.quarter.setTextColor(context!!.resources.getColor(R.color.black))
                    holder.minuteOfFinal.setTextColor(context!!.resources.getColor(R.color.black))
                    holder.broadcast.setTextColor(context!!.resources.getColor(R.color.black))
                }
            }
            if(basketballData.gameStats[position].gameStatus == "FINAL"){
                holder.minuteOfFinal.text = basketballData.gameStats[position].gameStatus
                holder.minuteOfFinal.textSize = 20f
            }else{
                holder.broadcast.text = basketballData.gameStats[position].broadcast
                holder.minuteOfFinal.text = basketballData.gameStats[position].timeLeft
                val num = basketballData.gameStats[position].quarter.toString()
                holder.quarter.text = ordinalNumber(num)
            }
        }
    }

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item){
        var items = item
        var awayTeam : TextView
        var homeTeam : TextView
        var awayScoreOrRecord : TextView
        var homeScoreOrRecord : TextView
        var square : TextView
        var arrow1 : TextView
        var arrow2 : TextView
        var quarter : TextView
        var minuteOfFinal : TextView
        var broadcast : TextView
        init{
            awayTeam = item.findViewById(R.id.team1)
            homeTeam = item.findViewById(R.id.team2)
            awayScoreOrRecord = item.findViewById(R.id.team1ScoreOrRecord)
            homeScoreOrRecord = item.findViewById(R.id.team2ScoreOrRecord)
            square = item.findViewById(R.id.square)
            arrow1 = item.findViewById(R.id.arrow1)
            arrow2 = item.findViewById(R.id.arrow2)
            quarter = item.findViewById(R.id.quarter)
            minuteOfFinal = item.findViewById(R.id.minuteOrFinal)
            broadcast = item.findViewById(R.id.broadcast)
        }

    }

    fun ordinalNumber(num : String) : String{
        var ordinal = ""
        if(num.toInt() == 1){
            ordinal = num+"st"
        }
        if(num.toInt() == 2){
            ordinal = num+"nd"
        }
        if(num.toInt() == 3){
            ordinal = num+"rd"
        }
        if(num.toInt() == 4){
            ordinal = num+"th"
        }
        return ordinal
    }
}