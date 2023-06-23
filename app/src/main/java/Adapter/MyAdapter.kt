package Adapter

import Models.Food
import android.content.Context
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.foodapp.R
import com.example.foodapp.databinding.ItemRvBinding

class MyAdapter(context: Context , val list: List<Food>):ArrayAdapter<Food>(context, R.layout.item_rv, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View
        if (convertView==null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent , false)
        }else{
            itemView = convertView
        }
        itemView.findViewById<TextView>(R.id.txt_name_item).text = list[position].name

        return itemView
    }
}