package com.ency.ukoly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import android.widget.LinearLayout
import androidx.core.view.marginRight

class TasksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks)

        val addTaskBtn = findViewById<Button>(R.id.addTaskBtn)
        val tasksTL = findViewById<TableLayout>(R.id.tasksTL)
        val taskET = findViewById<EditText>(R.id.taskET)
        val nrOfShotsET = findViewById<EditText>(R.id.nrOfShotsET)


        addTaskBtn.setOnClickListener {
            //add task row

            val row = TableRow(this)
            row.gravity = Gravity.CENTER_HORIZONTAL

            val descText = TextView(this)
            descText.text = taskET.text.toString()
            row.addView(descText)

            val descParams = descText.layoutParams as TableRow.LayoutParams
            descParams.weight = 1f
            descParams.setMargins(50, 0, 0 , 20)
            descText.layoutParams = descParams

            val shotsText = TextView(this)
            shotsText.text = nrOfShotsET.text.toString()
            row.addView(shotsText)

            val shotsParams = shotsText.layoutParams as TableRow.LayoutParams
            shotsParams.weight = 0f
            shotsParams.setMargins(50, 0 ,0 ,50)
            shotsText.layoutParams = shotsParams


            val removeTaskButton = Button(this/*, null, R.style.Widget_AppCompat_Button_Borderless*/)
            removeTaskButton.text = "X"

            row.addView(removeTaskButton)

            val removeBtnParams = removeTaskButton.layoutParams as TableRow.LayoutParams
            removeBtnParams.setMargins(10,0,50,0)
            removeBtnParams.weight = 0f
            removeTaskButton.layoutParams = removeBtnParams



            removeTaskButton.setOnClickListener {
                tasksTL.removeView(row)
            }

            tasksTL.addView(row)
        }


    }
}