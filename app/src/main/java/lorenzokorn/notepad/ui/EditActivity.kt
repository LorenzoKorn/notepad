package lorenzokorn.notepad.ui

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_edit.*
import lorenzokorn.notepad.R

const val EXTRA_NOTE = "EXTRA_NOTE"

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        setSupportActionBar(toolbar)

        initViews()
    }

    private fun initViews() {
        fab.setOnClickListener {
            onSaveClick()
        }
    }

    private fun onSaveClick() {

    }
}
