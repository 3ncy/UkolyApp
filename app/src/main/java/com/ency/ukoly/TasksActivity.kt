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

        title="Add and Delete tasks"

        //display tasks from database
        showTasks()

        val addTaskBtn = findViewById<Button>(R.id.addTaskBtn)
        val tasksTL = findViewById<TableLayout>(R.id.tasksTL)
        val taskET = findViewById<EditText>(R.id.taskET)
        val nrOfShotsET = findViewById<EditText>(R.id.nrOfShotsET)

        //todo: backend for loading tasks

        addTaskBtn.setOnClickListener {

            //check jestli pocet panaku je vyplneny
            if (nrOfShotsET.text.toString().trim() == "") {
                Toast.makeText(
                    this,
                    "You have to fill in the number of shots!",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            //add task row
            val row = TableRow(this)
            row.gravity = Gravity.CENTER_VERTICAL
            row.setPadding(50,5,0,5)
            tasksTL.addView(row)


            val descText = TextView(this)
            descText.text = taskET.text.toString()
            row.addView(descText)
            val descParams = descText.layoutParams as TableRow.LayoutParams
            descParams.weight = 1f
            descParams.height = TableRow.LayoutParams.WRAP_CONTENT
//            descParams.setMargins(50, 0, 0, 40)
            descText.layoutParams = descParams


            val shotsText = TextView(this)
            shotsText.text = nrOfShotsET.text.toString()
            row.addView(shotsText)
            val shotsParams = shotsText.layoutParams as TableRow.LayoutParams
            shotsParams.weight = 0f
            shotsParams.setMargins(50, 0, 20, 0)
            shotsText.layoutParams = shotsParams


            val removeTaskButton =
                Button(this/*, null, R.style.Widget_AppCompat_Button_Borderless*/)
            removeTaskButton.text = "X"
            row.addView(removeTaskButton)
            val removeBtnParams = removeTaskButton.layoutParams as TableRow.LayoutParams
            removeBtnParams.setMargins(10, 0, 50, 0)
            removeBtnParams.weight = 0f
            removeTaskButton.layoutParams = removeBtnParams

            //todo: backend for adding tasks

            removeTaskButton.setOnClickListener {
                tasksTL.removeView(row)
                //todo: backend removing tasks
            }
        }
    }

    private fun showTasks() {

    }
}