package com.tainiko.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast



class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPopup(v : View){
        val popup: PopupMenu = PopupMenu(this, v)
        popup.setOnMenuItemClickListener(this)
        popup.inflate(R.menu.show_popup)
        popup.show()
    }
    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "Item1 clicked", Toast.LENGTH_SHORT).show()
                return false
            }

            R.id.item2 -> {
                Toast.makeText(this, "Item2 clicked", Toast.LENGTH_SHORT).show()
                return false
            }
            R.id.item3 -> {
                Toast.makeText(this, "Item3 clicked", Toast.LENGTH_SHORT).show()
                return false
            }
            R.id.item4 -> {
                Toast.makeText(this, "Item4 clicked", Toast.LENGTH_SHORT).show()
                return false
            }
            else -> return false
        }

    }
}
